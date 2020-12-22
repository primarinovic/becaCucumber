package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

import static org.junit.Assert.assertTrue;

public class PesquisaPage extends CommonsBasePage {
	
	private static final CharSequence VolkswagenUp = null;
	WebDriverWait wait;
	Actions builder;
	
	WebElement pesquisar;
		
	public PesquisaPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void acessarPaginaInicial() {
		navegarAteSite("https://www.webmotors.com.br/");
	}

	public void inserirPesquisa() {
		preencherTextoElemento(By.xpath("//*[@id=\"searchBar\"]"), "Volkswagen Up");
	}

	public void validaUrlPerfil() {
		assertTrue("Url não contem volkswagen", wait.until(ExpectedConditions.urlContains("volkswagen")));
	}
}
