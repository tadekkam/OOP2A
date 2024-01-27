package org.example;

public class BillCalculator {

    public static double calculate(double valueInvoice, float paymentForService) {
        return valueInvoice + paymentForService;
    }

    public static double calculate(double valueInvoice, float paymentForService, double discount) {
        return valueInvoice * (1 - discount / 100) + paymentForService;
    }

    public static double calculate(double valueInvoice, float paymentForService, short paymentForPacking) {
        return valueInvoice + paymentForService + paymentForPacking;
    }

}
