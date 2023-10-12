package JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import  main.java.json_parser.Json_Parser;

public class JsonTest {
	
	@Test
	void test() {
		
		//given
		String input = "{\"name\": \"Simon\"}";
		
		//when
		String output = Json_Parser.getNameFromJson(input);
		
		//then
		Assertions.assertEquals("Simon", output);
		
	}
	
	@Test
	void testNullInput() {
		
		//given
		String input = null;
		
		//when
		//String output = Json_Parser.getNameFromJson(input);
		
		//then
		final NullPointerException ex = Assertions.assertThrows(NullPointerException.class, () -> Json_Parser.parseString(input));
		Assertions.assertEquals("Input must not be null", ex.getMessage());		
	}
	@Test
	void testBadInput() {
		
		//given
		String input = "BAD";
		
		//when
		//String output = Json_Parser.parseString(input);
		
		//then
		final IllegalStateException ex = Assertions.assertThrows(IllegalStateException.class, () -> Json_Parser.parseString(input));
		Assertions.assertEquals("Input must have a key", ex.getMessage());		
	}
	/*@Test
	void testNoInput() {
		
		//given
		String input = "name:";
		
		//when
		String output = Json_Parser.parseString(input);
		
		//then
		final NullPointerException ex = Assertions.assertThrows(NullPointerException.class, () -> Json_Parser.parseString(input));
		Assertions.assertEquals("Input must not be null", ex.getMessage());		
	}
*/
	
}
