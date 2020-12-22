package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class ValidarMeusAnunciosPage extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;


    public ValidarMeusAnunciosPage() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void acessarMeusAnuncios() {
        clicarElemento(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]"));
        clicarElemento(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]/div[2]/ul/li[2]"));

        List<String> abas = new ArrayList<>(_Driver().getWindowHandles());
        _Driver().switchTo().window(abas.get(1));
    }

    public void mapearMeusAnuncios() {

        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Meus Anúncios"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Ativos"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Inativos"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Incompletos"));
        assertTrue("Não existem os elementos", _Driver().getPageSource().contains("Anuncie seu veículo"));

    }
}
