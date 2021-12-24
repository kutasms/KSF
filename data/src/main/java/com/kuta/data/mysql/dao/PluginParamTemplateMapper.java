/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.PluginParamTemplate;
import com.kuta.data.mysql.pojo.PluginParamTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginParamTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    long countByExample(PluginParamTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int deleteByExample(PluginParamTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int deleteByPrimaryKey(Integer pptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int insert(PluginParamTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int insertSelective(PluginParamTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    List<PluginParamTemplate> selectByExample(PluginParamTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    PluginParamTemplate selectByPrimaryKey(Integer pptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int updateByExampleSelective(@Param("record") PluginParamTemplate record, @Param("example") PluginParamTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int updateByExample(@Param("record") PluginParamTemplate record, @Param("example") PluginParamTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int updateByPrimaryKeySelective(PluginParamTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int updateByPrimaryKey(PluginParamTemplate record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin_Param_Template
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<PluginParamTemplate> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int updateWithOptimisticLock(PluginParamTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-12-13 00:27:34
     */
    int batchUpdate(@Param("recordList") List<PluginParamTemplate> recordList);
}