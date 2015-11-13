package com.dao.mapper;

import com.entity.MachineGroup;
import com.entity.MachineGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MachineGroupMapper {
    int countByExample(MachineGroupExample example);

    int deleteByExample(MachineGroupExample example);

    int insert(MachineGroup record);

    int insertSelective(MachineGroup record);

    List<MachineGroup> selectByExample(MachineGroupExample example);

    int updateByExampleSelective(@Param("record") MachineGroup record, @Param("example") MachineGroupExample example);

    int updateByExample(@Param("record") MachineGroup record, @Param("example") MachineGroupExample example);
}