package com.AsictTekSkillTest.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Daniel on 4/23/2017.
 */
@WebService(serviceName="MyWebService")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)

public class MyWebService {
    MyBObject myBObject;
    @WebMethod(exclude=true)
      public void setMyBObject(MyBObject bObject) {
        this.myBObject = bObject;
    }



    @WebMethod(operationName="printMessage")
      public String printMessage() {
        return myBObject.printMessage();
    }

}

