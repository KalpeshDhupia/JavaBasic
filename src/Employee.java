import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private  int age;
    private String dob;
    double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee( String dob, double salary) {
        this.dob = dob;
        this.salary = salary;
    }

    public Employee(String name, int age, String dob, double salary) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee =new Employee("kalpesh",22);
        Employee employee1 = new Employee("07.06.1997",10000.02);
        List<Employee>employees = new ArrayList<>();
        employees.add(new Employee("ram",22,"09.15.1999",10005.3));
        employees.add(new Employee("shyam",22,"09.15.1999",100005.3));
        employees.add(new Employee("ram",22,"09.15.1999",10005.3));
        //System.out.println(employee.getName() + " "+ employee.getAge());
       // System.out.println(employee1.getDob() + " "+employee1.getSalary());
        System.out.println(employees);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", salary=" + salary +
                '}';
    }
}
