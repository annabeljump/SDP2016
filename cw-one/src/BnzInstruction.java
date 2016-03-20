package src;

/**
 * Bnz instruction to change the order of lines executed
 * @author Annabel Jump
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
        //TODO
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
