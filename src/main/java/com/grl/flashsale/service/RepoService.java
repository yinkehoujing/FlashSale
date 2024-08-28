package com.grl.flashsale.service;

import com.grl.flashsale.pojo.ProductPo;
import com.grl.flashsale.pojo.PurchaseRecordPo;

import java.util.List;

public interface RepoService {

    List<ProductPo> findAllProduct();
    List<PurchaseRecordPo> findAllRecord();
//    List<PurchaseRecordPo> findAllRecord(Long userId);
}
