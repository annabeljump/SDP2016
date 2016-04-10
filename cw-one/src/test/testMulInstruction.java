package src.test;

import org.junit.Before;
import org.junit.Test;

import src.MulInstruction;

/**
 * Tests for DivInstruction.
 * @author Annabel Jump
 */
public class testMulInstruction {

    @Before
    public void setup() {
        MulInstruction testee = new MulInstruction("L1", 0, 3, 4);
    }

    @Test
    public void testFields() {
        MulInstruction testee = new MulInstruction("L1", 0, 3, 4);
        assert(testee.getOp1() == 3);
        assert(testee.getOp2() == 4);
        assert(testee.getLabel().equals("L1"));
    }

}
