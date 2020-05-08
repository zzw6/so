package com.javalei.payment.action;

import com.javalei.common.entity.payMentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * User: zzw
 * Date: 2020-05-08-22:52
 * Description: action
 */
@RestController
public class PaymentAction {


    @Autowired
    private RestTemplate restTemplate;


    public static final String URL="http://ORDER80/add";

    @RequestMapping("/add")
    public payMentEntity add(payMentEntity entity){

        System.out.println(entity.toString());

       return  restTemplate.postForObject(URL,entity,payMentEntity.class);

    }
}
