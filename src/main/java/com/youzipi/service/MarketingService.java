package com.youzipi.service;

import com.youzipi.bean.entity.Marketing;
import com.youzipi.mapper.MarketingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public
}
