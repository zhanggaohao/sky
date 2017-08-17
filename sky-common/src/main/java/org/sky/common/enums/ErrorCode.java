package org.sky.common.enums;

public enum ErrorCode {
    
    SYSTEM_SUCCESS("000000", "操作成功。"),
    SYSTEM_ERROR("000001", "系统异常，请联系管理员。"),
    
    PARAMS_ERROR("P00000", "参数异常。"),
    
    ACCOUNT_NOT_EXIST("U00000", "帐号不存在。"),
    
    PASSWORD_ERROR("P00000", "密码不正确。");
    
    private String code;
    private String massage;
    private ErrorCode(String code, String massage) {
        this.code = code;
        this.massage = massage;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMassage() {
        return massage;
    }
    public void setMassage(String massage) {
        this.massage = massage;
    }
    
}
