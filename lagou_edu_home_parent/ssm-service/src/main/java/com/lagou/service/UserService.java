package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.*;

import java.util.List;

public interface UserService {

    public PageInfo findAllUserByPage(UserVo userVo);

    public void updateUserStatus(int id,String status);

    public User login(User user) throws Exception;

    public List<Role> findUserRelationRoleById(Integer id);

    public void userContextRole(UserVo userVo);

    public ResponseResult getUserPermissions(Integer userid);
}
