package Enums;

public enum OperadoraEnum {

    OPERADORACLARO(1, "CLARO"),
    OPERADORAOI(2, "OI"),
    OPERADORAVIVO(3, "VIVO"),
    OPERADORATIM(4, "TIM");

    private Integer cod;
    private String descricao;

    OperadoraEnum(Integer cod, String descricao) {
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
