package is2kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private final double DAYS_PER_YEAR = 365.25;
    private final int HOURS_PER_DAY = 24;
    private final int MINUTES_PER_HOUR = 60;
    private final int SECONDS_PER_MINUTES = 60;
    private final int MILISECONDS_PER_SECONDS = 1000;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return calculateAge(getBirthday());
    }

    private int calculateAge(Date birthday) {
        return (int) ((new Date().getTime() - birthday.getTime()) / calculateMiliseconds());
    }

    private double calculateMiliseconds() {
        return DAYS_PER_YEAR*HOURS_PER_DAY*MINUTES_PER_HOUR*SECONDS_PER_MINUTES*MILISECONDS_PER_SECONDS;
    }

}
