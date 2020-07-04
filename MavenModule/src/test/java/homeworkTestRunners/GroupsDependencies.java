package homeworkTestRunners;

import org.testng.annotations.Test;

public class GroupsDependencies {

    @Test (groups = "dependancy1")
    public void dependGroup1() {
        System.out.println("Rule #1 - Wake up");
    }
    @Test (groups = "dependancy1")
    public void dependGroup2() {
        System.out.println("Rule #2 - Brush your teeth");
        //  Assert.fail("OOPs failed...");
    }

    @Test (dependsOnGroups = {"dependancy1","setup/teardown"})
    public void dependOnGroup(){
        System.out.println("Depends on group");
    }
    @Test (enabled = false)
    public void ignoredTest(){
        System.out.println("Ignored Test");
    }
    @Test (groups = "setup/teardown")
    public void setup(){
        System.out.println("Setup");
    }
    @Test (groups = "setup/teardown")
    public void teardown(){
        System.out.println("Teardown");
      //  Assert.fail("OOPs failed...");
    }

    }

