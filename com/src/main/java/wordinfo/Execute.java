package wordinfo;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;



public class Execute 
{
    public WordInfo myHandler(Map<String,Object> input, Context context) {

        WordInfo wordInfo = new WordInfo(input.get("text").toString());

        return wordInfo;
    }


}