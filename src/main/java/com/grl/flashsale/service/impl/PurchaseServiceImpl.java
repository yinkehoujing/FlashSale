package com.grl.flashsale.service.impl;

import com.grl.flashsale.pojo.ProductPo;
import com.grl.flashsale.pojo.PurchaseRecordPo;
import com.grl.flashsale.dao.ProductDao;
import com.grl.flashsale.dao.PurchaseRecordDao;
import com.grl.flashsale.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    PurchaseRecordDao purchaseRecordDao = null;
    @Autowired
    ProductDao productDao = null;
    @Override
    @Transactional
    public boolean purchase(Long userId, Long productId, int quantity, String note) {
        ProductPo product = productDao.getProduct(productId);
        if(product.getStock() < quantity) return false;
        productDao.decreaseProduct(productId, quantity);
        PurchaseRecordPo pr = initPurchaseRecord(userId, product, quantity, note);
        purchaseRecordDao.insertPurchaseRecord(pr);
        return true;
    }

    private PurchaseRecordPo initPurchaseRecord(Long userId, ProductPo product, int quantity, String note) {
        PurchaseRecordPo pr = new PurchaseRecordPo();
        if(note == null) pr.setNote("this is a note");
        else pr.setNote(note);
        pr.setPrice(product.getPrice());
        pr.setProductId(product.getId());
        pr.setQuantity(quantity);
        double paid = product.getPrice() * quantity;
        pr.setPaid(paid);
        pr.setUserId(userId);
        return pr;
    }
}
