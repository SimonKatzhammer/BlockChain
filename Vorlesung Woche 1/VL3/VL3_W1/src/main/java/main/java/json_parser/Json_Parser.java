package main.java.json_parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Json_Parser {

	private final static Logger logger = LoggerFactory.getLogger(Json_Parser.class);

	public static void main(String[] args) {
		logger.info("Anwendung startet schön :)");
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse("{\"name\": \"Simon\"}");
		logger.info("Name übergeben erfolgreich");

		JsonObject object = element.getAsJsonObject();
		String name = object.get("name").getAsString();
		logger.info("{}", "erfolgreich alles");
		//System.out.println(getNameFromJson("{\"name\\\": \\\"Simon\\\"}"));

	}

	public static String getNameFromJson(String json) {
		
		if(json == null) {
			throw new NullPointerException("input must not be null");		
		}
		
		logger.info("Anwendung startet schön :)");
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(json);
		logger.info("Name übergeben erfolgreich");

		JsonObject object = element.getAsJsonObject();
		String name = object.get("name").getAsString();
		logger.info("{}", "erfolgreich alles");

		return name;
	}
	
public static String parseString(String json) {
		
	
	
	
		if(json == null) {
			throw new NullPointerException("Input must not be null");		
		}
		if(json == "BAD") {
			throw new IllegalStateException("Input must have a key");		
		}
		//if(json == "{\"name\":}") {
		//	throw new Illegal("Input must not be empty");		
		//}
		
		return null;
}

}
