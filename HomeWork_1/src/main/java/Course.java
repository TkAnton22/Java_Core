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
    boolean goCourse(int runSpeed, int swimSpeed, double jumpAlt, boolean isFinished) {
        if (distanceRun / runTime <= runSpeed && distanceSwim / swimTime <= swimSpeed && altitudeJump <= jumpAlt) {
            return isFinished;
        } else {
            return !isFinished;
        }
    }
}
