package stringCalculator

class StringCalculator {

    fun add(numbers: String): Int {
        var sum = 0

        if (numbers.isNotEmpty()) {
            val obtainedNumbers = split(numbers)
            obtainedNumbers.forEach { number ->
                sum += number
            }
        }
        return sum
    }

    fun split(numbers: String): List<Int> {
        val convertedNumbers = ArrayList<Int>()

        numbers.split(",").listIterator().forEach { number ->
            convertedNumbers.add(Integer.parseInt(number))
        }

        return convertedNumbers
    }
}