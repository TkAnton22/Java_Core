public class Member {
    String name;
    String teamName;
    int age;
    int runSpeed;
    int swimSpeed;
    double jumpAlt;

    public Member(String name, String teamName, int age, int runSpeed, int swimSpeed, double jumpAlt){
        this.name = name;
        this.teamName = teamName;
        this.age = age;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.jumpAlt = jumpAlt;
    }
    public void info() {
        System.out.println(name + " " + teamName + " " + age + " " + runSpeed + " " + swimSpeed + " " + jumpAlt);
    }

}
