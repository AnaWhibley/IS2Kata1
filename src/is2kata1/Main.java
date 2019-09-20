package is2kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person ana = new Person("Ana", LocalDate.of(1997,3,10));
        System.out.println(ana.getName() + " is " + ana.getAge() + " years old");

        Person jose = new Person("Jose", LocalDate.of(1963,9,23));
        System.out.println(jose.getName() + " is " + jose.getAge() + " years old");

        Person pedro = new Person("Pedro", LocalDate.of(1991,7,1));
        System.out.println(pedro.getName() + " is " + pedro.getAge() + " years old");
    }
}
