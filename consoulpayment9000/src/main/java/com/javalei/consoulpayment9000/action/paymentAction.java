package com.javalei.consoulpayment9000.action;

import com.javalei.common.entity.payMentEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: zzw
 * Date: 2020-05-13-23:22
 * Description: aciton
 */
@RestController
public class paymentAction {

    @RequestMapping("/get")
    public payMentEntity get(@RequestBody payMentEntity entity){
        entity.setId("111");
        return entity;
    }
}
