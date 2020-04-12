package com.wzh.dao;

import com.wzh.domain.City;
import com.wzh.domain.Province;

import java.util.List;

/**
 * @Author: wzh
 * @ClassName: CityMapper.xml
 * @Description:
 * @Date: 2020/4/12 16:40
 */
public interface CityMapper {
    //查询全部
    List<Province> proList();

    //根据省份查询
    List<City> selectById(String pid);
}
