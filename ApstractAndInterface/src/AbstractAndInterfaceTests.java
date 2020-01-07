import Animal.*;
import Fruits.*;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Fruits[] fruits = new Fruits[4];
        fruits[0]= new Tiger();
        fruits[1]=new Chicken();
        fruits[2]=new Apple();
        fruits[3]=new Orange();
        for (Fruits fruit:fruits
             ) {
            if (fruit instanceof Animal){
                System.out.println(((Animal)fruit).makeSound());
            }
            if (fruit instanceof Orange||fruit instanceof Apple){
                System.out.println(fruit.howToEat());
            }
        }
        Animal ani = new Animal() {
            @Override
            public String howToEat() {
                return null;
            }

            @Override
            public String makeSound() {
                return null;
            }
        };
        System.out.println(ani.a+" "+ani.makeSound()+ani.howToEat());
    }
}
