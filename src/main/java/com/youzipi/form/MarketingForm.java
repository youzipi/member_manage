package com.youzipi.form;


import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.youzipi.bean.Market;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * Created by youzipi on 16/11/3.
 */
@Data
public class MarketingForm extends PageInfo<Market> {

    /**
     * Marketing
     */


    private String marketingName;

    private Date startTime;

    private Date endTime;

    private String status;

    private Market market;

    private String orderCols;

    private String orderDesc;

    private String notInStr;

    private List<String> notIn;

    private String likeId;





    /**
     * Marketing Scope
     */


    public boolean validate() {
        if (startTime != null && endTime != null) {
            return startTime.compareTo(endTime) < 0;
        }
        return true;
    }

}
