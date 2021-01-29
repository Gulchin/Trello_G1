package test.com.company.department.unit.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected ApplicaitonManager app = new ApplicaitonManager();

    @BeforeMethod

      public void setUp(){

        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        app.stop();
    }

}
