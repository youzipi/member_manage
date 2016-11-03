package com.dao.mapper;

import com.entity.Consumption;
import com.entity.ConsumptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumptionMapper {
    int countByExample(ConsumptionExample example);

    int deleteByExample(ConsumptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Consumption record);

    int insertSelective(Consumption record);

    List<Consumption> selectByExample(ConsumptionExample example);

    Consumption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Consumption record, @Param("example") ConsumptionExample example);

    int updateByExample(@Param("record") Consumption record, @Param("example") ConsumptionExample example);

    int updateByPrimaryKeySelective(Consumption record);

    int updateByPrimaryKey(Consumption record);
}