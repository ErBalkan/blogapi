package com.erbalkan.blogapi.core.base;

import java.util.List;

import com.erbalkan.blogapi.core.utilities.result.abstracts.IDataResult;
import com.erbalkan.blogapi.core.utilities.result.abstracts.IResult;

public interface BaseService<
TCreateCommand extends BaseDto,
TUpdateCommand extends BaseDto,
TDeleteCommand extends BaseDto,
TQuery extends BaseDto
> {
    IResult add(TCreateCommand dto);
    IResult update(TUpdateCommand dto);
    IResult delete(TDeleteCommand dto);
    IDataResult<TQuery> getById(Long id); 
    IDataResult<List<TQuery>> getAll();     
}
