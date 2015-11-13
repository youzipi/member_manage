package com.common;

import java.util.HashMap;

public class PageUtil {

    public static HashMap<String, Integer> page2map(Page page) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("offset", (page.getNumber() - 1) * page.getSize());
        map.put("limit", page.getSize());
        return map;
    }
}