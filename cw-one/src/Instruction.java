package src;

/**
 * This class is the superclass of the classes for machine instructions
 * (now edited)
 * @author someone
 */

public abstract class Instruction {
    protected String label;
    protected String opcode;
    protected int operator1;
    protected int operator2;
    protected int register;


    // Constructor: an instruction with label l and opcode op
    // (op must be an operation of the language)
    //*****now takes all possible arguments for instructions*****

    public Instruction(String l, String op, int r, int s1, int s2) {
        this.label = l;
        this.opcode = op;
        this.register = r;
        this.operator1 = s1;
        this.operator2 = s2;
    }

    // = the representation "label: opcode" of this Instruction

    @Override
    public String toString() {
        return label + ": " + opcode;
    }

    // Execute this instruction on machine m.

    public abstract void execute(Machine m);
}

