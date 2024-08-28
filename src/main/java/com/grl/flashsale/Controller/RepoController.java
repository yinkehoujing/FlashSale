package com.grl.flashsale.Controller;

import com.grl.flashsale.Pojo.ProductPo;
import com.grl.flashsale.Pojo.PurchaseRecordPo;
import com.grl.flashsale.service.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/repo")
public class RepoController {

    @Autowired
    RepoService repoService = null;
    @GetMapping
    public ModelAndView showRepo(){
        return new ModelAndView("repo");
    }

    @GetMapping("/allproduct")
    public ModelAndView showAllProduct(){
        ModelAndView modelAndView = new ModelAndView("allproduct");
        List<ProductPo> products = repoService.findAllProduct();
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/allpurchase")
    public ModelAndView showAllPurchase(){
        ModelAndView modelAndView = new ModelAndView("allpurchase");
        List<PurchaseRecordPo> purchaseRecords = repoService.findAllRecord();
        modelAndView.addObject("purchase_records", purchaseRecords);
        return modelAndView;
    }


}
