package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginGoogleWebmotorsPage extends CommonsBasePage {

	WebDriverWait wait;
	Actions builder;


	public LoginGoogleWebmotorsPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}


	public void validaJanelaDeLoginGoogle() {
		assertTrue("Login com email e senha google", wait.until(ExpectedConditions.numberOfWindowsToBe(2)));
	}

}
