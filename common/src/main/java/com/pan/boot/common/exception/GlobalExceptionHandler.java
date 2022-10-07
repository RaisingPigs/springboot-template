package com.pan.boot.common.exception;

import com.pan.boot.common.result.BaseResponse;
import com.pan.boot.common.result.ResultCode;
import com.pan.boot.common.result.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description:
 * @author: Mr.Pan
 * @create: 2022-10-07 14:26
 **/
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public <T> BaseResponse<T> businessExceptionHandler(BusinessException e) {
        log.error("" + e.getMessage(), e);
        return ResultVo.failed(e.getCode(), e.getMessage(), e.getDesc());
    }

    @ExceptionHandler(Exception.class)
    public <T> BaseResponse<T> exceptionHandler(Exception e) {
        log.error("" + e.getMessage(), e);
        return ResultVo.failed(ResultCode.SYSTEM_ERR, e.getMessage(), "");
    }
}
