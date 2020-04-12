package com.wzh.controller;

import com.wzh.common.Result;
import com.wzh.domain.City;
import com.wzh.domain.Province;
import com.wzh.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: wzh
 * @ClassName: ProvinceController
 * @Description:
 * @Date: 2020/4/12 16:43
 */
@Controller
public class ProvinceController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/selList")
    @ResponseBody
    public Result selectAllMes() {
        List<Province> pList = cityService.proList();
        return Result.ok(pList);
    }

    @RequestMapping("/selByCity")
    @ResponseBody
    public Result selectById(String id) {
        System.out.println("id============>"+id);
        List<City> pList = cityService.selectById(id);
        return Result.ok(pList);
    }

    @RequestMapping("/index")
    public String index() {
        return "city";
    }
}
