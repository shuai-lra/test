package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PromotionAdService {

    public PageInfo<PromotionAd> findAllPromotionAdByPage(PromotionAdVO promotionAdVO);

    public void savePromotionAd(PromotionAd promotionAd);

    public PromotionAd findPromotionAdById(int id);

    public void updatePromotionAd(PromotionAd promotionAd);

    public void updatePromotionAdStatus(int id,int status);
}
