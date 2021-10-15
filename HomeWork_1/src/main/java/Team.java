public class Team {
    String name;
    Member[] members;

    public Team(String nameTeam, Member[] membersTeam) {
        name = nameTeam;
        members = membersTeam;
    }

    public void courseComplete() {
        for (Member member : members) {
            if (member.isFinished) {
                System.out.println(member.name + " успешно прошел полосу!");
            }
        }
    }

    public void getAllMembers() {
        System.out.println("Данные всех учестников команды:");
        for (Member member : members) {
            System.out.println("Имя: " + member.name + " Скорость бега: " + member.runSpeed + "км/ч Скорость плавания: " + member.swimSpeed + "км/ч Высота прыжка: " + member.jumpAlt + "м");
        }
    }
}