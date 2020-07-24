package com.example.service;

import java.util.List;

import com.example.model.BusInfo;

public interface BusService {
	
	public List<BusInfo> getBusList();
	
	public BusInfo createBusInfo(BusInfo info);

}
