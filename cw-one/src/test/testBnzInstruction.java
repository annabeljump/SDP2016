package src.test;

import org.junit.Before;
import org.junit.Test;

import src.BnzInstruction;

/**
 * Tests for DivInstruction.
 * @author Annabel Jump
 */
public class testBnzInstruction {

    @Before
    public void setup() {
        BnzInstruction testee = new BnzInstruction("L1", 3, "L4");
    }

    @Test
    public void testFields() {
        BnzInstruction testee = new BnzInstruction("L1", 3, "L4");
        assert(testee.getRegister() == 3);
        assert(testee.getValue().equals("L4"));
        assert(testee.getLabel().equals("L1"));
    }

}
