package com.youzipi.service;

import com.common.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youzipi.form.MarketingForm;
import com.youzipi.bean.entity.Marketing;
import com.youzipi.bean.entity.MarketingExample;
import com.youzipi.mapper.MarketingMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by youzipi on 16/11/3.
 */
@Service
public class MarketingService {
    @Autowired
    private MarketingMapper mapper;

    public Marketing findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    public int create(Marketing marketing) {
        return mapper.insertSelective(marketing);
    }

    public int update(Marketing marketing) {
        return mapper.updateByPrimaryKey(marketing);
    }

    public int destory(Integer id) {
        destory(Arrays.asList(new Integer[]{id});
    }

    public int destory(Integer[] ids) {
        Marketing marketing = new Marketing();
//        marketing.setDelFlag("1");

        MarketingExample example = new MarketingExample();
        example.createCriteria().andMarketingIdIn(Arrays.asList(ids));

        return mapper.updateByExample(marketing,example);
    }

    public PageInfo<Marketing> findByIdAndCreatId(int id, Long createId, PageInfo<Marketing> pageForm) {
        PageHelper.startPage(pageForm.getPageNum(), pageForm.getPageSize());

        MarketingExample ex = new MarketingExample();

        MarketingExample.Criteria criteria = ex.createCriteria()
                .andMarketingIdEqualTo(id) //        eq('marketingId',marketingId)

                .andCreateIdEqualTo(createId)
                .andCreateIdIn(new ArrayList<Long>());



        MarketingExample.Criteria criteria2 = ex.createCriteria()
                .andCreateIdIn(new ArrayList<Long>());

        ex.or(criteria);
        ex.or(criteria2);
        ex.setDistinct(true);
        ex.setOrderByClause("create_time");



        List<Marketing> marketings = mapper.selectByExample(ex);
        PageInfo<Marketing> pageInfo = new PageInfo<>(marketings);

        return pageInfo;

    }


    public PageBean<Marketing> findByForm(MarketingForm form, PageBean<Marketing> pageBean) {

        PageHelper.startPage(pageBean.getPageNo(), pageBean.getPageSize());

        if (form.validate()) {
            MarketingExample example = form2example(form);

            List<Marketing> marketings = mapper.selectByExample(example);
            pageBean.setList(marketings);
            if (pageBean.getRows() == null) {
                int rows = mapper.countByExample(example);
                pageBean.setRows(rows);
            }

        }
        return pageBean;

    }

    private MarketingExample form2example(MarketingForm form) {
        MarketingExample example = new MarketingExample();
        MarketingExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(form.getMarketingName())) {
            criteria.andMarketingNameLike(form.getMarketingName());
        }

        String status = form.getStatus();
        if (StringUtils.isNotBlank(status)) {
            Date now = new Date();
            switch (status) {
                case "0": //未开始
                    criteria.andStartTimeGreaterThan(now);
                    break;
                case "1"://进行中
                    criteria.andStartTimeLessThanOrEqualTo(now);
                    criteria.andEndTimeGreaterThanOrEqualTo(now);
                    break;
                case "2": // 已结束
                    criteria.andEndTimeLessThanOrEqualTo(now);
                    break;
                default:
                    break;
            }
        }

        Date startTime = form.getStartTime();
        Date endTime = form.getEndTime();
        if (startTime != null) {
            criteria.andStartTimeLessThanOrEqualTo(startTime); // le('startTime',startTime);
        }
        if (endTime != null) {
            criteria.andEndTimeGreaterThanOrEqualTo(endTime);
        }
        return example;
    }
}
