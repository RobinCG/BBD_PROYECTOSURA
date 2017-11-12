package Pages;

import org.junit.Test;

/**
 * Created by equipo on 11/11/2017.
 */
public class GmailPageTest {
    GooglePage gpage= new GooglePage();
    String user = "suramydream1@gmail.com";
    String pass = "suramydream";

    @Test
    public void test1() throws Exception {
       gpage.openGmail();
    }

    @Test
    public void test2() throws Exception {
      gpage.enterUser(user);
    }

    @Test
    public void test3() throws Exception {
       gpage.enterPass(pass);
    }
}