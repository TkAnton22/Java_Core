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
    Course course = new Course(10, 55, 2, 60, 1.7);

}
