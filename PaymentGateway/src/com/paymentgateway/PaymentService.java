package com.paymentgateway;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    Map<String,Transaction> transactionRepo;
    PaymentService()
    {
        transactionRepo=new HashMap<>();
    }
    public Transaction createTransaction(PaymentRequest paymentRequest)
    {
        // if(transactionRepo.get(paymentRequest.))
        Transaction txn = new Transaction();
        txn.amount=paymentRequest.amount;
        txn.merchantId=paymentRequest.merchantId;
        txn.orderId=paymentRequest.orderId;
        txn.status="INIT";
        transactionRepo.put(txn.id, txn);
        return txn;


    }
    public void completePayment(String txnId,PaymentMethod pmt)
    {
        Transaction txn=transactionRepo.get(txnId);
        if(txn==null)
        {

        }

        if(pmt.processPayment(txn.amount))
        {
            txn.status="COMPLETED";
        }
        else
        {
            txn.status="FAILED";
        }
       
    }
    public String getStatus(String txnId)
    {
        return transactionRepo.get(txnId).status;
    }
}
