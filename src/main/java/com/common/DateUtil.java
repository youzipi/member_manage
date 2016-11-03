package com.common;

import com.entity.User;
import org.apache.commons.lang.reflect.MethodUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * project_name:spring_demoss
 * package_name:mvc.util
 * user: youzipi
 * date: 2015/6/29 17:20
 */
public class DateUtil {

    public static Date today() {
        return new Date((new java.util.Date()).getTime());

    }

    public static void addTime(Object obj) {
        invoke(obj, "setAddTime");
        invoke(obj, "setUpdateTime");
    }

    public static void updateTime(Object obj) {
        invoke(obj, "setUpdateTime");
    }

    private static void invoke(Object obj, String methodName) {
        Date today = new Date((new java.util.Date()).getTime());

        try {
            MethodUtils.invokeMethod(obj, methodName, today);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] aa) {

        Date date = new Date((new Date()).getTime());
        System.out.println(date);
        String tagStr = "tag1 tag2  tag3";
        String[] tags = tagStr.split(" +");//按空白符切片
        for (String tag : tags) {
            System.out.println("tag" + tag);
        }
        User user = new User();
        DateUtil.addTime(user);
        System.out.println(user);
    }

    public static Date min(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return null;
        }

        if (date1.compareTo(date2) < 0) {
            return date1;
        } else {
            return date2;
        }
    }
}
