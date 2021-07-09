/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.pojo;

import com.kuta.base.annotation.PrimaryKey;
import com.kuta.base.database.KutaDBEntity;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table BS_Permission
 * @date 2021-07-09 21:55:39
 */
public class Permission extends KutaDBEntity implements Serializable {
    /**
     * @desc 权限编号
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    @PrimaryKey
    private Integer pid;

    /**
     * @desc 名称
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String name;

    /**
     * @desc 
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String alias;

    /**
     * @desc 简介
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String desc;

    /**
     * @desc 父级编号
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Integer parentRid;

    /**
     * @desc 层级
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String level;

    /**
     * @desc 深度
     * @jdbcType TINYINT
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Byte deep;

    /**
     * @desc 排序
     * @jdbcType SMALLINT
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Short idx;

    /**
     * @desc 权限归类
     * @jdbcType SMALLINT
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Short classify;

    /**
     * @desc 创建时间
     * @jdbcType TIMESTAMP
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Date created;

    /**
     * @date 2021-07-09 21:55:39
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-07-09 21:55:39
     */
    public Permission(Integer pid, String name, String alias, String desc, Integer parentRid, String level, Byte deep, Short idx, Short classify, Date created) {
        this.pid = pid;
        this.name = name;
        this.alias = alias;
        this.desc = desc;
        this.parentRid = parentRid;
        this.level = level;
        this.deep = deep;
        this.idx = idx;
        this.classify = classify;
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-07-09 21:55:39
     */
    public Permission() {
        super();
    }

    /**
     * @return pid : 权限编号
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid : 权限编号
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return name : 名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name : 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return alias : 
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias : 
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * @return desc : 简介
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc : 简介
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * @return parentRid : 父级编号
     */
    public Integer getParentRid() {
        return parentRid;
    }

    /**
     * @param parentRid : 父级编号
     */
    public void setParentRid(Integer parentRid) {
        this.parentRid = parentRid;
    }

    /**
     * @return level : 层级
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level : 层级
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * @return deep : 深度
     */
    public Byte getDeep() {
        return deep;
    }

    /**
     * @param deep : 深度
     */
    public void setDeep(Byte deep) {
        this.deep = deep;
    }

    /**
     * @return idx : 排序
     */
    public Short getIdx() {
        return idx;
    }

    /**
     * @param idx : 排序
     */
    public void setIdx(Short idx) {
        this.idx = idx;
    }

    /**
     * @return classify : 权限归类
     */
    public Short getClassify() {
        return classify;
    }

    /**
     * @param classify : 权限归类
     */
    public void setClassify(Short classify) {
        this.classify = classify;
    }

    /**
     * @return created : 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created : 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}