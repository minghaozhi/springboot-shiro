package com.shiro.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/8.
 */
@Table(name = "sys_resources")
public class SysResources implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 资源名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 资源url
     */
    @Column(name = "res_url")
    private String resUrl;

    /**
     * 资源类型   1:菜单    2：按钮
     */
    @Column(name = "type")
    private Integer type;

    /**
     * 父资源
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 排序
     */
    @Column(name = "sort")
    private Integer sort;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
