package com.javalei.order80.action;

import com.javalei.common.entity.payMentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * User: zzw
 * Date: 2020-05-08-22:34
 * Description:
 */

@RestController
@RequestMapping("/")
public class orderAction {

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    @GetMapping("/add")
    public payMentEntity addOrder(@RequestBody String name){
        payMentEntity pay=new payMentEntity();
        pay.setId(Thread.currentThread().getName());
        pay.setName(name);
        return pay;
    }

    @RequestMapping("/dis")
    public DiscoveryClient getDiscoveryClient(){
        return discoveryClient;
    }



}
