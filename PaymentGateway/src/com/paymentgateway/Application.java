package com.paymentgateway;

public class Application {
    public static void main(String[] args) {
        PaymentService pms= new PaymentService();
        PaymentRequest prs= new PaymentRequest();
        prs.amount=100;
        prs.merchantId="1";
        prs.orderId="3";
        Transaction txn=pms.createTransaction(prs);
        System.out.println(txn);

        CreditCard crd= new CreditCard();
        crd.cardNumber="0123";
        crd.expirationDate="20/23/1234";
        pms.completePayment(txn.id, crd);
       System.out.println(pms.getStatus(txn.id));

        

        
    }
}
