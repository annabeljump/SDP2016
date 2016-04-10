package src.test;

import org.junit.Before;
import org.junit.Test;

import src.LinInstruction;

/**
 * Tests for DivInstruction.
 * @author Annabel Jump
 */
public class testLinInstruction {

    @Before
    public void setup() {
        LinInstruction testee = new LinInstruction("L1", 3, 2);
    }

    @Test
    public void testFields() {
        LinInstruction testee = new LinInstruction("L1", 3, 2);
        assert(testee.getRegister() == 3);
        assert(testee.getValue() == 2);
        assert(testee.getLabel().equals("L1"));
    }

}
