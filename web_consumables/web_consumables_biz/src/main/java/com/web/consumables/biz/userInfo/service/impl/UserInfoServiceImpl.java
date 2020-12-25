package com.web.consumables.biz.userInfo.service.impl;

import com.web.consumables.api.entity.UserInfo;
import com.web.consumables.biz.userInfo.dao.UserInfoMapper;
import com.web.consumables.biz.userInfo.service.UserInfoService;
import com.web.core.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunhua
 * @since 2020-12-25
 */
@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Override
    public UserInfo findById(String id) {
        return baseMapper.selectById(id);
    }
}
