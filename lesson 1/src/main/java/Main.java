public class Main {
    public static void main(String[] args) {
        Employee engineer1 = new Engineer("Vasya Pupkin", 50_314.01, 45);
        Employee salesman1 = new Salesman("Petya Zalupkin", 45_203.02, 40, "football");
        Employee engineer2 = new Engineer("Dima Tutkin", 34_945.15, 50, "painting");
        Employee salesman2 = new Salesman("Ivan Dudkin", 50_994.12, 35, "hockey");
        Employee engineer3 = new Engineer("Maxim Kartoshkin", 52_345.63, 65, "cats");
        Employee salesman3 = new Salesman("Slava Morkovmin", 44_567.75, 47, "polo");
        Employee engineer4 = new Engineer("Vasya Pupkin", 50_314.01, 45);
        Employee salesman4 = new Salesman("Andrey Kapustin", 40_643.16, 43, "gaysex");
        engineer1.info();
        salesman1.info();
        salesman3.info();
        System.out.println("total number of workers: " + (Employee.getCountOfWorkers()));
        System.out.println(salesman4.toString());
        System.out.println(engineer1.equals(engineer2));
        System.out.println(engineer1.equals(engineer4));
    }
}