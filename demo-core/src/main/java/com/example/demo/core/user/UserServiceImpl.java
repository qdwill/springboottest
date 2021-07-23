package com.example.demo.core.user;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.master.mapper.TUserInfoMapper;
import com.example.demo.dao.master.model.TUserInfo;
import com.example.demo.dao.master.model.TUserInfoExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TUserInfoMapper userInfoMapper;

    @Override
    public String getUserInfo() {
        Logger log=LoggerFactory.getLogger(UserServiceImpl.class);
        TUserInfoExample userInfoExample = new TUserInfoExample();
        userInfoExample.createCriteria().andAccountEqualTo("01439090");
        List<TUserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("userInfoList",userInfoList.get(0));
        log.info(jsonObject.toJSONString());
        return jsonObject.toJSONString();
    }
}
