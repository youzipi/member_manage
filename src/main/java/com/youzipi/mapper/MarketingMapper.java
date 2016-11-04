package com.youzipi.mapper;

import com.common.PageBean;
import com.youzipi.bean.entity.Marketing;
import com.youzipi.bean.entity.MarketingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketingMapper {
    int countByExample(MarketingExample example);

    int deleteByExample(MarketingExample example);

    int deleteByPrimaryKey(Integer marketingId);

    int insert(Marketing record);

    int insertSelective(Marketing record);

    List<Marketing> selectByExample(MarketingExample example);

    Marketing selectByPrimaryKey(Integer marketingId);

    int updateByExampleSelective(@Param("record") Marketing record, @Param("example") MarketingExample example);

    int updateByExample(@Param("record") Marketing record, @Param("example") MarketingExample example);

    int updateByPrimaryKeySelective(Marketing record);

    int updateByPrimaryKey(Marketing record);
    int selectByPage(PageBean pb);
}