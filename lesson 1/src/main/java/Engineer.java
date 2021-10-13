public class Engineer extends Employee implements BonusSystem{
    public Engineer(String name, double salary, int age, String hobby) {
        super(name, salary, age, hobby);
        setPosition(Position.ENGINEER);
    }
    public Engineer(String name, double salary, int age) {
        super(name, salary, age);
        setHobby("none");
        setPosition(Position.ENGINEER);
    }
    public double getBonus(){
        return getSalary() * 1.2;
    }
    @Override
    public double getBonusLoyalty() {
        return 0;
    }
    @Override
    public double getBonusForProductive() {
        return 0;
    }
}