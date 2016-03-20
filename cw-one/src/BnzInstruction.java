package src;

/**
 * Created by annabel on 20/03/16.
 */
public class BnzInstruction extends Instruction {
    private int register;
    private String nextInst;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String value) {
        super(label, "bnz");
        this.register = register;
        this.nextInst = value;

    }

    @Override
    public void execute(Machine m) {

    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
