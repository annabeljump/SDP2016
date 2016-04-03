import java.io.*;

/**
 * Question: If you want to direct output to System.out instead of to a file,
 * you can create a Writer object that directs its output to System.out: [Example]
 *
 * Write a code example to define a Writer object that wraps text at 15 characters,
 * centres the text, sets the text to random casing, and directs the output to System.out.
 * Which design pattern are you using?
 *
 * This Answer:
 * @author Annabel Jump
 */

// This must be a Decorator design pattern - each class adds things to the base Writer class
    //All "decorated" classes in this file.

public class Question11 {

    //Here is our basic Writer
    Writer out = new PrintWriter(System.out);

    //A class that would wrap the text at 15 characters (see below)
    WrapText wrapped = new WrapText(out, 15);

    Writer newOut = new PrintWriter(wrapped.getWrappedText());

    //Now change the case of the text to random with a new class
    CaseFilter filtered = new CaseFilter(newOut);

    Writer randomOut = new PrintWriter(filtered.getOutput());

    //Now centre text
    CentreText middle = new CentreText(randomOut);

    Writer finishedFormatting = new PrintWriter(middle.getCentred());

    //Text wrapper (won't actually wrap text)
    public class WrapText {
        private Writer stuff;
        private int x;

        public WrapText(Writer i, int o){
            this.stuff = i;
            this.x = o;
            this.stuff = wrapThat(stuff, x);
        }

        public Writer wrapThat(Writer a, int b){
            //method to wrap the text at the specified number of characters goes here
            Writer c = new PrintWriter(a);
            return c;
        }

        public Writer getWrappedText(){
            return this.stuff;
        }
    }

    public class CaseFilter {
        //Case filtering stuff here
        public void getOutput(){
            //Stuff (would return a Writer)
        }
    }

    public class CentreText {
        //Text centering stuff here
        public void getCentred(){
            //Stuff (would return a Writer)
        }
    }
}
