package com.web.consumables.biz.userInfo.service;

import com.web.consumables.api.entity.UserInfo;
import com.web.core.service.BaseService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunhua
 * @since 2020-12-25
 */
public interface UserInfoService extends BaseService<UserInfo> {

    UserInfo findById(String id);
}
