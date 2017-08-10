package org.sky.common.enums;

public enum ErrorCode {
    
    SYSTEM_SUCCESS("000000", "操作成功."),
    PARAMS_IS_NULL("000001", "参数异常.");
    
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
