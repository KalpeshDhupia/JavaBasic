public class Ram extends Person{
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Ram ram = new Ram();
        ram.setName("Ram");
        ram.setAge(40);
        ram.printDetails();
    }
}
