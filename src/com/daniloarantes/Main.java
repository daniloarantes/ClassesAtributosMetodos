package com.daniloarantes;

public class Main {

    public static void main(String[] args) {
        // Instanciação do objeto carro representado pela letra c
        Carro c = new Carro();

        // Definição de atributos para o objeto c
        c.cor = "Vermelho";
        c.numeroPortas = 4;

        // Instanciação do objeto carro representado pela palavra xaea
        Carro xaea = new Carro();

        // Definição de atributos para o objeto xaea
        xaea.cor = "Branco";
        xaea.numeroPortas = 2;

        // Exibe o conteúdo dos atributos na tela
        System.out.println(c.cor);
        System.out.println(c.numeroPortas);
        System.out.println("Objeto C acelerando: ");
        // Chamando método acelerar do objeto c
        c.acelerar();

        // Exibe o conteúdo dos atributos na tela
        System.out.println(xaea.cor);
        System.out.println(xaea.numeroPortas);
        xaea.acelerar();






	
    }
}
