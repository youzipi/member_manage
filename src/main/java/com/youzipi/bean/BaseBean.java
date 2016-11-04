package com.youzipi.bean;

import java.util.Map;
import java.util.Objects;

/**
 * Created by youzipi on 16/11/4.
 */
public class BaseBean {
    protected Map<String,Objects> others;

    public Map<String, Objects> getOthers() {
        return others;
    }

    public void setOthers(Map<String, Objects> others) {
        this.others = others;
    }
}
