/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kodokuna
 */
@WebService(serviceName = "image_WebService")
public class image_WebService {
    
    private final String url = "http://localhost:8080/Nhom06/images/";
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "image_Service")
    public String image_Service(@WebParam(name = "image") String image) {
        //TODO write your implementation code here:
        return url + image;
    }

}
