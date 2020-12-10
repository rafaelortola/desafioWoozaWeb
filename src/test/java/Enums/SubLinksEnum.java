package Enums;

public enum SubLinksEnum {

    CLARO(1, "CLARO"),
    OI(2, "OI"),
    VIVO(3, "VIVO"),
    TIM(4, "TIM"),
    CONSULTESUACOBERTURA(6,"CONSULTE SUA COBERTURA"),
    TESTEDEVELOCIDADE(7,"TESTE DE VELOCIDADE"),
    PLANOSDEBANDALARGA(8,"PLANOS DE BANDA LARGA"),
    OPERADORASCLARO(9,"CLARO"),
    OPERADORASOI(10,"OI"),
    OPERADORASVIVO(11,"VIVO"),
    OPERADORASTIM(12,"TIM"),
    OPERADORASSKY(13,"SKY"),
    OPERADORASCLARONET(14,"NET"),
    OPERADORASPREDIALNET(15,"PREDIAL"),
    COMBOCLARO(16,"COMBOCLARO"),
    COMBOSKY(17, "COMBOSKY");

    private Integer cod;
    private String descricao;

    SubLinksEnum(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
