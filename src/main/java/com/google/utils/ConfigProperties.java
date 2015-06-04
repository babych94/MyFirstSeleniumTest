package com.google.utils;

import org.apache.bcel.util.ClassLoader;
import org.apache.xpath.operations.String;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by Василь on 03.06.2015.
 */
public class ConfigProperties {
    private static Properties PROPERTIES;
    static {
        PROPERTIES=new Properties();
        URL props=ClassLoader.getSystemResource("config.properties");
        try {
            PROPERTIES.load(props.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getProperty(String key){
        return PROPERTIES.getProperty(key);
    }
}