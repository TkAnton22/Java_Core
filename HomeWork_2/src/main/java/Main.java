public class Main {
    /**
     * author Anton Tkachev
     * HomeWork 2 JavaCore GB
     * 20/10/21
     */
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




