public class Person {
    private String name;
    private int age;
    private double salary;
    private boolean isAlone;

    Person(String name, double salary, int age, boolean isAlone) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.isAlone = isAlone;
    }

    int getAge() {
        return age + 2;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
