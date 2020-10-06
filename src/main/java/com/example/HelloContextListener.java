package com.example;

import javax.management.ObjectName;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.tomcat.util.modeler.Registry;

public class HelloContextListener implements ServletContextListener {
    ObjectName oname = null;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Hello hello = new Hello();
            oname = new ObjectName
                ("Catalina:type=Custom,name=Hello");
            Registry.getRegistry(null, null).registerComponent
                (hello, oname, "com.example.Hello");
        } catch (Exception e) {
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if (oname != null) {
            try {
                Registry.getRegistry(null, null).unregisterComponent(oname);
            } catch (Exception e) {
            }
        }
        oname = null;

    }
    
}
