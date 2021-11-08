import java.util.Arrays;
/**
 * author Anton Tkachev
 *  HomeWork3 GB JavaCore
 *  23/10/21
 */
public class Main {
    public static void main(String[] args) {

        Box<Apple, String> box1 = new Box<>("Коробка с яблоками ");
        Box<Orange, String> box2 = new Box<>("Коробка с апельсинами");
        Box<Orange, String> box3 = new Box<>("Новая коробка");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        box1.addFruitToBox(apple1);
        box1.addFruitToBox(apple2);
        box1.addFruitToBox(apple3);
        box1.addFruitToBox(apple4);

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        box2.addFruitToBox(orange1);
        box2.addFruitToBox(orange2);
        box2.addFruitToBox(orange3);
        box2.addFruitToBox(orange4);
        box2.addFruitToBox(orange5);

        System.out.println("Вес коробки с яблоками: " + box1.getBoxWeight());
        System.out.println("Вес коробки с апельсинами: " + box2.getBoxWeight());

        box1.compare(box2);
        box2.compare(box1);

        box2.transfer(box3);
        System.out.println("Вес новой коробки с апельсинами: " + box3.getBoxWeight());
        // System.out.println(box2.getBoxWeight()); //не работает
        // System.out.println(box3.compare(box2));  //не работает

        int[] intArr = new int[]{1, 2, 3, 4, 5, 6};
        change(intArr);
        System.out.println("Метод, который меняет элементы массива местами: " + Arrays.toString(intArr));
    }
    public static void change(int[] intArr) {
        int x;
        for (int i = 0; i < intArr.length/2; i++) {
            x = intArr[intArr.length - i - 1];
            intArr[intArr.length - i - 1] = intArr[i];
            intArr[i] = x;
        }
    }
}

