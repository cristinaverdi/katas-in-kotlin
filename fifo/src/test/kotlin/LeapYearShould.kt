import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

internal class LeapYearShould {

    @Test fun be_divisible_by_4() {
        var leapYear = LeapYear()

        val result = leapYear.isLeapYear(4)
        assertThat(result, `is`(equalTo(true)))
    }


    @Test fun identify_not_leap_year_when_not_divisible_by_4() {
        var leapYear = LeapYear()

        val notLeapYear = leapYear.isLeapYear(1)
        assertThat(notLeapYear, `is`(equalTo(false)))
    }

    @Test fun identify_not_leap_year_when_divisible_by_100_but_not_by_400() {
        var leapYear = LeapYear()

        val notLeapYear = leapYear.isLeapYear(100)
        assertThat(notLeapYear, `is`(equalTo(false)))
    }

    @Test fun be_divisible_by_400() {
        val leapYear = LeapYear()

        val result = leapYear.isLeapYear(400)
        assertThat(result , `is`(equalTo(true)))
    }
}