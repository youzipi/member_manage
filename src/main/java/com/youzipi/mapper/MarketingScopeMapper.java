package com.youzipi.mapper;

import com.youzipi.bean.entity.MarketingScope;
import com.youzipi.bean.entity.MarketingScopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingScopeMapper {
    int countByExample(MarketingScopeExample example);

    int deleteByExample(MarketingScopeExample example);

    int deleteByPrimaryKey(Long marketingScopeId);

    int insert(MarketingScope record);

    int insertSelective(MarketingScope record);

    List<MarketingScope> selectByExample(MarketingScopeExample example);

    MarketingScope selectByPrimaryKey(Long marketingScopeId);

    int updateByExampleSelective(@Param("record") MarketingScope record, @Param("example") MarketingScopeExample example);

    int updateByExample(@Param("record") MarketingScope record, @Param("example") MarketingScopeExample example);

    int updateByPrimaryKeySelective(MarketingScope record);

    int updateByPrimaryKey(MarketingScope record);
}