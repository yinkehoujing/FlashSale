package com.grl.flashsale.dao;

import com.grl.flashsale.Pojo.PurchaseRecordPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PurchaseRecordDao {
    public int insertPurchaseRecord(PurchaseRecordPo pr);

    @Select("SELECT id, user_id AS userId, product_id AS productId, price, quantity, paid, purchase_date AS purchaseDate, note " +
            "FROM T_Purchase_Record")
    List<PurchaseRecordPo> findAllRecord();
}
