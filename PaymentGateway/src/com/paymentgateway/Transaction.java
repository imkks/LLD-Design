package com.paymentgateway;

import java.util.UUID;

public class Transaction {
    public String id;
    String merchantId;
    String orderId;
    long amount;
    String status;
    Transaction()
    {
        id= UUID.randomUUID().toString();
    }
    @Override
    public String toString()
    {
        return id+" "+merchantId + " " +orderId + amount;
    }

    
}
