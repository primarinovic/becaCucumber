package stepDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.AlterarDadosDeUsuarioTelefonePage;

public class AlterarDadosDeUsuarioTelefoneTestSteps {

	AlterarDadosDeUsuarioTelefonePage alterarDados = new  AlterarDadosDeUsuarioTelefonePage();
	
	@E ("altero o Telefone Principal")
	public void alteraTel() {
		alterarDados.alterarTel("11985741113");
	}

	@Então("a página recarrega com o telefone atualizado")
	public void validarDado(){
		alterarDados.validarTel();
	}

}
