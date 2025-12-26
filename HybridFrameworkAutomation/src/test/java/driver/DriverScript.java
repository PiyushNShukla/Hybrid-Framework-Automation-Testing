package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ibm.keywords.LoginKeywords;
import com.ibm.keywords.NavigationKeywords;

import utils.ExcelReader;

public class DriverScript {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");

        NavigationKeywords nav = new NavigationKeywords(driver);
        LoginKeywords login = new LoginKeywords(driver);
        

        ExcelReader.loadExcel();

        for (int i = 1; i <= ExcelReader.getRowCount(); i++) {

            String keyword = ExcelReader.getKeyword(i);
            String data = ExcelReader.getTestData(i);

            switch (keyword) {

//                case "GoToHome":
//                    nav.GoToHome();
//                    break;

                case "GoToPractice":
                    nav.GoToPractice();
                    break;
                    
                case "GoToTestLoginPage":
                	nav.GoToTestLoginPage();
                	break;
               

                case "LoginWithInvalidCredentials":
                    login.LoginWithInvalidCredentials(data);
                    break;
                    
                case "LoginWithValidCredentials":
                    login.LoginWithValidCredentials(data);
                    break;
                default:
                    System.out.println("Unknown keyword: " + keyword);
            }
        }

        driver.quit();
    }
}

