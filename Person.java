import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    String name;
    int age;
    String Add;
    String dob;

    public Person(String name, int age, String add, String dob) {
        this.name = name;
        this.age = age;
        this.Add = add;
        this.dob = dob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of person");
        int n = scanner.nextInt();
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            scanner.nextLine();
            int age = scanner.nextInt();
            String add = scanner.next();
            scanner.nextLine();
            String dob = scanner.next();
            scanner.nextLine();
            Person person = new Person(name,age, add, dob);
            personList.add(person);
        }
        System.out.println(personList);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Add='" + Add + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}

