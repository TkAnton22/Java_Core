public class Member {
    String name;
    int runSpeed;
    int swimSpeed;
    double jumpAlt;
    boolean isFinished;

    public Member(String name, int runSpeed, int swimSpeed, double jumpAlt, boolean isFinished){
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.jumpAlt = jumpAlt;
        this.isFinished = isFinished;
    }
    public void singleMemberInfo() {
        System.out.println("Данные одного участника:\nИмя: " + name + " Скорость бега: " + runSpeed + "км/ч Скорость плавания: " + swimSpeed + "км/ч Высота прыжка: " + jumpAlt + "м\n");
    }

}
