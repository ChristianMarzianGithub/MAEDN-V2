package main;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@RestController
public class MainController {
	Game game = new Game();
		
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/getWuerfeln")
	public String getWuerfeln() 
	{
		String json = "";
		
		ObjectMapper mapper = new ObjectMapper();
		 
        try {
       	 mapper.enable(SerializationFeature.INDENT_OUTPUT);
         json = mapper.writeValueAsString(game.wuerfeln());
        } 
        catch (JsonProcessingException e) 
        {
            e.printStackTrace();
        }        
	        
	        
       return json;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")	
	@GetMapping("/figurSetzen")
	public int figurSetzen(@RequestParam int gewuerfelteZahl, @RequestParam int indexMomentanerSpieler, @RequestParam String position) 
	{
		return game.figurSetzen(gewuerfelteZahl, indexMomentanerSpieler,position);
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
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