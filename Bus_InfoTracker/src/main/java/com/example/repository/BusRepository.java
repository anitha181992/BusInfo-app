package com.example.repository;

import java.util.List;

import com.example.model.BusInfo;

public interface BusRepository {
	
	public List<BusInfo> getBusList();

	public BusInfo createBusInfo(BusInfo info);

}
