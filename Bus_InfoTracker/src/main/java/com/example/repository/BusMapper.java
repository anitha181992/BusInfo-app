package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.BusInfo;

public class BusMapper implements RowMapper<BusInfo>{

	public BusInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BusInfo info = new BusInfo();
		info.setBusNumber(rs.getInt("bus_number"));
		info.setBusName(rs.getString("bus_name"));
		info.setBusRoute(rs.getInt("bus_route"));
		info.setBusSource(rs.getString("bus_source"));
		info.setBusDestination(rs.getString("bus_destination"));
		
		return info;
	}

}
