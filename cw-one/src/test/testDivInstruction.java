package src.test;

import org.junit.Before;
import org.junit.Test;

import src.DivInstruction;

/**
 * Tests for DivInstruction.
 * @author Annabel Jump
 */
public class testDivInstruction {

    @Before
    public void setup() {
        DivInstruction testee = new DivInstruction("L1", 0, 3, 4);
    }

    @Test
    public void testFields() {
        DivInstruction testee = new DivInstruction("L1", 0, 3, 4);
        assert(testee.getOp1() == 3);
        assert(testee.getOp2() == 4);
        assert(testee.getLabel().equals("L1"));
    }

}
