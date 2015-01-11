package ui;

import model.Currency;

public class CurrencyViewer {

    public void show(Currency currency) {
        System.out.println(currency.getCode());
    }
}
