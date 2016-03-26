package src;

/**
 * This class is the superclass of the classes for machine instructions
 * (As of this commit, unedited from Keith's repo)
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

