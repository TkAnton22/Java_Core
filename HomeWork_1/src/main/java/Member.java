public class Member {

    private String name;
    private int runSpeed;
    private int swimSpeed;
    private double jumpAlt;
    boolean isFinished;

    public Member(String name, int runSpeed, int swimSpeed, double jumpAlt, boolean isFinished){
        setName(name);
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.jumpAlt = jumpAlt;
        this.isFinished = isFinished;
    }
    public void singleMemberInfo() {
        System.out.println("Данные одного участника:\nИмя: " + getName() + " Скорость бега: " + runSpeed + "км/ч Скорость плавания: " + swimSpeed + "км/ч Высота прыжка: " + jumpAlt + "м\n");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public void setJumpAlt(double jumpAlt) {
        this.jumpAlt = jumpAlt;
    }

    public double getJumpAlt() {
        return jumpAlt;
    }
}