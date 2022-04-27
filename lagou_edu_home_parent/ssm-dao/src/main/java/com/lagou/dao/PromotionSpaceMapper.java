package com.lagou.dao;

import com.lagou.domain.PromotionSpace;

import java.util.List;

public interface PromotionSpaceMapper {

    public List<PromotionSpace> findAllPromotionSpace();

    public void saveOrUpdatePromotionSpace(PromotionSpace promotionSpace);

    public PromotionSpace findPromotionSpaceById(int id);

    public void updatePromotionSpace(PromotionSpace promotionSpace);
}
