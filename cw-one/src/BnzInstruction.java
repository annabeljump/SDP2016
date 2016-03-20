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
        if (m.getRegisters().getRegister(register) != 0){
            //make the instruction with label == nextInst execute next
            //labels are given indexes
            //PC decides which next instruction to execute...

        }
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
