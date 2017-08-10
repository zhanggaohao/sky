package org.sky.common.httpResult;

import org.sky.common.enums.ErrorCode;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月18日 下午11:36:31
 */
public class Result {
    //编码
    private String code;
    //消息
    private String message;
    //返回结果
    private Object data;
    //单例对象
    private static volatile Result result;
    /**
     * @annotation 单例模式
     * @return
     */
    public static Result getInstance() {
        if (result == null) {
            synchronized (Result.class) {
                if (result == null) {
                    result = new Result();
                    result.setErrorCode(ErrorCode.SYSTEM_SUCCESS);
                }
            }
        }
        return result;
    }
    /**
     * 禁止外部使用new创建对象
     */
    private Result() {
        super();
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Result [code=" + code + ", message=" + message + ", data=" + data + "]";
    }
    public void setErrorCode(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMassage();
    }
    
}
