public class Program {
    public static void main(String[] args) {

        Family family1  = new Family();
        family1.addPerson(new Person("Vladimir", "Gorbunov", 41));
        family1.addPerson(new Mother("Raisa", "Gorbunova", 69));
        family1.addPerson(new Father("Fedor", "Gorbunov", 69));
        family1.addPerson(new Mm("Olga", "Nemova", 99));
        family1.addPerson(new Mp("Anna", "Gorbunova", 87));
        family1.addPerson(new Pm("Grigory", "Nemov", 100));
        family1.addPerson(new Pp("Stepan", "Gorbunov", 101));

        family1.getDescendant("Raisa");
        System.out.println("---------------------------------------");
        family1.getAncentry("Fedor");
    }
}
