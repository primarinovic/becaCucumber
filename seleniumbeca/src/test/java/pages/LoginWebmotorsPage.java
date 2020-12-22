package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginWebmotorsPage extends CommonsBasePage {

    WebDriverWait wait;
    Actions builder;

    public LoginWebmotorsPage() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }


    public void validaUrlPerfil() {
        assertTrue("URL não contém garagem", wait.until(ExpectedConditions.urlContains("garagem")));
    }
}
