package cn.whb.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haiboWu
 * @create 2020-03-18 11:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T  data;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
