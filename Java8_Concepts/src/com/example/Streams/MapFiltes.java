package com.example.Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Vidit 
   25-Dec-2017 6:56:35 PM
 */
public class MapFiltes {

	public static void main(String[] args) {


		Map<Integer,String> map = new HashMap();
		map.put(1, "Lenovo");
		map.put(2, "Dell");
		map.put(3, "Xiaomi");
		map.put(4, "Toshiba");
		map.put(5, "Lucy");
		
		// fetching filtered values from map.
		String str =map.entrySet().stream()
								  .filter(m -> m.getKey() == 1) // filtering from map.
								  .map(m -> m.getValue()) // getting value on filter basis.
								  .collect(Collectors.joining()); 
		System.out.println(str);
		
		
		// Collecting Map key  & value from entryset streams
		
		Map<Integer,String> mapObj = map.entrySet().stream()
										.filter(m -> m.getKey() == 3)
										.collect(Collectors.toMap(m -> m.getKey(), m -> m.getValue()));
		System.out.println(mapObj);
	}

}
