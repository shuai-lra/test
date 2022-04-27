package com.lagou.dao;

import com.lagou.domain.Menu;

import java.util.List;

public interface MenuMapper {

    public List<Menu> findSubMenuListByPid(int pid);

    public List<Menu> findAllMenu();

    public Menu findMenuInfoById(Integer id);
}
