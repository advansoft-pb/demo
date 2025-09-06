package pl.advansoft.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StackTest {

    private static final String VALUE_A = "abcd";
    private static final String VALUE_B = "xyz";

    private final Stack<String> stack = new Stack<>();

    @Test
    void testNewStack() {
        assertNull(stack.get());
    }

    @Test
    void testSingleStack() {
        stack.put(VALUE_A);
        assertEquals(VALUE_A, stack.get());
        assertNull(stack.get());
    }

    @Test
    void testMultipleStack() {
        stack.put(VALUE_A);
        stack.put(VALUE_B);
        assertEquals(VALUE_B, stack.get());
        assertEquals(VALUE_A, stack.get());
        assertNull(stack.get());
    }
}
