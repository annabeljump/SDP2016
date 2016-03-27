package src;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 * Modified by
 * @author Annabel Jump
 */
public class Translator {

    private static final String PATH = "/home/annabel/Documents/SDP/AJPortfolio/SDP2016/cw-one/";
    // word + line is the part of the current line that's not yet processed
    // word has no whitespace
    // If word and line are not empty, line begins with whitespace
    private String line = "";
    private Labels labels; // The labels of the program being translated
    private ArrayList<Instruction> program; // The program to be created
    private String fileName; // source file of SML code

    public Translator(String fileName) {
        this.fileName = PATH + fileName;
    }

    // translate the small program in the file into lab (the labels) and
    // prog (the program)
    // return "no errors were detected"
    public boolean readAndTranslate(Labels lab, ArrayList<Instruction> prog) {

        try (Scanner sc = new Scanner(new File(fileName))) {
            // Scanner attached to the file chosen by the user
            labels = lab;
            labels.reset();
            program = prog;
            program.clear();

            try {
                line = sc.nextLine();
            } catch (NoSuchElementException ioE) {
                return false;
            }

            // Each iteration processes line and reads the next line into line
            while (line != null) {
                // Store the label in label
                String label = scan();

                if (label.length() > 0) {
                    Instruction ins = getInstruction(label);
                    if (ins != null) {
                        labels.addLabel(label);
                        program.add(ins);
                    }
                }

                try {
                    line = sc.nextLine();
                } catch (NoSuchElementException ioE) {
                    return false;
                }
            }
        } catch (IOException ioE) {
            System.out.println("File: IO error " + ioE.getMessage());
            System.exit(-1);
            return false;
        }
        return true;
    }

    // line should consist of an MML instruction, with its label already
    // removed. Translate line into an instruction with label label
    // and return the instruction
    public Instruction getInstruction(String label) {
        int s1; // Possible operands of the instruction
        int s2;
        int r;
        String x;

        if (line.equals(""))
            return null;

        String ins = scan();

        //Now turn first scanned word "add", "lin" etc into "Add", "Lin", etc
        String firstLetter = ins.substring(0, 1).toUpperCase();
        String operation = firstLetter + ins.substring(1);

        //Now prefix the operation to "Instruction"
        //Now this will be the name of the subclass of Instruction (eg AddInstruction)
        //***** any subsequent additions to subclasses will need to adhere to naming convention!!*****
        operation = operation + "Instruction";


        //Now get the class with the name in the operation string
        try {
            Class currentInstruction = Class.forName(operation);
            Instruction reflectedClass = null;

            //get the constructor for the new class - there is more than 1!
            Constructor[] constructorParameters = currentInstruction.getConstructors();


            //there should be 2 constructors for each function - 1st is just label, op
            //second should be constructor for specific function
            //this is a bit messy - what if later functions have more than 1 constructor??
            //take the second constructor, and use to instantiate class

            Class[] actualConstructor = constructorParameters[1].getParameterTypes();

            if (actualConstructor.length == 1){
                r = scanInt();
                reflectedClass = (Instruction)currentInstruction.getConstructor(String.class, int.class)
                        .newInstance(ins, r);
                return reflectedClass;
            } else if (actualConstructor.length == 2 && actualConstructor[1] == int.class){
                r = scanInt();
                s1 = scanInt();
                reflectedClass = (Instruction)currentInstruction.getConstructor(String.class, int.class, int.class)
                        .newInstance(ins, r, s1);
                return reflectedClass;
            } else if (actualConstructor.length == 2 && actualConstructor[1] == String.class){
                r = scanInt();
                x = scan();
                reflectedClass = (Instruction)currentInstruction.getConstructor(String.class, int.class, String.class)
                        .newInstance(ins, r, x);
                return reflectedClass;
            } else if (actualConstructor.length == 3) {
                r = scanInt();
                s1 = scanInt();
                s2 = scanInt();
                reflectedClass = (Instruction)currentInstruction.getConstructor(String.class, int.class, int.class, int.class)
                        .newInstance(ins, r, s1, s2);
                return reflectedClass;
            } else {
                System.out.println("Uh-oh, invalid operation requested!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        //switch (ins) {
          //  case "add":
          //      r = scanInt();
          //      s1 = scanInt();
          //      s2 = scanInt();
          //      return new AddInstruction(label, r, s1, s2);
          //  case "lin":
          //      r = scanInt();
          //      s1 = scanInt();
          //      return new LinInstruction(label, r, s1);
          //  case "sub":
          //      r = scanInt();
          //      s1 = scanInt();
          //      s2 = scanInt();
          //      return new SubInstruction(label, r, s1, s2);
          //  case "mul":
          //      r = scanInt();
          //      s1 = scanInt();
          //      s2 = scanInt();
          //      return new MulInstruction(label, r, s1, s2);
          //  case "div":
          //      r = scanInt();
          //      s1 = scanInt();
          //      s2 = scanInt();
          //      return new DivInstruction(label, r, s1, s2);
          //  case "out":
          //      r = scanInt();
          //      return new OutInstruction(label, r);
          //  case "bnz":
          //      r = scanInt();
          //      x = scan();
          //      return new BnzInstruction(label, r, x);

        //}

        // You will have to write code here for the other instructions.

        return null;
    }

    /*
     * Return the first word of line and remove it from line. If there is no
     * word, return ""
     */
    private String scan() {
        line = line.trim();
        if (line.length() == 0)
            return "";

        int i = 0;
        while (i < line.length() && line.charAt(i) != ' ' && line.charAt(i) != '\t') {
            i = i + 1;
        }
        String word = line.substring(0, i);
        line = line.substring(i);
        return word;
    }

    // Return the first word of line as an integer. If there is
    // any error, return the maximum int
    private int scanInt() {
        String word = scan();
        if (word.length() == 0) {
            return Integer.MAX_VALUE;
        }

        try {
            return Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }
}