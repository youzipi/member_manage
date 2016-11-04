package com.youzipi.mapper;

import com.common.PageBean;
import com.youzipi.bean.Market;
import com.youzipi.bean.entity.Marketing;
import com.youzipi.bean.entity.MarketingExample;
import com.youzipi.form.MarketingForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketingMapper1 {


    public List<Market> pageMarketing(MarketingForm marketingForm);

    public List<Market> queryMarketing(MarketingForm marketingForm);

    public Integer countMarketing(MarketingForm marketingForm);

    public Integer addMarketing(Market market);

    public Integer updateMarketing(Market market);

    public void delMarketing(Market market);



}