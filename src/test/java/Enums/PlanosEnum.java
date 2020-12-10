package Enums;

public enum PlanosEnum {

    /*CLAROCONTROLE(1, "CLARO"),
    OICONTROLE(2, "OI"),
    VIVOCONTROLE(3, "VIVO"),
    TIMCONTROLE(4, "TIM");
*/

    CONTROLE(1, "CONTROLE");

    private Integer cod;
    private String descricao;

    PlanosEnum(Integer cod, String descricao) {
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
