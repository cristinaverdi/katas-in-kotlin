fun main(args: Array<String>) {
    val leapYear = LeapYear()

    var year = 1997
    var capitalize = leapYear.isLeapYear(year).toString().capitalize()
    println("Is $year a leap year?: $capitalize")

    year = 1996
    val result =  leapYear.isLeapYear(year)
    println("Is $year a leap year?: $result")
}
