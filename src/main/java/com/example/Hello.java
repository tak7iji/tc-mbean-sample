package com.example;

import org.apache.tomcat.util.modeler.BaseModelMBean;

public class Hello extends BaseModelMBean {

// public class Hello implements HelloMBean {
    public String sayHello() {
        return "Hello MBean!";
    }
    
}
