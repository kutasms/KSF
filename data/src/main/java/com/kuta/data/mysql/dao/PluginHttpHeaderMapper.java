/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.PluginHttpHeader;
import com.kuta.data.mysql.pojo.PluginHttpHeaderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginHttpHeaderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    long countByExample(PluginHttpHeaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int deleteByExample(PluginHttpHeaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int deleteByPrimaryKey(Integer phhid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int insert(PluginHttpHeader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int insertSelective(PluginHttpHeader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    List<PluginHttpHeader> selectByExample(PluginHttpHeaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    PluginHttpHeader selectByPrimaryKey(Integer phhid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int updateByExampleSelective(@Param("record") PluginHttpHeader record, @Param("example") PluginHttpHeaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int updateByExample(@Param("record") PluginHttpHeader record, @Param("example") PluginHttpHeaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int updateByPrimaryKeySelective(PluginHttpHeader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int updateByPrimaryKey(PluginHttpHeader record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin_Http_Header
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<PluginHttpHeader> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Header
     * @date 2021-07-09 21:55:39
     */
    int batchUpdate(@Param("recordList") List<PluginHttpHeader> recordList);
}