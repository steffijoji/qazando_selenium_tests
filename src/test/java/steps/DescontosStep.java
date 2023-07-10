package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
//import io.cucumber.java.pt.Dado;
//import io.cucumber.java.pt.Entao;
//import io.cucumber.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;


public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);


    @Dado("^que estou no site da Qazando$")
    public void acessar_site_qazando(){
        homePage.acessarAplicacao();
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencherEmail("teste@email.com");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws InterruptedException {
        homePage.clickGanharDesconto();
    }

    @Entao("^eu vejo o código de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        homePage.verificarCupomDesconto("QAZANDO15OFF");
    }
}
