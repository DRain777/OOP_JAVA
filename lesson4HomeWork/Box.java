package lesson4HomeWork;

import java.util.ArrayList;
import java.util.List;

//public class Box /*<T>*/ /* FIXME Исправлять тут! {

// Нужно реализовать хранение фрукто в коробке Box

/*   public void add(Object fruit) {
       // FIXME: 21.02.2023 Написать логику сохранения
       throw new UnsupportedOperationException();
   }

   public double getWeight() {
       // FIXME: 21.02.2023
       throw new UnsupportedOperationException();
   }

  

}
*/
public class Box<T extends Fruit > {
    

    List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void moveTo(Box<T> anotherBox) {
        // FIXME: 21.02.2023
        throw new UnsupportedOperationException();
    }

  
}
