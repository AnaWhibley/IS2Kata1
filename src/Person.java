import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
}
