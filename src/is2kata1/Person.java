package is2kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    private final double DAYS_PER_YEAR = 365.25;
    private final int HOURS_PER_DAY = 24;
    private final int MINUTES_PER_HOUR = 60;
    private final int SECONDS_PER_MINUTES = 60;
    private final int MILISECONDS_PER_SECONDS = 1000;

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public int getAge() {
        return calculateAge(getBirthday());
    }

    private int calculateAge(Calendar birthday) {
        Calendar today = GregorianCalendar.getInstance();
        return (int) (millisecondsToYears(today.getTimeInMillis())- millisecondsToYears(birthday.getTimeInMillis()));
    }

    private long calculateMillisecondsPerYear() {
        return (long) DAYS_PER_YEAR*HOURS_PER_DAY*MINUTES_PER_HOUR*SECONDS_PER_MINUTES*MILISECONDS_PER_SECONDS;
    }

    private long millisecondsToYears(long milliseconds) {
        return milliseconds / calculateMillisecondsPerYear();
    }
}
