package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NetflixRibbonController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String callService() {
		return restTemplate.getForEntity("http://eurekaservice", String.class).getBody();
	}

}
