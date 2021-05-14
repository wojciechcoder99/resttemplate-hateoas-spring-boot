package clients;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import entity.Ingredient;
import utils.URL;

public class RestTemplateClient {
	private RestTemplate restTemplate;
	
	public RestTemplateClient() {
		this.restTemplate = new RestTemplate();
	}
	
	public Ingredient getIngredientById(String ingredientId) {
		return restTemplate.getForObject(URL.INGREDIENT.toString(), 
				Ingredient.class, ingredientId);
	}
	
	public ResponseEntity<? extends ArrayList<Ingredient>> getIngredients() {
		return restTemplate.getForEntity(URL.INGREDIENTS.toString(),
				(Class<? extends ArrayList<Ingredient>>)ArrayList.class);
	}
}
