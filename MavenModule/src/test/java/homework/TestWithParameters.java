package homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameters {

    @Parameters({"param1","param2","param3"})
    @Test
    public void paramTest (String p1, String p2, String p3 ){
        System.out.println("\""+ p1+ " " + p2 +p3+"\" " );
    }

    @Test(dataProvider ="getData")
    public void testWithDateProvider(String p1, String p2, String p3 ){
        System.out.println("Italian. Lesson1: "+ p1+p2+p3);
    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"Ciao! ", "Come ti ", "chiama?"},
                {"Hi! ", "What is ", "your name"},
                {"Ciao! ", "Mi chiamo ", "Giuseppe"},
                {"Hi! ", "My name is ", "John Bon Jovi"}
        };
    }
}
