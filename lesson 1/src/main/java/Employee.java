import java.util.Objects;
public abstract class Employee {
    String name;
    private double salary;
    private int age;
    String hobby;
    private Position position;
    private static int countOfWorkers = 0;
    public Employee(String name, double salary, int age, String hobby) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.hobby = hobby;
        countOfWorkers++;
    }
    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        countOfWorkers++;
    }
    public void info() {
        System.out.println(name + ", " + salary + " RUB, " + age + " y.o, " + hobby + " " + position);
    }
    public abstract double getBonus();
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public static int getCountOfWorkers() {
        return countOfWorkers;
    }
    @Override
    public String toString(){
        return name + " " + hobby;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(hobby, employee.hobby) && position == employee.position;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, salary, age, hobby, position);
    }
}
enum Position {
    SALESMAN,
    ENGINEER
}