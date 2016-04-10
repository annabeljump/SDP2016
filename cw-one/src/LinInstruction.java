package src;

/**
 * This class ....
 * As of this first commit, copied straight from Keith's repo
 * @author someone
 */

public class LinInstruction extends Instruction {
    private int register;
    private int value;

    public LinInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public LinInstruction(String label, int register, int value) {
        super(label, "lin");
        this.register = register;
        this.value = value;

    }

    public String getLabel() {
        return this.label;
    }

    public Integer getRegister() {
        return this.register;
    }

    public Integer getValue() {
        return this.value;
    }

    @Override
    public void execute(Machine m) {
        m.getRegisters().setRegister(register, value);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is " + value;
    }
}

