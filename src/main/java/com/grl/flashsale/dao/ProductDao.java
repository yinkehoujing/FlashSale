package com.grl.flashsale.dao;

import com.grl.flashsale.Pojo.ProductPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductDao {
   public ProductPo getProduct(Long id);

   public int decreaseProduct(@Param("id") Long id,
                              @Param("quantity") int quantity);
   @Select("SELECT id, product_name AS productName, stock, price, version, note FROM T_Product")
   public List<ProductPo> getAllProduct();

}
