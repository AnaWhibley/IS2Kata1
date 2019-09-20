package is2kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1997,3,10);

        Person ana = new Person("Ana", date);
        System.out.println(ana.getName() + " is " + ana.getAge() + " years old");
    }
}
