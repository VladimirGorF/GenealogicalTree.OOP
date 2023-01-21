import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.type.TypeKind;

public class Family {
    private List<Person> family = new ArrayList<>();

    public Family() {
        family = new ArrayList<Person>();
    }

    public List<Person> getFamily() {
        return family;
    }

    public void addPerson(Person person) {
        family.add(person);
    }

    public void getDescendant(String name) { // потомки
        System.out.printf("Потомки %s:", name);
        System.out.println();
        int check = 0;
        for (Person person : family) { // проверка на наличие имени
            if (person.getName().equals(name)) {
                check = 1;
            }
        }
        if (check == 1) { // если имя есть, то уходим в поиск наследников в семье
            for (Person pe : family) {
                if (pe.getName().equals(name)) {
                    for (Person pers : family) {
                        if (pers.equals(pe)) {
                            continue;
                        } else {
                            if (pers.getClass().isAssignableFrom(pe.getClass())) {
                                System.out.println(pers);
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("No matches!"); // еcли имени нет в древе
        }
    }

    public void getAncentry(String name) { // предки
        System.out.printf("Предки %s:", name);
        System.out.println();
        int check = 0;
        for (Person person : family) { // проверка на наличие имени
            if (person.getName().equals(name)) {
                check = 1;
            }
        }
        if (check == 1) { // если имя есть, то уходим в поиск предков в семье
            for (Person pe : family) {
                if (pe.getName().equals(name)) {
                    for (Person pers : family) {
                        if (pers.equals(pe)) {
                            continue;
                        } else {
                            if (pe.getClass().isAssignableFrom(pers.getClass())) {
                                System.out.println(pers);
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("No matches!"); // еcли имени нет в древе
        }
    }
}
