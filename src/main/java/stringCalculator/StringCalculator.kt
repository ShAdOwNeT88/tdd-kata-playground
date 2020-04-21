package stringCalculator

class StringCalculator {

    fun add(numbers: String): Int {
        return if (numbers == "")
            0
        else {
            var sum = 0
            val obtainedNumbers = split(numbers)
            obtainedNumbers.forEach { number ->
                sum += number
            }
            return sum
        }
    }

    fun split(numbers: String): List<Int> {
        val convertedNumbers = ArrayList<Int>()
        numbers.split(",").listIterator().forEach { number -> convertedNumbers.add(Integer.parseInt(number)) }

        return convertedNumbers
    }
}