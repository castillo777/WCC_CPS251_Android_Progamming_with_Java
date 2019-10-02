package com.example.tipcalculator;

import java.util.Locale;

class TipCalculator {

    private double tipAtTenPercent = 0.00;
    private double tipAtFifteenPercent = 0.00;
    private double tipAtTwentyPercent = 0.00;

    void calculateTip(double totalAmount) {
        tipAtTenPercent = totalAmount * 0.10;
        tipAtFifteenPercent = totalAmount * 0.15;
        tipAtTwentyPercent = totalAmount * 0.20;
    }

    String displayTipResults() {
        return ("The tip values are as follows: " +
                "\n\nTen percent = " +
                String.format(Locale.getDefault(), "%.2f", tipAtTenPercent) +
                "\nFifteen percent = " +
                String.format(Locale.getDefault(), "%.2f", tipAtFifteenPercent) +
                "\nTwenty percent = " +
                String.format(Locale.getDefault(), "%.2f", tipAtTwentyPercent)
        );
    }
}
