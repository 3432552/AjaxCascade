package com.wzh.service;

import com.wzh.domain.City;
import com.wzh.domain.Province;

import java.util.List;

/**
 * @Author: wzh
 * @ClassName: CityService
 * @Description:
 * @Date: 2020/4/12 17:17
 */
public interface CityService {
    //查询全部
    List<Province> proList();

    //根据省份查询
    List<City> selectById(String pid);
}
