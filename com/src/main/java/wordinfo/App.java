package wordinfo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("text", "hello new world 2th ");

        
        System.out.println(callExecute(map));
        System.out.println( "Local Test" );
    }


    private static String callExecute(Map<String,Object> map) {
     
        Execute exec = new Execute();

        final ObjectMapper Obj = new ObjectMapper();
        String jsonStr = "";

        try {
            jsonStr = Obj.writeValueAsString(exec.myHandler(map, null));
        } catch (final JsonProcessingException e) {
            jsonStr = "error";
            e.printStackTrace();
        }

        return jsonStr;
    }



}
