import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRunner {


    @BeforeClass
    public void setup(){
        System.out.println("Setup ");
    }

    @AfterClass
    public void teardown(){
        System.out.println(" Teardown");
    }

    @Test
    public void testNg() throws InterruptedException {

        System.out.println("Test ");
    }


}
