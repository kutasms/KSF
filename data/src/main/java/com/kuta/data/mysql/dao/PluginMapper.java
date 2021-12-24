/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.Plugin;
import com.kuta.data.mysql.pojo.PluginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    long countByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int deleteByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int deleteByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int insert(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int insertSelective(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    List<Plugin> selectByExample(PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    Plugin selectByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int updateByExampleSelective(@Param("record") Plugin record, @Param("example") PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int updateByExample(@Param("record") Plugin record, @Param("example") PluginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int updateByPrimaryKeySelective(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int updateByPrimaryKey(Plugin record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<Plugin> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int updateWithOptimisticLock(Plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin
     * @date 2021-12-13 00:27:34
     */
    int batchUpdate(@Param("recordList") List<Plugin> recordList);
}