package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.BusInfo;

@Repository("busRepository")
public class BusRepositoryImpl implements BusRepository{

	@Autowired
	private JdbcTemplate jdbctemplate;
	private final String SQL_GET = "select * from bus_info";
	
	public List<BusInfo> getBusList() {
//		BusInfo bus = new BusInfo();
//		bus.setBusName("AirBus");
//		bus.setBusNumber(1);
//		bus.setBusRoute(1001);
//		bus.setBusSource("Vienna");
//		bus.setBusDestination("Prague");
//		List<BusInfo> busList = new ArrayList<BusInfo>();
//		busList.add(bus);
		return jdbctemplate.query(SQL_GET, new BusMapper());
	}

	public BusInfo createBusInfo(BusInfo info) {
		jdbctemplate.update("insert into bus_info(bus_number,bus_name,bus_route,bus_source,bus_destination) values (?,?,?,?,?)",
				info.getBusNumber(),info.getBusName(),info.getBusRoute(),info.getBusSource(),info.getBusDestination());
				
				
		return null;
	}

}
