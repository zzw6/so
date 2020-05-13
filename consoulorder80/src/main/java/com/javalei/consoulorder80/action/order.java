package com.javalei.consoulorder80.action;

import com.javalei.common.entity.payMentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * User: zzw
 * Date: 2020-05-13-22:53
 * Description: order action
 */
@RestController
public class order {

    @Autowired
    private RestTemplate restTemplate;

    public static final String URL="http://PAYMENT/get";

    @RequestMapping("/get")
    public payMentEntity pay(payMentEntity entity){

        return  restTemplate.postForObject(URL,entity,payMentEntity.class);


    }

}
