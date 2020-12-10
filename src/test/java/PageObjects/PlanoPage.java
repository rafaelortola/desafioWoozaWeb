package PageObjects;

import Enums.OperadoraEnum;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.fail;

public class PlanoPage extends BasePage {

    public PlanoPage(WebDriver navegador) {
        super(navegador);
    }

    public PlanoPage acessaOperadora(String operadora) {
        if (operadora.toUpperCase().contains(OperadoraEnum.OPERADORACLARO.getDescricao())) {
            if (OperadoraEnum.OPERADORACLARO.getCod().equals(1)) {
                System.out.println("Operadora selecionada: " + operadora);
            }
        } else if (operadora.toUpperCase().contains(OperadoraEnum.OPERADORAOI.getDescricao())) {
            if (OperadoraEnum.OPERADORAOI.getCod().equals(2)) {
                System.out.println("Operadora selecionada: " + operadora);
            } else if (operadora.toUpperCase().contains(OperadoraEnum.OPERADORAVIVO.getDescricao())) {
                if (OperadoraEnum.OPERADORAVIVO.getCod().equals(3)) {
                    System.out.println("Operadora selecionada: " + operadora);
                } else if (operadora.toUpperCase().contains(OperadoraEnum.OPERADORATIM.getDescricao())) {
                    if (OperadoraEnum.OPERADORATIM.getCod().equals(4)) {
                        System.out.println("Operadora selecionada: " + operadora);
                    } else {
                        fail("Operadora não encontrada: " + operadora);
                    }

                }
            }
        }
        return this;
    }

    public PlanoPage informarQuantidade(String quantidade) throws InterruptedException {

        int quantidadeFinal = Integer.parseInt(quantidade);
        Thread.sleep(5000);
        String totalPlanos = String.valueOf(navegador.findElement(By.xpath("/html/body/div[5]/wza-vrj-mobile-plan-comparison/main/header/mpc-top-bar/div/div/div[1]/span")).getText());
        Integer tot;
        if (quantidadeFinal >= 10){
            tot = Integer.valueOf(totalPlanos.substring(0,2));
        }
        else {
            tot = Integer.valueOf(totalPlanos.substring(0,1));
        }

        System.out.println("Total de Planos encontrado: " + tot);
        for (int i = 1; i < quantidadeFinal+1; i++) {
            if (quantidadeFinal == tot) {
                String box = String.valueOf(navegador.findElement(By.xpath("/html/body/div[5]/wza-vrj-mobile-plan-comparison/main/div/section/div[" + i + "]")));
                String pegaTamanhoDoPlanoEscolhido = navegador.findElement(By.xpath("/html/body/div[5]/wza-vrj-mobile-plan-comparison/main/div/section/div[" + i + "]/mpc-card-plan/section/div[1]/div[2]/span")).getText();
                String pegaTipoDoPlano = navegador.findElement(By.xpath("/html/body/div[5]/wza-vrj-mobile-plan-comparison/main/div/section/div[" + i + "]/mpc-card-plan/section/div[1]/div[2]/h4")).getText();
                String pegaPrecoDoPlano = navegador.findElement(By.xpath("/html/body/div[5]/wza-vrj-mobile-plan-comparison/main/div/section/div[" + i + "]/mpc-card-plan/section/div[1]/div[3]/div/div")).getText();
                String armazenaValorFinal = String.valueOf(i);
                System.out.println("Opção: " + armazenaValorFinal);
                System.out.println("Plano: " + pegaTipoDoPlano);
                System.out.println("Tamanho: " + pegaTamanhoDoPlanoEscolhido);
                System.out.println("Preço: " + pegaPrecoDoPlano.replaceAll("\n", ""));
                System.out.println("-----------------------------------------------------");
            }
            else {
                fail("Quantidade Inválida! " + quantidadeFinal);
            }
        }
        return this;
    }

}






