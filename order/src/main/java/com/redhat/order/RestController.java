package com.redhat.order;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class RestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam("id") long id) {
        String url = "http://msa-test-git:8080/customers/" + id;
        RestTemplate rt = new RestTemplate();
        Person p = rt.getForObject(url, Person.class);
        return "World peace! - - " + p.getName();
    }

}
