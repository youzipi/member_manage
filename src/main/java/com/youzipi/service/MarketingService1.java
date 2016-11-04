package com.youzipi.service;

import com.common.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youzipi.bean.Market;
import com.youzipi.bean.entity.Marketing;
import com.youzipi.bean.entity.MarketingExample;
import com.youzipi.form.MarketingForm;
import com.youzipi.mapper.MarketingMapper;
import com.youzipi.mapper.MarketingMapper1;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by youzipi on 16/11/3.
 */
@Service
public class MarketingService1 {

    @Autowired
    private MarketingMapper1 mapper1;

    public PageInfo<Market> pageMarkeing(MarketingForm form){
        form.setTotal(mapper1.countMarketing(form));
        if(form.getTotal() > 0){
            form.setList(mapper1.pageMarketing(form));

            if(CollectionUtils.isNotEmpty(form.getList())){
                for(Market market : form.getList()){
                    Map<String,Objects> others = new HashMap<>();
                  market.getId();
                    market.setOthers(others);
                }
            }
        }
        return form;
    }


}
