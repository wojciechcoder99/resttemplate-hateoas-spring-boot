package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import clients.RestTemplateClient;
import entity.Ingredient;

@SpringBootApplication
public class RestTemplateHateoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateHateoasApplication.class, args);
		RestTemplateClient restTemplateClient = new RestTemplateClient();
		System.out.println(restTemplateClient.getIngredientById("13").toString());
		ArrayList<Ingredient> ingredients = restTemplateClient.getIngredients().getBody();
		System.out.println(ingredients);
		
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
