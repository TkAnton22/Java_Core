import java.util.ArrayList;
public class Box<T extends Fruit, S>{

    ArrayList<T> fruitType;
    S name;
    public Box(S name){
        fruitType = new ArrayList<T>();
        this.name = name;
    }

    public S getName() {
        return name;
    }
    public void addFruitToBox(T t){
        fruitType.add(t);
    }
    public double getBoxWeight() {
        return fruitType.get(0).getWeight() * fruitType.size();
    }

    public void compare(Box<?, ?> box) { // можно было сделать чере булевый метод, как мы делали на занятии, но я сделал вот так
        if (this.getBoxWeight() > box.getBoxWeight()) {
            System.out.println(this.getName() + " весит больше, чем  " + box.getName() );
        } else {
            System.out.println(this.getName() + " весит меньше, чем  " + box.getName() );
        }
    }

    public void removeAllFruit() {
        fruitType.clear();
    }
    public void transfer(Box<? super T, ?> box) {
        box.fruitType.addAll(this.fruitType);
        removeAllFruit();
    }
}
