package day61_exceptions_collections;

public class ElementaryStudents {
    private String name;
    private int age;

    public ElementaryStudents(){}

    public ElementaryStudents(String name, int age) {
       setName(name);
       setAge(age);
    }

    @Override
    public String toString() {
        return "ElementaryStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       //check if name is null
        if(name ==null||name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        if(age<5 || age>12){
            throw new IllegalArgumentException("Age cannot be <6 or > 12");

        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
