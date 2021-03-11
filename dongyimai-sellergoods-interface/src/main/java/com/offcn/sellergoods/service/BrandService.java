package com.offcn.sellergoods.service;

import com.offcn.entity.PageResult;
import com.offcn.pojo.TbBrand;

import java.util.List;

/**
 * @author By--tgl
 * @time 2021/2/23$ 16:05$
 * @Version: 1.0
 * @Description 描述:
 */
public interface BrandService {
    /**
     * 返回全部列表
     * @return
     */
    List<TbBrand> findAll();
    /**
     * 返回分页列表
     * @return 分页
     * @param pageNum 分页的每页数量
     * @param pageSize 分页的页数
     */
    PageResult findPage(int pageNum,int pageSize);
}
