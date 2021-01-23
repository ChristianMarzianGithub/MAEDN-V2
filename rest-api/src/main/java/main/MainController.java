package main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@RestController
public class MainController {
	Game game = new Game();
		
	@GetMapping("/getWuerfeln")
	public int getWuerfeln(@RequestParam int anzahlPositionen) 
	{
		return game.wuerfeln();
	}
	
	@GetMapping("/figurSetzen")
	public int figurSetzen(@RequestParam int gewuerfelteZahl, @RequestParam int indexMomentanerSpieler) 
	{
		return game.figurSetzen(gewuerfelteZahl, indexMomentanerSpieler);
	}
	
	
	@GetMapping("/getStatus")
	public String getStatus() 
	{
		String json = "";
	
		 ObjectMapper mapper = new ObjectMapper();
		 
         try {
        	 mapper.enable(SerializationFeature.INDENT_OUTPUT);
             json = mapper.writeValueAsString(game);
            
             //System.out.println(json);
         } 
         catch (JsonProcessingException e) 
         {
             e.printStackTrace();
         }        
	        
	        
        return json;
	}
}