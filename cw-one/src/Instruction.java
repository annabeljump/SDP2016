package src;

/**
 * This class is the superclass of the classes for machine instructions
 * (now edited)
 * @author someone
 */

public abstract class Instruction {
    protected String label;
    protected String opcode;


    // Constructor: an instruction with label l and opcode op
    // (op must be an operation of the language)
    //*****now takes all possible arguments for instructions*****

    public Instruction(String l, String op) {
        this.label = l;
        this.opcode = op;

    }

    // = the representation "label: opcode" of this Instruction

    @Override
    public String toString() {
        return label + ": " + opcode;
    }

    // Execute this instruction on machine m.

    public abstract void execute(Machine m);
}

