package com.example;

import org.apache.tomcat.util.modeler.BaseModelMBean;

public class Hello extends BaseModelMBean {

    public String sayHello() {
        return "Hello MBean!";
    }
    
}
