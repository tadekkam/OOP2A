package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BillCalculatorTest {

    @Test
    void calculateValueInvoiceAndPaymentForService() {
        double valueInvoice = 100;
        float paymentForService = 10;
        Assertions.assertEquals(110, BillCalculator.calculate(valueInvoice, paymentForService));
    }
    @Test
    void calculateValueInvoiceAndPaymentForServiceAndDiscount() {
        double valueInvoice = 100;
        float paymentForService = 10;
        double discount = 15;
        Assertions.assertEquals(95, BillCalculator.calculate(valueInvoice, paymentForService, discount));
    }
    @Test
    void calculateValueInvoiceAndPaymentForServiceAndPaymentForPacking() {
        double valueInvoice = 120;
        float paymentForService = 10;
        short PaymentForPacking = 10;
        Assertions.assertEquals(140, BillCalculator.calculate(valueInvoice, paymentForService, PaymentForPacking));
    }

}