package com.grl.flashsale.service;

import com.grl.flashsale.Pojo.ProductPo;
import com.grl.flashsale.Pojo.PurchaseRecordPo;
import com.grl.flashsale.dao.ProductDao;
import com.grl.flashsale.dao.PurchaseRecordDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface RepoService {

    List<ProductPo> findAllProduct();
    List<PurchaseRecordPo> findAllRecord();
//    List<PurchaseRecordPo> findAllRecord(Long userId);
}
