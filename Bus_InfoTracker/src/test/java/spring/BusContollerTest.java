package spring;

import java.util.List;

import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.model.BusInfo;

public class BusContollerTest {
	
	@Test
	public void testCreateBusInfo() {
		RestTemplate restTemplate = new RestTemplate();
		
		BusInfo bus = new BusInfo();
		bus.setBusName("Flyair");
		bus.setBusNumber(8);
		bus.setBusRoute(7);
		bus.setBusSource("Vienna");
		bus.setBusDestination("Delhi");
		
		restTemplate.put("http://localhost:8080/spring/bus",bus);
		
	}
	
	@Test
	public void testGetBusList() {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<BusInfo>> ridesResponse = restTemplate.exchange(
				"http://localhost:8080/spring/businfo", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<BusInfo>>() {
				});
		List<BusInfo> rides = ridesResponse.getBody();

		for (BusInfo info: rides) {
			System.out.println("Ride name: " + info.getBusName());
	}

}
}
