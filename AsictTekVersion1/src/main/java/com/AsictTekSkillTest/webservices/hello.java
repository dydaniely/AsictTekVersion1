package com.AsictTekSkillTest.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Daniel on 4/23/2017.
 */
@WebService
public class hello {
    @WebMethod(operationName="getHelloWorld")
    public String getHelloWorld(String name) {
        return "Hello World JAX-WS " + name;
    }
}
