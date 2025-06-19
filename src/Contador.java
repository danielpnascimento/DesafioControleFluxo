import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("***CONTAGEM DE NÚMEROS ENTRE 2 NÚMEROS***");
        System.out.println("Digite o Primeiro N°:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o Segundo N°:");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Digite um N° maior que o Primeiro!!");
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        System.out.println("Os Números São:");
        for (int i = 1; i <= contagem; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.print("A quantidade entre eles são de " + contagem + " Números!");

    }
}