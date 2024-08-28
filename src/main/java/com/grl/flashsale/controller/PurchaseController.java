package com.grl.flashsale.controller;

import com.grl.flashsale.service.PurchaseService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService = null;
    /* you shouldn't use that form if you use restController*/
//    @GetMapping("/test")
//    public String test(){
//        return "test";
//    }
    @GetMapping("/home")
    public ModelAndView showTestPage() {
        // Return the name of the view and any model attributes if needed
        return new ModelAndView("home"); // Refers to src/main/resources/templates/home.html

    }

    @PostMapping("/purchase")
    public Result purchase(@RequestParam Long userId, @RequestParam Long productId,@RequestParam Integer quantity, @RequestParam String note){
        boolean success = purchaseService.purchase(userId,productId,quantity, note);
        String message = success ? "抢购成功" : "抢购失败";
        return new Result(success, message);
    }
    @Data
    @AllArgsConstructor
    class Result{
       private boolean success;
       private String message;
    }
}
