package stepDefinitions;
import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import pages.*;

public class AlterarDadosDeUsuarioGeneroTestSteps {

	AlterarDadosDeUsuarioGeneroPage alterarDados = new  AlterarDadosDeUsuarioGeneroPage();
	
	@Dado("que eu faço login na página Webmotors")
	public void login(){
		alterarDados.fazerLogin();
	}

	@Quando("navego até Editar Perfil")
	public void irAteEdicaoDePerfil() {
		alterarDados.navegarAteEditarPerfil();
	}

	@E("altero Sexo Masculino para Feminino")
	public void alterarSexo() {
		alterarDados.alterarGenero();
	}

	@E("clico em Salvar Alterações")
	public void clicarSalvar() {
		alterarDados.clicarElemento(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[2]/div[7]/div/button"));
	}

	@Então("a página recarrega com o dado atualizado")
	public void verificarAlteracao() {
		alterarDados.validarAlteracao();

	}

}
