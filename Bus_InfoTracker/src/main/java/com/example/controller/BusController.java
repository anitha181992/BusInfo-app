package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.BusInfo;
import com.example.service.BusService;

@Controller
public class BusController {
	
	@Autowired
    public BusService busService;
	
	@RequestMapping(value = "/bus", method = RequestMethod.PUT)
	public @ResponseBody BusInfo createBusInfo(@RequestBody BusInfo info){
		return busService.createBusInfo(info);
		}
	
	@RequestMapping(value = "/businfo", method = RequestMethod.GET)
	public @ResponseBody List<BusInfo> getBusList(){
		System.out.print(busService.getBusList());
		return busService.getBusList();
	}
}
