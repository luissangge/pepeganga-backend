package uy.com.pepeganga.consuming_ws_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsumingWebserviceStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebserviceStoreApplication.class, args);
	}

}
