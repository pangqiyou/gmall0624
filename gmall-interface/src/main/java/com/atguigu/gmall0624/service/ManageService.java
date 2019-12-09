package com.atguigu.gmall0624.service;

import com.atguigu.gmall0624.bean.*;

import java.util.List;

public interface ManageService {

    //查询所有的一级分类信息
    List<BaseCatalog1> getCatalog1();

    //根据一级分类id查询二级分类信息
    List<BaseCatalog2> getCatalog2(String catalog1Id);

    //根据二级分类id查询三级分类信息
    List<BaseCatalog3> getCatalog3(String catalog2Id);


    /**
     * 通过三级分类id获取平台属性数据
     * @param baseAttrInfo
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);


    /**
     * 保存平台属性
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 通过appid查询平台属性值集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(String attrId);

    /**
     * 通过平台属性id查询平台属性对象
     * @param attrId
     * @return
     */
    BaseAttrInfo getAttrInfo(String attrId);

    List<SpuInfo>  getSpuList(String catalog3Id);

    /**
     * 根据spuinfo 属性查询spuinfo集合
     * @param spuInfo
     * @return
     */
    List<SpuInfo>  getSpuList(SpuInfo spuInfo);

    // 查询基本销售属性表
    List<BaseSaleAttr> getBaseSaleAttrList();

    /**
     * 保存spuinfo数据
     * @param spuInfo
     */
    void saveSpuInfo(SpuInfo spuInfo);

    /**
     * 根据属性查找图片集合
     * @param spuImage
     * @return
     */
    List<SpuImage> getSpuImageList(SpuImage spuImage);

    /**
     * 根据三级分类名称查询平台属性数据
     * @param catalog3Id
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(String catalog3Id);

    /**
     * 根据spuId查询销售属性集合
     * @param spuId
     * @return
     */
    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    /**
     * 保存skuInfo信息
     * @param skuInfo
     */
    void saveSkuInfo(SkuInfo skuInfo);
}
