package com.grl.flashsale.service;

import org.springframework.stereotype.Service;

public interface PurchaseService {
    public boolean purchase(Long userId, Long productId, int quantity, String note);
}
