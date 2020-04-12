package com.wzh;

import com.wzh.dao.CityMapper;
import com.wzh.domain.Province;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private CityMapper cityMapper;

    @Test
    void contextLoads() {
        List<Province> plist = cityMapper.proList();
        System.out.println(plist.toString());
    }
}
