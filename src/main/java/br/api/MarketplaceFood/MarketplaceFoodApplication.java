package br.api.MarketplaceFood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MarketplaceFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceFoodApplication.class, args);
	}

}
