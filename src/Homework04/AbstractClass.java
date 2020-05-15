package Homework04;

public class AbstractClass {

    public static void main (String[] args){

        FlyingBird fb1 = new FlyingBird();
        System.out.println("Bird is saying: " + fb1.toString());

        NonFlyingBird nfb1 = new NonFlyingBird();
        System.out.println("Bird is saying: " + nfb1.toString());

        Eagl eagl = new Eagl();
        System.out.println("Bird is saying: " + eagl.toString());

        Swallow swallow = new Swallow();
        System.out.println("Bird is saying: " + swallow.toString());

        Penguin penguin = new Penguin();
        System.out.println("Bird is saying: " + penguin.toString());

        Kiwi kiwi = new Kiwi();
        System.out.println("Bird is saying: " + kiwi.toString());

    }
}
