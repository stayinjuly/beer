package cn.lzm.beer.common;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import static cn.lzm.beer.common.Constants.FAIL;
import static cn.lzm.beer.common.Constants.SUCCESS;

/**
 * 响应信息主体
 *
 * @author lzm
 * @date 2023/3/13
 */
@Getter
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Setter
    private int code;

    @Setter
    private String msg;

    @Setter
    private T data;

    public static <T> R<T> ok()
    {
        return restResult(null, SUCCESS, null);
    }

    public static <T> R<T> ok(T data)
    {
        return restResult(data, SUCCESS, null);
    }

    public static <T> R<T> ok(T data, String msg)
    {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> R<T> fail()
    {
        return restResult(null, FAIL, null);
    }

    public static <T> R<T> fail(String msg)
    {
        return restResult(null, FAIL, msg);
    }

    public static <T> R<T> fail(T data)
    {
        return restResult(data, FAIL, null);
    }

    public static <T> R<T> fail(T data, String msg)
    {
        return restResult(data, FAIL, msg);
    }

    public static <T> R<T> fail(int code, String msg)
    {
        return restResult(null, code, msg);
    }

    private static <T> R<T> restResult(T data, int code, String msg)
    {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

}
