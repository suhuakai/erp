package com.web.consumables.biz.userInfo.web;


import com.web.common.security.permission.annotation.Opened;
import com.web.consumables.api.entity.UserInfo;
import com.web.consumables.biz.userInfo.service.UserInfoService;
import com.web.core.util.LocalAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sunhua
 * @since 2020-12-25
 */
@RestController
@RequestMapping("/userInfo")
@Opened
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;
    /**
     * 详情
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public UserInfo findById(String id){
        LocalAssert.notNull(id,"ID不允许为空");
        return  userInfoService.findById(id);
       // return userInfoService.findById(id);
    }

}
