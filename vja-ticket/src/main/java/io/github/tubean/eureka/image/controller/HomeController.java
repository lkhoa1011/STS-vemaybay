package io.github.tubean.eureka.image.controller;


import io.github.tubean.eureka.image.entity.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private Environment env;

	@RequestMapping("/")
	public String home() {
		// This is useful for debugging
		// When having multiple instance of image service running at different ports.
		// We load balance among them, and display which instance received the request.
		return "Hello from Image Service running at port: " + env.getProperty("local.server.port");
	}
		
	@RequestMapping("/ticket")
	public  List<Ticket> getTicket() {
		List<Ticket> ticket = Arrays.asList(
				new Ticket(1, "10-04-2020", "15-04-2020", "HP-DaNang", "2"),
				new Ticket(2, "10-04-2020", "15-04-2020", "HN-HP", "2"),
				new Ticket(3, "10-04-2020", "15-04-2020", "HCM-PhuQuoc", "1"),
				new Ticket(4, "10-04-2020", "15-04-2020", "HCM-NgheAn", "1"),
				new Ticket(5, "10-04-2020", "15-04-2020", "HCM-GiaLai", "2")	
				);
		return ticket;
	}
}