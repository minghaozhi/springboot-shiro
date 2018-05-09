package com.shiro.model;
import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/8.
 */
@Table(name = "sys_user")
public class SysUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String passWord;

    /**
     * 是否启用
     */
    @Column(name = "enable")
    private Integer Enable;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return pass_word
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getEnable() {
        return Enable;
    }

    public void setEnable(Integer enable) {
        Enable = enable;
    }
}
