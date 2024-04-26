package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiApplicationTests {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    void testThat1InputHandledCorrectly() {
        Assertions.assertEquals(1, calc.sum(1));
    }

    @Test
    void testThat3InputHandledCorrectly() {
        Assertions.assertEquals(6, calc.sum(3));
    }

    @Test
    void testThat100InputHandledCorrectly() {
        Assertions.assertEquals(5050, calc.sum(100));
    }

    @Test
    void testThatNegativeInputHandledCorrectly() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calc.sum(-1)
        );
    }

    @Test
    void testThat0InputHandledCorrectly() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calc.sum(0)
        );
    }

}
