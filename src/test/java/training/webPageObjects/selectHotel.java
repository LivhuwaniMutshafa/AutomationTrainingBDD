package training.webPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class selectHotel {

    protected WebDriver driver;
    public selectHotel(WebDriver driver) {
          this.driver=driver;

        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 10), this);
    }

    @FindBy(xpath ="//*[@id=\"radiobutton_0\"]")
    //*[@id="radiobutton_0"]
    public WebElement radioButton;
    //*[@id="radiobutton_0"]


    @FindBy(xpath = "//*[@id=\"continue\"]")
    public  WebElement contin;
}
