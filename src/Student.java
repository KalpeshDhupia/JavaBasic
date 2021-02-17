import java.util.ArrayList;
import java.util.List;

public class Student {
   private String name;
    private int age;
    private int roll_no;

    public Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public static void main(String[] args) {
        Student student = new Student("Kalpesh",22,7);
        List<Student> students = new ArrayList<>();
        students.add(new Student("sai",10,56));
        students.add(new Student("raj",10,56));
        students.add(new Student("sam",10,56));
       System.out.println(students);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll_no=" + roll_no +
                '}';
    }
}

