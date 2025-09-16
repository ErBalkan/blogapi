package com.erbalkan.blogapi.core.utilities.result.concretes;

import com.erbalkan.blogapi.core.utilities.result.abstracts.IResult;

public class Result implements IResult {

    private final boolean success;
    private final String message;

    public Result(boolean success) {
        this.success = success;
        this.message = null;
    }

    public Result(boolean success,String message){
        this.success = success;
        this.message = message;
    }
    @Override
    public boolean isSuccess() {
        return this.success;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
