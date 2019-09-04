package com.guiji.dispatch.dao;

import com.guiji.dispatch.dao.entity.PlanBatch;
import java.util.List;

public interface PlanBatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatch_plan_batch
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatch_plan_batch
     *
     * @mbggenerated
     */
    int insert(PlanBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatch_plan_batch
     *
     * @mbggenerated
     */
    PlanBatch selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatch_plan_batch
     *
     * @mbggenerated
     */
    List<PlanBatch> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatch_plan_batch
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlanBatch record);
}