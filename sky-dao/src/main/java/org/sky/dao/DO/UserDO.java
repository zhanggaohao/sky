package org.sky.dao.DO;

import java.util.Date;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月18日 下午11:24:58
 */
public class UserDO {
    //主键
    private String id;
    //昵称
    private String nickname;
    //帐号
    private String account;
    //密码
    private String password;
    //创建时间
    private Date createtime;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    @Override
    public String toString() {
        return "UserDO [id=" + id + ", nickname=" + nickname + ", account=" + account + ", password=" + password
                + ", createtime=" + createtime + "]";
    }
}
