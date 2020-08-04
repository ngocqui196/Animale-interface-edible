import animal.*;
import fruit.*;
import edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal i: animals) {
            System.out.println(i.makeSound());
            if (i instanceof Chicken){
                Edible edible = (Chicken) i;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
