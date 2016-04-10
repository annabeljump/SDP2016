package src.test;

import org.junit.Before;
import org.junit.Test;

import src.AddInstruction;

/**
 * Tests for AddInstruction.
 * @author Annabel Jump
 */
public class testAddInstruction {

    @Before
    public void setup() {
        AddInstruction testee = new AddInstruction("L1", 0, 3, 4);
    }

    @Test
    public void testFields() {
        AddInstruction testee = new AddInstruction("L1", 0, 3, 4);
        assert(testee.getOp1() == 3);
        assert(testee.getOp2() == 4);
        assert(testee.getLabel().equals("L1"));
    }

}
