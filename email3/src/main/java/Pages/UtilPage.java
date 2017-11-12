package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilPage {

    private WebDriver chromedriver;
    private static UtilPage utilPage;

    private UtilPage(){
        System.setProperty("web.driver.chromedriver", System.getProperty("user.dir")+ "\\chromedriver.exe");
        chromedriver = new ChromeDriver();
    }
    public static UtilPage getInstanSingleUtilPage()
    {

        if (utilPage==null){
            utilPage = new UtilPage();
        }else{return utilPage;}
        return utilPage;
    }

    public WebDriver getDriver(){return chromedriver;}

    public void openUrl() {chromedriver.get("http://www.gmail.com");
    }

    public void exitGmail(){chromedriver.quit();}
    }

