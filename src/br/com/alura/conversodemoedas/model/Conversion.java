package br.com.alura.conversodemoedas.model;

public class Conversion {
    CreateCoins coins = new CreateCoins();

    public double conversionToValue(int option, double valueToConvert) {
        double amount = 0;

        switch (option) {
            case 1:
                amount = valueToConvert * coins.getCoins().usd();
                break;
            case 2:
                amount = valueToConvert / coins.getCoins().usd();
                break;
            case 3:
                amount = valueToConvert * coins.getCoins().ars();
                break;
            case 4:
                amount = valueToConvert / coins.getCoins().ars();
                break;
            case 5:
                amount = valueToConvert * coins.getCoins().cop();
                break;
            case 6:
                amount = valueToConvert / coins.getCoins().cop();
                break;
            case 7:
                amount = valueToConvert * coins.getCoins().clp();
                break;
            case 8:
                amount = valueToConvert / coins.getCoins().clp();
                break;
        }

        return amount;
    }




}
