package com.example.homework.Listeners;

import com.example.homework.Events.TransactionE;
import org.springframework.stereotype.Service;


import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
public class TranL {
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void listenMessageEventAfterCommit(TransactionE event) {
        System.out.println("Transactional event commit");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void listenMessageEventAfterRollback(TransactionE event) {
        System.out.println("Transactional event rollback");
    }
}
