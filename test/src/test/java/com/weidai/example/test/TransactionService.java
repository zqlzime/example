package com.weidai.example.test;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;

/**
 * Created by WD05709 on 2019/4/14.
 */
public class TransactionService implements TransactionCallback {

    @Override
    public Object doInTransaction(TransactionStatus status) {
        return null;
    }
}
