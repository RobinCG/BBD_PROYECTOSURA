package Pages;

import org.junit.Test;

/**
 * Created by equipo on 11/11/2017.
 */

public class UtilPageTest {

    @Test()
    public void test1() throws Exception {
        UtilPage.getInstanSingleUtilPage().openUrl();
    }

    @Test
    public void test2() throws Exception {
        UtilPage.getInstanSingleUtilPage().exitGmail();
    }



}