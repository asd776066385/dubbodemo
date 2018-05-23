package com.service.impl;

import com.model.UserVO;
import com.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    /**
     *
     * @return
     */
    public List<UserVO> getAllUser() {
        List<UserVO> userVOList = new ArrayList<UserVO>();
        for (int i = 0; i < 10; i++) {
            UserVO userVO = new UserVO();
            userVO.setId("00"+i);
            userVO.setName("test"+i);
            userVOList.add(userVO);
        }
        return userVOList;
    }
}
