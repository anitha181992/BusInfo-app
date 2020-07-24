package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.BusInfo;
import com.example.repository.BusRepository;

@Service("busService")
public class BusServiceImpl implements BusService {
	
	@Autowired
    public BusRepository busRepository;

	public List<BusInfo> getBusList() {
		
		return busRepository.getBusList();
	}

	public BusInfo createBusInfo(BusInfo info) {
		
		return busRepository.createBusInfo(info);
	}
	
	
}
