import org.openqa.selenium.WebDriver;

public class Main {

    enum Browser {FireFox,Chrome,IE}

    public static final String TableTestPage = "file:" + System.getProperty("user.dir") + "/src/AutomationTest.html";

    public static void main(String[] args) {
        //Select which browser to user here
        Browser browser = Browser.Chrome;

        //This method will return a WebDriver for the Browser selected Above. It does not set any properties for the WebDriver or anthing else
        WebDriver driver = DriverFactory.getNewDriver(browser);

        System.out.println("Hello world!");

        //Before doing any work please run the project to make sure the page launches as is.
        //Create a Method to get the page using the url in TableTestPage

    }

}