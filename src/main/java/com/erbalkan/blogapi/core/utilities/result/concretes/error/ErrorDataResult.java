package com.erbalkan.blogapi.core.utilities.result.concretes.error;

import com.erbalkan.blogapi.core.utilities.result.concretes.DataResult;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data) {
        super(data, false);
    }
    public ErrorDataResult(T data, String message){
        super(data,false,message);
    }
    public ErrorDataResult(String message){
        super(null,false,message);
    }

}
