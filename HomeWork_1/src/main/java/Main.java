public class Main {
    public static void main(String[] args) {
        Course course = new Course(10, 1, 2, 1, 1.7);

        Member[] fourPlayers = new Member[4];

        fourPlayers[0] = new Member("Вася",12, 2, 1.7, false);
        fourPlayers[1] = new Member("Петя",11, 2, 1.9, false);
        fourPlayers[2] = new Member("Миша",13, 1, 1.8, false);
        fourPlayers[3] = new Member("Дима",12, 2, 1.6, false);

        Team red_whiteTeam = new Team("Red-White", fourPlayers);
        red_whiteTeam.getAllMembers();
        course.doIt(red_whiteTeam);
        red_whiteTeam.courseComplete();
    }
}