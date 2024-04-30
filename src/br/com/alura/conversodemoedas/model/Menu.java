package br.com.alura.conversodemoedas.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Menu {

    Conversion conversion = new Conversion();
    List<String> listLog = new ArrayList<>();

    public String getMenu() {
        return """
                (****************************************************************);
               ██████╗ █████╗ ███╗   ███╗██████╗ ██╗ ██████╗ );
               ██╔════╝██╔══██╗████╗ ████║██╔══██╗██║██╔═══██╗);
               ██║     ███████║██╔████╔██║██████╔╝██║██║   ██║);
               ██║     ██╔══██║██║╚██╔╝██║██╔══██╗██║██║   ██║);
               ╚██████╗██║  ██║██║ ╚═╝ ██║██████╔╝██║╚██████╔╝);
               ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═════╝ ╚═╝ ╚═════╝ );
               
               
                1) Real brasileiro >> Dólar
                2) Dólar >> Real brasileiro
                3) Real brasileiro >> Peso argentino
                4) Peso argentino >> Real brasileiro
                5) Real brasileiro >> Peso colombiano
                6) Peso colombiano >> Real brasileiro
                7) Real brasileiro >> Peso chileno
                8) Peso chileno >> Real brasileiro
                0) Sair
                """;
    }

    public void conversionOption(int option, double valueToConvert) throws InterruptedException {
        double amout;

        amout = conversion.conversionToValue(option, valueToConvert);
        String message = String.format("%.2f equivale a %.2f\n", valueToConvert, amout);
        System.out.println(message);
        this.registerLog(option, message);
        TimeUnit.SECONDS.sleep(1);


    }

    private void registerLog(int option, String message) {
        listLog.add(STR."""
Opção: \{option}
\{message}Conersão feita em: \{LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))}""");


    }

    public void showLog() {
        System.out.println("*************************LOG'S REGISTRADOS*************************");
        for (String log : listLog) {
            System.out.println(log);
            System.out.println("---------------------------------------");
        }
    }

}



