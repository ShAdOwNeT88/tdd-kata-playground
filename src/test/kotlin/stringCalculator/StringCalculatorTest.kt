package stringCalculator

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertTrue

class StringCalculatorTest {

    private val sc: StringCalculator = StringCalculator()

    @Test
    fun `test if input is not null`() {
        val actual = sc.add("")
        val expected = 0
        assertTrue(actual == expected)
    }

    @Test
    fun `test with input not null result is not 0`() {
        val actual = sc.add("1")
        assertTrue(actual != 0)
    }

    @Test
    fun `test if sum can handle all the numbers in input`(){
        val actual = sc.add("1,2")
        val expected = 3
        assertTrue(actual == expected)
    }

    @Test
    fun `test split with two numbers`(){
        val actual = sc.split("1,2")
        println("Actual Result$actual")
        val expected = listOf(1,2)

        assertTrue(actual == expected)
    }

    @Test
    fun `test split with three numbers`(){
        val actual = sc.split("1,2,3")
        println("Actual Result$actual")
        val expected = listOf(1,2,3)

        assertTrue(actual == expected)
    }

    @Test
    fun `test sum with 10 numbers`(){
        val actual = sc.add("1,2,3,4,5,6,7,8,9,10")
        println("Operation Result: $actual")
        val expected = 55
        assertTrue(actual == expected)
    }

    @Test
    fun `test sum with 20 numbers`(){
        val actual = sc.add("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20")
        println("Operation Result: $actual")
        val expected = 210
        assertTrue(actual == expected)
    }
}