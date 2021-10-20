public class Team {
    String name;
    Member[] members;

    public Team(String nameTeam, Member[] membersTeam) {
        name = nameTeam;
        members = membersTeam;
    }
    public void courseComplete() {
        System.out.println("Список прошедших полосу: \n");
        for (Member member : members) {
            if (member.isFinished) {
                System.out.println(member.getName() + " успешно прошел полосу!");
            }
        }
    }
    public void getAllMembers() {
        System.out.println("Данные всех учестников команды:\n");
        for (Member member : members) {
            System.out.println("Имя: " + member.getName() + " Скорость бега: " + member.getRunSpeed() + "км/ч Скорость плавания: " + member.getSwimSpeed() + "км/ч Высота прыжка: " + member.getJumpAlt() + "м");
        }
    }
}