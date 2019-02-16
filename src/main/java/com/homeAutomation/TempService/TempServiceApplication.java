package com.homeAutomation.TempService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TempServiceApplication {
//	static private Thread backgroundThread;

	public static void main(String[] args) {
//		backgroundThread = new Thread(new TemperatureProvider());
//		backgroundThread.start();
		SpringApplication.run(TempServiceApplication.class, args);
	}

}

