public class Salesman extends Employee implements BonusSystem, PenaltySystem {
    public Salesman(String name, double salary, int age, String hobby) {
        super(name, salary, age, hobby);
        setPosition(Position.SALESMAN);
    }
    public Salesman(String name, double salary, int age) {
        super(name, salary, age);
        setPosition(Position.SALESMAN);
    }
    public double getBonus() {
        return getSalary() * 2;
    }
    @Override
    public double getBonusLoyalty() {
        return 0;
    }
    @Override
    public double getBonusForProductive() {
        return 0;
    }
    @Override
    public double givePenalty() {
        return 0;
    }
}