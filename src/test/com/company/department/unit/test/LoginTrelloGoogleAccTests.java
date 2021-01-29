package test.com.company.department.unit.test;

import org.testng.annotations.Test;

public class LoginTrelloGoogleAccTests extends TestBase {

    @Test

    public void atlassianLoginTest() throws InterruptedException {
        app.startLogin();
        app.fillLoginForm("rochman.elena@gmail.com", "12345.com");
        app.confirmLogin();
    }

    @Test(enabled = false)


    public void testLogin() {
        app.startLogin();
        app.clickLoginWithGoogle();
        app.authorizeGoogle("gulchin1212@gmail.com");

    }

}
