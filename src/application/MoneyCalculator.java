package application;

import control.ExchangeOperation;
import model.CurrencySet;
import ui.ExchangeDialog;
import ui.MoneyDisplay;
import java.io.IOException;

public class MoneyCalculator {

    public static void main(String[] args) throws IOException {
        CurrencySet currencies = CurrencySet.getInstance();
        MoneyDisplay consoleMoneyDialog = new MoneyDisplay();
        ExchangeDialog consoleCurrencyDialog = new ExchangeDialog();
        ExchangeOperation control = new ExchangeOperation(currencies, consoleMoneyDialog, consoleCurrencyDialog);
        control.execute();
    }
}
