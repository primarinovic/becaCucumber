package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginInvalidoWebmotorsPage extends CommonsBasePage {

    WebDriverWait wait;
    Actions builder;


    public LoginInvalidoWebmotorsPage() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }


}
