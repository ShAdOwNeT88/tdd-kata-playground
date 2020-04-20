package stringCalculator

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertTrue

class StringCalculatorTest {

    @Test
    fun `test if input is not null`() {
        val actual = StringCalculator().add("")
        val expected = "0"
        assertTrue(actual == expected)
    }

    @Test
    fun `test with input not null result is not 0`() {
        val actual = StringCalculator().add("1")
        assertTrue(!actual.contains("0"))
    }
}