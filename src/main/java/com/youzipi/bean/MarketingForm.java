package com.youzipi.bean;


import java.util.Date;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * Created by youzipi on 16/11/3.
 */
@Data
public class MarketingForm {

    /**
     * Marketing
     */


    private String marketingName;

    private Date startTime;

    private Date endTime;

    private String status;


    /**
     * Marketing Scope
     *
     */


    public boolean validate() {
        if (startTime != null && endTime != null) {
            return startTime.compareTo(endTime) < 0;
        }
        return true;
    }

}
