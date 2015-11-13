package com.dao.mapper;

import com.entity.Machine;
import com.entity.MachineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MachineMapper {
    int countByExample(MachineExample example);

    int deleteByExample(MachineExample example);

    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectByExample(MachineExample example);

    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);
}