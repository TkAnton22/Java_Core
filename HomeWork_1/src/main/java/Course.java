public class Course {
    int distanceRun;
    int runTime;
    int distanceSwim;
    int swimTime;
    double altitudeJump;

    public Course(int distanceRun,int runTime, int distanceSwim, int swimTime, double altitudeJump) {
        this.distanceRun = distanceRun;
        this.runTime = runTime;
        this.distanceSwim = distanceSwim;
        this.swimTime = swimTime;
        this.altitudeJump = altitudeJump;
    }
    public void doIt(Team t) {
        for (Member member : t.members) {
            goCourse(member);
        }
    }
    public void goCourse(Member m) {
        m.isFinished = this.distanceRun / this.runTime <= m.getRunSpeed() && this.distanceSwim / this.swimTime <= m.getSwimSpeed() && this.altitudeJump <= m.getJumpAlt();
    }
}