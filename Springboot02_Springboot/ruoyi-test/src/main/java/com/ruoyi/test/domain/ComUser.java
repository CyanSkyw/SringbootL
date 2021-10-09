package com.ruoyi.test.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户信息对象 com_user
 * 
 * @author ruoyi
 * @date 2021-09-29
 */
public class ComUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private String userid;

    /** 登录帐号 */
    @Excel(name = "登录帐号")
    private String logincount;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String username;

    /** 部门编号 */
    @Excel(name = "部门编号")
    private String orgid;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 类别 */
    @Excel(name = "类别")
    private String usertype;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 企业代码或公司编号 */
    @Excel(name = "企业代码或公司编号")
    private String gongsibianhao;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String orgname;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserid(String userid) 
    {
        this.userid = userid;
    }

    public String getUserid() 
    {
        return userid;
    }
    public void setLogincount(String logincount) 
    {
        this.logincount = logincount;
    }

    public String getLogincount() 
    {
        return logincount;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setOrgid(String orgid) 
    {
        this.orgid = orgid;
    }

    public String getOrgid() 
    {
        return orgid;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setUsertype(String usertype) 
    {
        this.usertype = usertype;
    }

    public String getUsertype() 
    {
        return usertype;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setGongsibianhao(String gongsibianhao) 
    {
        this.gongsibianhao = gongsibianhao;
    }

    public String getGongsibianhao() 
    {
        return gongsibianhao;
    }
    public void setOrgname(String orgname) 
    {
        this.orgname = orgname;
    }

    public String getOrgname() 
    {
        return orgname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userid", getUserid())
            .append("logincount", getLogincount())
            .append("username", getUsername())
            .append("orgid", getOrgid())
            .append("password", getPassword())
            .append("usertype", getUsertype())
            .append("status", getStatus())
            .append("gongsibianhao", getGongsibianhao())
            .append("orgname", getOrgname())
            .toString();
    }
}
