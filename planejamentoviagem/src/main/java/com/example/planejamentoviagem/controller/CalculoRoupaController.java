package com.example.planejamentoviagem.controller;

import com.example.planejamentoviagem.model.Roupa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("roupa")
public class CalculoRoupaController {



    Roupa camiseta = new Roupa("Camiseta","verao","praticaDeEsporte",1,"Preto");
    Roupa bermuda = new Roupa("Bermuda","verao","praticaDeEsporte",1,"Amarelo");
    Roupa calcado = new Roupa("Calcado","verao","praticaDeEsporte",1,"Branco");



    @PostMapping
    public void calculaQuantidadeDeRoupa(){
        String estacaoAno = "inverno";
        if (estacaoAno == "verao"){
            System.out.println("Voce deve levar camiseta e chinelo");
        }else {
            System.out.println(" Voce deve levar blusa e calca");
        }


        /*System.out.println(" Aqui em baixo eh teste de GET");

        System.out.println("A sua mala sera composta por:" + 3 + " " + camiseta.getTipoCorteDaRoupa() );
        System.out.println("A sua mala sera composta por:" + 5 + " " + bermuda.getTipoCorteDaRoupa() );
        System.out.println("A sua mala sera composta por:" + "1" + " " + calcado.getTipoCorteDaRoupa() );*/


    }





}
