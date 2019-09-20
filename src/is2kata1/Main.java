package is2kata1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person ana = new Person("Ana", new Date(97,2,10));  // 10 de marzo del 97
        System.out.println(ana.getName() + " is " + ana.getAge() + " years old");


    }
}
