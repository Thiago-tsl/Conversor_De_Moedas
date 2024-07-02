package br.com.alura.conversodemoedas.main;

import br.com.alura.conversodemoedas.model.Menu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Menu menu = new Menu();
        int option;
        double valueToConvert;


        Scanner reading = new Scanner(System.in);

        do {
            System.out.println(menu.getMenu());
            System.out.println("Escolha a sua Opção desejada: ");
            option = reading.nextInt();
            if (option == 0) {
                break;
            } else if (option >= 1 && option <= 8) {
                System.out.println("Qual é o valor que deseja converter?");
                valueToConvert = reading.nextDouble();
                menu.conversionOption(option, valueToConvert);
            } else {
                System.out.println("essa Opção é invalida\n");
            }
        } while (option != 0);
        menu.showLog();
    }
}
