package com.erbalkan.blogapi.core.utilities.result.concretes.success;

import com.erbalkan.blogapi.core.utilities.result.concretes.DataResult;

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data) {
        super(data, true);
    }
    public SuccessDataResult(T data, String message){
        super(data,true,message);
    }
    public SuccessDataResult(String message){
        super(null,true,message);
    }

}
