package com.erbalkan.blogapi.business.abstracts;

import com.erbalkan.blogapi.business.dtos.category.command.CategoryCreateCommand;
import com.erbalkan.blogapi.business.dtos.category.command.CategoryDeleteCommand;
import com.erbalkan.blogapi.business.dtos.category.command.CategoryUpdateCommand;
import com.erbalkan.blogapi.business.dtos.category.query.CategoryQuery;
import com.erbalkan.blogapi.core.base.BaseService;

public interface CategoryService extends BaseService<
CategoryCreateCommand,
CategoryUpdateCommand,
CategoryDeleteCommand,
CategoryQuery
> {}
