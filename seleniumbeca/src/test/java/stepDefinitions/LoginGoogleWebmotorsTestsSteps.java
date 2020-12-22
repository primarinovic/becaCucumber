package stepDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pages.LoginGoogleWebmotorsPage;

public class LoginGoogleWebmotorsTestsSteps {

	LoginGoogleWebmotorsPage loginWebmotors = new LoginGoogleWebmotorsPage();

	@Quando("eu clico em Entrar com Google")
	public void clicarBotaoGoogle() {
		loginWebmotors.clicarElemento(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[4]/div/button[2]"));

	}

	@Entao("uma nova janela para login abre")
	public void abreJanelaLoginGoogle() {
		loginWebmotors.validaJanelaDeLoginGoogle();
	}


}

