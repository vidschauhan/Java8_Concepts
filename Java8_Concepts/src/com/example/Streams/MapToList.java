package com.example.Streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Vidit 
   25-Dec-2017 6:56:39 PM
 */
public class MapToList {

	public static void main(String[] args) {
	
		People ppl = new People();
		
		ppl.addToMap(1,"Vidit");
		ppl.addToMap(3,"Amir");
		ppl.addToMap(6,"Sujuit");
		ppl.addToMap(78,"Ola");
		ppl.addToMap(2,"yamuna");
		
		Map<Integer,String> personMap = ppl.getPersonMap();
		
		Map<Integer, String> map = new HashMap<>();
		map.put(23, "Mahesh");
		map.put(10, "Suresh");
		map.put(26, "Dinesh");
		map.put(11, "Kamlesh");
		
		// Converting Map values to list and sorting
		List<String> names = personMap.values().stream().sorted().collect(Collectors.toList());
		names.forEach(System.out::println);
		
		//using KeySet()
		//	List<Integer> id = personMap.keySet().stream().sorted().collect(Collectors.toList());
		
	
		/*
		//Converting Map to List and of User Object
		List<People> list = personMap.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey()))
				.map(e -> new People(e.getKey(), e.getValue())).collect(Collectors.toList());
		
		
	//	System.out.println(list);
		
		list.stream().forEach(x-> System.out.println(x.getId()));
		//list.forEach(x -> System.out.println("id:" + x.getId() + " " + x.getName()));
		*/
		
		
		
		
		
	}

}

class People {

	private int id;
	private String name;
	private Map<Integer, String> personMap; 
	
	People() {
		this.personMap = new HashMap<Integer, String>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, String> getPersonMap() {
		return personMap;
	}

	public void setPersonMap(Map<Integer, String> personMap) {
		this.personMap = personMap;
	}
	
	public void addToMap(int id,String name) {
		this.personMap.put(id, name);
	}

	

}
