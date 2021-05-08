package io.github.zregvart.junit.github;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class FailingTest {

    @Test
    void willFail() {
        assertFalse(true); // test
    }
}
