package com.code.springbootactuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "name")
public class MyEndPoint {

    @ReadOperation
    public Map<String,String> test(){
        Map<String,String> result = new HashMap<>();
        result.put("name","name");
        result.put("age","20");
        return result;
    }

}
