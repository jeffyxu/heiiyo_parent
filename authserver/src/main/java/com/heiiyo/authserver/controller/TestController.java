package com.heiiyo.authserver.controller;

import com.heiiyo.authserver.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${spring.cloud.stream.kafka.binder.zk-nodes}")
    private String zk_nodes;

    @Autowired
    private GreetingsService greetingsService;

    @RequestMapping(value = "/send/{msg}", method = RequestMethod.GET)
    public void testGreetingsStreams(@PathVariable("msg") String msg){
        greetingsService.sendGreeting(msg);
    }

    @RequestMapping("/zk_nodes")
    String getZk_nodes() {
        return this.zk_nodes;

    }


}
