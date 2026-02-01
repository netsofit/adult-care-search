package com.netsofit.adultcare;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AdultCareController {

    @QueryMapping
    public String hello() {
        return "Hello, Adult Care Search!";
    }
}
