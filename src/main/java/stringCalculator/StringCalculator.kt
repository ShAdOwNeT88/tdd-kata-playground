package stringCalculator

class StringCalculator {

    fun add(numbers: String): String {
        return if (numbers == "")
            "0"
        else numbers
    }
}