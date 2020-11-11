package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;

//import assignment.App;

public class Tests {


   @Test
   public void testTopFiveMovies(){
       
       //actual
       String actual = App.topFiveMovies("a", "b", "c", "d", "e");
       
       
       App.main(null);
       //expected
       //assertEquals(EXPECTED RESULT, App.METHODtoTEST, "ERROR MESSAGE");
       assertEquals("a, b, c, d, e", actual, "INCORRECT: Make sure you are using commas and spaces between movies. Check the exmaple in the readme for formatting.");
   }

}
