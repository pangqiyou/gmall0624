package com.atguigu.gamll0624.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0624.bean.*;
import com.atguigu.gmall0624.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ManageController {

    @Reference
    private ManageService manageService;

    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){
        return  manageService.getCatalog1();
    }
    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        return  manageService.getCatalog2(catalog1Id);
    }

    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        return  manageService.getCatalog3(catalog2Id);
    }

    // http://localhost:8082/attrInfoList?catalog3Id=61
    @RequestMapping("attrInfoList")
    public List<BaseAttrInfo> attrInfoList(BaseAttrInfo baseAttrInfo,String catalog3Id ){
        return manageService.getAttrInfoList(catalog3Id);
    }

    @RequestMapping("saveAttrInfo")
    public void saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo){
         manageService.saveAttrInfo(baseAttrInfo);
    }

    @RequestMapping("getAttrValueList")
    public List<BaseAttrValue> getAttrValueList(String   attrId){
      BaseAttrInfo baseAttrInfo=  manageService.getAttrInfo(attrId);
      return baseAttrInfo.getAttrValueList();
      //return  manageService.getAttrValueList(attrId);
    }

}
