package com.grl.flashsale.service.impl;

import com.grl.flashsale.pojo.ProductPo;
import com.grl.flashsale.pojo.PurchaseRecordPo;
import com.grl.flashsale.dao.ProductDao;
import com.grl.flashsale.dao.PurchaseRecordDao;
import com.grl.flashsale.service.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepoServiceImpl implements RepoService {

    @Autowired
    ProductDao productDao = null;
    @Autowired
    PurchaseRecordDao purchaseRecordDao = null;

    @Override
    public List<ProductPo> findAllProduct() {
        return productDao.getAllProduct();
    }

    @Override
    public List<PurchaseRecordPo> findAllRecord() {
        return purchaseRecordDao.findAllRecord();
    }

//    @Override
//    public List<PurchaseRecordPo> findAllRecord(Long userId) {
//        return List.of();
//    }
}
