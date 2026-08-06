package org.example.utility;

import org.example.constants.FrameWorkConstant;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyUtils {


    private static  Properties properties =new Properties();

    private static Map<String,String> map=new HashMap<>();


    static{

        try(FileInputStream fileInputStream=new FileInputStream(FrameWorkConstant.getPath())){
            properties.load(fileInputStream);

            for(Map.Entry<Object,Object> entry: properties.entrySet()){

                String key=String.valueOf(entry.getKey());
                String value=String.valueOf(entry.getValue());
                map.put(key,value);
            }
        } catch (Exception e) {

            e.getStackTrace();
            e.getMessage();
        }
    }

    public static String getValue(String key){
        return map.get(key);
    }
}
