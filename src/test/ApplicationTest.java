package test;

import static org.junit.Assert.assertThat;

import main.StringCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ApplicationTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void calculateTest() {
        assertThat()
        assertThat(stringCalculator.calculate("1,2,3")).isEqualTo(6);
    }
}
