package com.lagou.dao;

import com.lagou.domain.Resource;
import com.lagou.domain.ResourseVo;

import java.util.List;

public interface ResourceMapper {

    public List<Resource> findAllResourceByPage(ResourseVo resourceVo);
}
