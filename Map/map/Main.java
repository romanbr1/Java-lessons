package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
	//	HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		myHashMap.put("Basil", "07.12.1987");											//put
		myHashMap.put("Kate", "12.10.1971");
		myHashMap.put("Lena", "11.01.1991");
		for (Entry<String, String> entry : myHashMap.entrySet())
			System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("The value for 'Basil' is " + myHashMap.get("Basil"));		//get
		
		

        myHashMap.remove("Kate");														//remove
        System.out.println("\nAfter removing the key:");
        for(Map.Entry<String, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
       
        
        System.out.println("Do we have 'Basil'? " + myHashMap.containsKey("Basil"));	//containsKey
        System.out.println("Do we have 'Victoria'? " + myHashMap.containsKey("Victoria"));
        myHashMap.put("Kate", "12.10.1971");
        System.out.println("Do we have a value'12.10.1971'? " + myHashMap.containsValue("12.10.1971"));		//containsValue
        System.out.println("Do we have a value 'lalala'? " + myHashMap.containsValue("lalala"));
		
        
        System.out.println("The size of map is " + myHashMap.size());					//size
	}

}
