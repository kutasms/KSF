/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.pojo;

import com.kuta.base.annotation.PrimaryKey;
import com.kuta.base.database.KutaDBEntity;
import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table BS_UserPermRel
 * @date 2021-07-09 21:55:39
 */
public class UserPermRelKey extends KutaDBEntity implements Serializable {
    /**
     * @desc 
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    @PrimaryKey
    private Integer uid;

    /**
     * @desc 
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    @PrimaryKey
    private Integer pid;

    /**
     * @date 2021-07-09 21:55:39
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserPermRel
     * @date 2021-07-09 21:55:39
     */
    public UserPermRelKey(Integer uid, Integer pid) {
        this.uid = uid;
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserPermRel
     * @date 2021-07-09 21:55:39
     */
    public UserPermRelKey() {
        super();
    }

    /**
     * @return uid : 
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid : 
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return pid : 
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid : 
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}