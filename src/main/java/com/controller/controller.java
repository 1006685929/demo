package com.controller;

import com.pojo.SensorData;
import com.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//前端控制器
@Controller
@RequestMapping("/sensor")
public class controller {
    @Autowired
    private DataService dataService;

    @RequestMapping("/allData")
    public String list(Model model){
        List<SensorData> list = dataService.showAll();
        model.addAttribute("list", list);
        return "allData";
    }
}
