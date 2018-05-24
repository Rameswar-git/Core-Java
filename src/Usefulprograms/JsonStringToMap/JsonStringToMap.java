package Usefulprograms.JsonStringToMap;


import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStringToMap {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

        String test="{\"OACODE\":{\"value\":\"OA010000\"},\"AGENTCODE\":{\"value\":\"adcadvv\"}}";


        ObjectMapper mapper=new ObjectMapper();

        Map<String,LinkedHashMap<String,String>> mn=mapper.readValue(test, Map.class);



        Map<String,String> acac=mn.entrySet().stream().map(d -> new SimpleEntry<>(d.getKey(),d.getValue().get("value")))
                .collect(Collectors.toMap(c -> c.getKey(), c -> c.getValue()));




        acac.forEach((k,v) -> System.out.println(" Key is "+k+" Value is "+v));


    }
	
	
}
