package Homework04;

public class AbstractClass {

    public static void main (String[] args){

        FlyingBird fb1 = new FlyingBird();
        System.out.println("Bird is saying: " + fb1.toString());
        System.out.println("Bird is saying: " + fb1.canFly());

        NonFlyingBird nfb1 = new NonFlyingBird();
        System.out.println("Bird is saying: " + nfb1.toString());
        System.out.println("Bird is saying: " + nfb1.cannotFly());

        Eagle eagle = new Eagle();
        System.out.println("Bird is saying: " + eagle.toString());
        System.out.println("Bird is saying: " + eagle.eagleGreetings());

        Swallow swallow = new Swallow();
        System.out.println("Bird is saying: " + swallow.toString());
        System.out.println("Bird is saying: " + swallow.swallowGreetings());

        Penguin penguin = new Penguin();
        System.out.println("Bird is saying: " + penguin.toString());
        System.out.println("Bird is saying: " + penguin.penguinGreetings());

        Kiwi kiwi = new Kiwi();
        System.out.println("Bird is saying: " + kiwi.toString());
        System.out.println("Bird is saying: " + kiwi.kiwiGreetings());

    }
}
