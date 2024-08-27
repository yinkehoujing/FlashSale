package com.grl.flashsale.dao;

import com.grl.flashsale.Pojo.ProductPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductDao {
   public ProductPo getProduct(Long id);

   public int decreaseProduct(@Param("id") Long id,
                              @Param("quantity") int quantity);
}
