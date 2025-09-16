package com.erbalkan.blogapi.core.utilities.result.concretes.error;

import com.erbalkan.blogapi.core.utilities.result.concretes.Result;

public class ErrorResult extends Result{

    public ErrorResult(){
        super(false);
    }
    public ErrorResult(String message){
        super(false,message);
    }
}
