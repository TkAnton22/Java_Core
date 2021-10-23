public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arr2 = new String[][]{
                {"1", "2", "3", "4"},
                {"2", "3", "4", "1"},
                {"3", "4", "i", "2"},
                {"4", "1", "2", "3"}
        };
        String[][] arr3 = new String[][]{
                {"1", "2", "3", "4"},
                {"2", "3", "4", "1"},
                {"3", "4", "1", "2"},
                {"4", "1", "2", "3"}
        };
        String[][] arr4 = new String[][]{
                {"1", "2", "3", "4"},
                {"2", "3", "4", "1"},
                {"3", "4", "1", "2"},
                {"4", "1", "2"}
        };
        try {
            System.out.println("Сумма всех элементов массива: " + Parse.pars(arr3));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма всех элементов массива: " + Parse.pars(arr2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма всех элементов массива: " + Parse.pars(arr4));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}




/*         Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr1 = new int[a][b];
        int counter = 1;
        if (a != 4 || b != 4){
            throw new MyArraySizeException("Массив может иметь размер только 4х4");
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                arr1[i][j] = counter;
                counter++;
            }
        }*/
/*    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }*/