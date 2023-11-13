package com.example.planejamentoviagem.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Roupa {

    private String tipoCorteDaRoupa;
    private String estacaoClimatica;
    private String tipoUsoDaRoupa;
    private int quantiadeDeVezesQueVaiUsar;
    private String cor;

    public Roupa(String tipoCorteDaRoupa, String estacaoClimatica, String tipoUsoDaRoupa, int quantiadeDeVezesQueVaiUsar, String cor) {
        this.tipoCorteDaRoupa = tipoCorteDaRoupa;
        this.estacaoClimatica = estacaoClimatica;
        this.tipoUsoDaRoupa = tipoUsoDaRoupa;
        this.quantiadeDeVezesQueVaiUsar = quantiadeDeVezesQueVaiUsar;
        this.cor = cor;
    }


    public String getTipoCorteDaRoupa() {
        return tipoCorteDaRoupa;
    }

    public void setTipoCorteDaRoupa(String tipoCorteDaRoupa) {
        this.tipoCorteDaRoupa = tipoCorteDaRoupa;
    }

    public String getEstacaoClimatica() {
        return estacaoClimatica;
    }

    public void setEstacaoClimatica(String estacaoClimatica) {
        this.estacaoClimatica = estacaoClimatica;
    }

    public String getTipoUsoDaRoupa() {
        return tipoUsoDaRoupa;
    }

    public void setTipoUsoDaRoupa(String tipoUsoDaRoupa) {
        this.tipoUsoDaRoupa = tipoUsoDaRoupa;
    }

    public int getQuantiadeDeVezesQueVaiUsar() {
        return quantiadeDeVezesQueVaiUsar;
    }

    public void setQuantiadeDeVezesQueVaiUsar(int quantiadeDeVezesQueVaiUsar) {
        this.quantiadeDeVezesQueVaiUsar = quantiadeDeVezesQueVaiUsar;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
