package com.grl.flashsale.Pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("product")
public class ProductPo implements Serializable {
    private static final long serialVersionUID = 0x3f3f3f3f3f3f3f3fL;
    private Long id;
    private String productName;
    private int stock;
    private double price;
    private int version;
    private String note;
}
