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
 * This class corresponds to the database table BS_Script
 * @date 2021-07-09 21:55:39
 */
public class Script extends KutaDBEntity implements Serializable {
    /**
     * @desc 命令集编号
     * @jdbcType BIGINT
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    @PrimaryKey
    private Long sid;

    /**
     * @desc 名称
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String name;

    /**
     * @desc 简介
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String desc;

    /**
     * @desc 分类
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Integer category;

    /**
     * @desc 分类数组
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String categoryArray;

    /**
     * @desc 分类名称集合
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String categoryNames;

    /**
     * @desc 文件名称
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String fileName;

    /**
     * @desc 资源web路径
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String resUrl;

    /**
     * @desc 状态
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String status;

    /**
     * @desc 创建人
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Integer uid;

    /**
     * @desc 
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Integer oid;

    /**
     * @desc 创建时间
     * @jdbcType TIMESTAMP
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Date created;

    /**
     * @desc 最后修改时间
     * @jdbcType TIMESTAMP
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private Date modified;

    /**
     * @desc 在mongodb中备份的命令集ID
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-07-09 21:55:39
     */
    private String backupSid;

    /**
     * @date 2021-07-09 21:55:39
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script
     * @date 2021-07-09 21:55:39
     */
    public Script(Long sid, String name, String desc, Integer category, String categoryArray, String categoryNames, String fileName, String resUrl, String status, Integer uid, Integer oid, Date created, Date modified, String backupSid) {
        this.sid = sid;
        this.name = name;
        this.desc = desc;
        this.category = category;
        this.categoryArray = categoryArray;
        this.categoryNames = categoryNames;
        this.fileName = fileName;
        this.resUrl = resUrl;
        this.status = status;
        this.uid = uid;
        this.oid = oid;
        this.created = created;
        this.modified = modified;
        this.backupSid = backupSid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script
     * @date 2021-07-09 21:55:39
     */
    public Script() {
        super();
    }

    /**
     * @return sid : 命令集编号
     */
    public Long getSid() {
        return sid;
    }

    /**
     * @param sid : 命令集编号
     */
    public void setSid(Long sid) {
        this.sid = sid;
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
     * @return category : 分类
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * @param category : 分类
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * @return categoryArray : 分类数组
     */
    public String getCategoryArray() {
        return categoryArray;
    }

    /**
     * @param categoryArray : 分类数组
     */
    public void setCategoryArray(String categoryArray) {
        this.categoryArray = categoryArray == null ? null : categoryArray.trim();
    }

    /**
     * @return categoryNames : 分类名称集合
     */
    public String getCategoryNames() {
        return categoryNames;
    }

    /**
     * @param categoryNames : 分类名称集合
     */
    public void setCategoryNames(String categoryNames) {
        this.categoryNames = categoryNames == null ? null : categoryNames.trim();
    }

    /**
     * @return fileName : 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName : 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * @return resUrl : 资源web路径
     */
    public String getResUrl() {
        return resUrl;
    }

    /**
     * @param resUrl : 资源web路径
     */
    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    /**
     * @return status : 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status : 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return uid : 创建人
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid : 创建人
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return oid : 
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * @param oid : 
     */
    public void setOid(Integer oid) {
        this.oid = oid;
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

    /**
     * @return modified : 最后修改时间
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified : 最后修改时间
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * @return backupSid : 在mongodb中备份的命令集ID
     */
    public String getBackupSid() {
        return backupSid;
    }

    /**
     * @param backupSid : 在mongodb中备份的命令集ID
     */
    public void setBackupSid(String backupSid) {
        this.backupSid = backupSid == null ? null : backupSid.trim();
    }
}