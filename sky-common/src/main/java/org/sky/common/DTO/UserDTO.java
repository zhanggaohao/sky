package org.sky.common.DTO;

public class UserDTO {
    private String nickname;
    private String account;
    private String password;
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
    @Override
    public String toString() {
        return "UserDTO [nickname=" + nickname + ", account=" + account + ", password=" + password + "]";
    }
}