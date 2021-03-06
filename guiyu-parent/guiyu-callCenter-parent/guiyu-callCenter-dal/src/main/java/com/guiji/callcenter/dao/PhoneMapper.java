package com.guiji.callcenter.dao;


import com.guiji.callcenter.dao.entity.Phone;
import com.guiji.callcenter.dao.entity.PhoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int countByExample(PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int deleteByExample(PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String phone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int insert(Phone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int insertSelective(Phone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    List<Phone> selectByExample(PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    Phone selectByPrimaryKey(String phone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Phone record, @Param("example") PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Phone record, @Param("example") PhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Phone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Phone record);
}