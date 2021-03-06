package src;

/**
 * Class for the Subtraction instructions of the SML interpreter
 * Same as "Add" instruction but with the subtraction...
 * @author Annabel Jump
 */
public class SubInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;

    public SubInstruction(String label, String op) {
        super(label, op);
    }

    public SubInstruction(String label, int result, int op1, int op2) {
        this(label, "sub");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    public String getLabel() {
        return this.label;
    }

    public Integer getOp1() {
        return this.op1;
    }

    public Integer getOp2() {
        return this.op2;
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " + " + op2 + " to " + result;
    }
}
