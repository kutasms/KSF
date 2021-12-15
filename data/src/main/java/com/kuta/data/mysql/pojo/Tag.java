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
 * This class corresponds to the database table BS_Tag
 * @date 2021-12-13 00:27:34
 */
public class Tag extends KutaDBEntity implements Serializable {
    /**
     * @desc 
     * @jdbcType BIGINT
     * @author mybatis generator
     * @date 2021-12-13 00:27:34
     */
    @PrimaryKey
    private Long tid;

    /**
     * @desc 
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-12-13 00:27:34
     */
    private Integer uid;

    /**
     * @desc 
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-12-13 00:27:34
     */
    private String color;

    /**
     * @desc 
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-12-13 00:27:34
     */
    private String name;

    /**
     * @date 2021-12-13 00:27:34
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-12-13 00:27:34
     */
    public Tag(Long tid, Integer uid, String color, String name) {
        this.tid = tid;
        this.uid = uid;
        this.color = color;
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Tag
     * @date 2021-12-13 00:27:34
     */
    public Tag() {
        super();
    }

    /**
     * @return tid : 
     */
    public Long getTid() {
        return tid;
    }

    /**
     * @param tid : 
     */
    public void setTid(Long tid) {
        this.tid = tid;
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
     * @return color : 
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color : 
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * @return name : 
     */
    public String getName() {
        return name;
    }

    /**
     * @param name : 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}