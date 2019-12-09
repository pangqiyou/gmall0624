package com.atguigu.gmall0624.manage.mapper;

import com.atguigu.gmall0624.bean.BaseAttrInfo;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface BaseAttrInfoMapper extends BaseMapper<BaseAttrInfo> {

    //根据三级分类id查询平台属性数据
    List<BaseAttrInfo> selectBaseAttrInfoListByCatalog3Id(String catalog3Id);
}
