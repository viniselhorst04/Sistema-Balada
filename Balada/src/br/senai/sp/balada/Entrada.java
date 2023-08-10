package br.senai.sp.balada;

import java.util.Scanner;
public class Entrada {

    public static void main(String[] args) {

        String nome, nome1;
        long CPF, CPF1;
        long RG, RG1;
        int idade = 0, idade1 = 0;
        String situacao;



        /** Instanciar Scanner */

        Scanner teclado = new Scanner(System.in);

        /** Coletar Dados */

        System.out.println("===========================================");
        System.out.println("Boa noite! Identifique-se abaixo!");
        System.out.print("Informe seu Nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe seu CPF: ");
        CPF = teclado.nextLong();
        System.out.print("Informe seu RG: ");
        RG = teclado.nextLong();
        System.out.print("Informe sua Idade: ");

        while (idade==0) {

            if (teclado.hasNextInt()) {
                idade = teclado.nextInt();

            } else {
                System.out.println("Digite um Número Inteiro!!!!!");
                teclado.next(); //Limpar Buffer
            }

        }


        if (idade >= 18 && idade%2 == 0) {
            System.out.println("Liberado!");
        } else if (idade >= 18 && idade %2 != 0){
            System.out.println("===========================================");
            System.out.println("Boa noite! Identifique-se abaixo!");
            System.out.print("Informe seu Nome(Acomp.): ");
            nome = teclado.next();
            System.out.print("Informe seu CPF(Acomp.): ");
            CPF = teclado.nextLong();
            System.out.print("Informe seu RG(Acomp.): ");
            RG = teclado.nextLong();
            System.out.print("Informe sua Idade(Acomp.): ");
            idade1 = teclado.nextInt();
        }else {
            System.out.println("Entrada de Menores Proibida!");
        }

        if (idade>=18 && (idade + idade1)%2 ==0 && idade1>=18){
            System.out.println("Liberado!!!");
        }else{
            System.out.println("Esquece");
        }


    }
}
