/*
 * Базовый класс от которого идет наследование в обратном порядке
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Name: %s, surname: %s, age: %d", name, surname, age);
    }
}
