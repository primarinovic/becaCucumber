package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ValidarMeusAnunciosPage extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;


    public void ValidarMeusAnunciosPage() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void acessarMeusAnuncios() {
        clicarElemento(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]"));
        clicarElemento(By.xpath("/html/body/div[1]/header/nav/div/ul/li[5]/div[2]/ul/li[2]"));
    }

    public void mapearMeusAnuncios() {
        String[] elementosMeusAnuncios = {"Meus Anúncios", "Ativos", "Inativos", "Incompletos",
                "Anuncie seu veículo"};

        for (String elemento : elementosMeusAnuncios) {
            _Driver().getPageSource().contains(elemento);

        }
    }
}
