package com.erbalkan.blogapi.business.abstracts;

import com.erbalkan.blogapi.business.dtos.post.command.PostCreateCommand;
import com.erbalkan.blogapi.business.dtos.post.command.PostDeleteCommand;
import com.erbalkan.blogapi.business.dtos.post.command.PostUpdateCommand;
import com.erbalkan.blogapi.business.dtos.post.query.PostQuery;
import com.erbalkan.blogapi.core.base.BaseService;

public interface PostService extends BaseService<
PostCreateCommand,
PostUpdateCommand,
PostDeleteCommand,
PostQuery
>  {}
