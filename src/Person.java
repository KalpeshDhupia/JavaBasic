public abstract class Person {
    public String name;
    public  int age;
    public abstract void setName(String name);
    public abstract void setAge(int age);
     public void printDetails(){
         System.out.println(name);
         System.out.println(age);
     }
}
