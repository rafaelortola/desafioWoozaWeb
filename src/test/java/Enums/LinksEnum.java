package Enums;

public enum LinksEnum {

    PLANOSDECELULAR(1, "PLANOS DE CELULAR"),
    INTERNETBANDALARGA(2, "INTERNET BANDA LARGA"),
    OPERADORAS(3, "OPERADORAS"),
    MONTESEUCOMBO(4, "MONTE SEU COMBO"),
    CELULARES(5, "CELULARES"),
    NOTICIAS(6, "NOTICIAS");

    private Integer cod;
    private String descricao;

    LinksEnum(Integer cod, String descricao) {
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
