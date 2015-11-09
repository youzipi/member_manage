package com.common;

import java.sql.Date;

/**
 * project_name:spring_demoss
 * package_name:mvc.util
 * user: youzipi
 * date: 2015/6/29 17:20
 */
public class DateUtil {
    public static void main(String []aa){
//initialize the ud such as ud = new java.util.Date();

        Date date = new Date((new java.util.Date()).getTime());
        System.out.println(date);
        String tagStr = "tag1 tag2  tag3";
        String[] tags =  tagStr.split(" +");//按空白符切片
        for (String tag:tags){
            System.out.println("tag"+tag);
        }
    }
}
