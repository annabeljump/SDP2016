package src.test;

import org.junit.Before;
import org.junit.Test;

import src.SubInstruction;

/**
 * Tests for DivInstruction.
 * @author Annabel Jump
 */
public class testSubInstruction {

    @Before
    public void setup() {
        SubInstruction testee = new SubInstruction("L1", 0, 3, 4);
    }

    @Test
    public void testFields() {
        SubInstruction testee = new SubInstruction("L1", 0, 3, 4);
        assert(testee.getOp1() == 3);
        assert(testee.getOp2() == 4);
        assert(testee.getLabel().equals("L1"));
    }

}

