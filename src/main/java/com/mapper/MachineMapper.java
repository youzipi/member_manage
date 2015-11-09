package com.mapper;

import com.entity.Machine;
import com.entity.MachineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MachineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table machine
     *
     * @mbggenerated
     */
    int countByExample(MachineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table machine
     *
     * @mbggenerated
     */
    int deleteByExample(MachineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table machine
     *
     * @mbggenerated
     */
    int insert(Machine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table machine
     *
     * @mbggenerated
     */
    int insertSelective(Machine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table machine
     *
     * @mbggenerated
     */
    List<Machine> selectByExample(MachineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table machine
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table machine
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);
}