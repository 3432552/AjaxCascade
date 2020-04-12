package com.wzh.service.impl;

import com.wzh.dao.CityMapper;
import com.wzh.domain.City;
import com.wzh.domain.Province;
import com.wzh.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wzh
 * @ClassName: CityServiceImpl
 * @Description:
 * @Date: 2020/4/12 17:17
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<Province> proList() {
        return cityMapper.proList();
    }

    @Override
    public List<City> selectById(String pid) {
        return cityMapper.selectById(pid);
    }
}
