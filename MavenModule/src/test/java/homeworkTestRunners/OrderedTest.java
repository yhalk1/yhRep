package homeworkTestRunners;

import org.testng.annotations.Test;

public class OrderedTest {

    @Test(priority = 4)
    public void test4(){
        System.out.println("Boom!!!");
    }

    @Test(priority = 3)
    public void test3(){
        System.out.println("1");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("2");
    }
    @Test(priority = 1)
    public void test1(){
        System.out.println("3");
    }
}
