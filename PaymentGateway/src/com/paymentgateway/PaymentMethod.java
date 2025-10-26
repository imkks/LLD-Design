package com.paymentgateway;

public interface PaymentMethod {
    boolean processPayment(long amount);
    
}
class CreditCard implements PaymentMethod
{
    String cardNumber;
    String expirationDate;
    String cvv;
    // CreditCard()
    public boolean processPayment(long amount)
    {
        System.out.println("Payment processed through credit card for "+amount);
        return true;
    }
}
class DebitCard implements PaymentMethod
{
    String cardNumber;
    String expirationDate;
    String cvv;
    // CreditCard()
    public boolean processPayment(long amount)
    {
        System.out.println("Payment processed through debit card for "+amount);
        return true;
    }
}
class InternetBanking implements PaymentMethod
{
    String userId;
    String passWord;
    // String cvv;
    // CreditCard()
    public boolean processPayment(long amount)
    {
        System.out.println("Payment processed through net banking for "+amount);
        return true;
    }
}

