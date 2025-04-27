package com.kafka.kafka_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(KafkaDemoApplication.class, args);
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		numbers.stream().filter(val-> val %2 ==0).forEach(val->System.out.println(val));

		String value="javawithjava";
		char[] ch=value.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		int count=1;

		for(char c: ch){
			if(map.containsKey(c)){
				map.put(c,count+1);
			}
			else {
				map.put(c,1);
			}

		}
		Character data= map.entrySet().stream().filter(valu->valu.getValue()==1).findFirst().get().getKey();
		System.out.println(data);

		String sentence = "litchi with bajji litchi with code";
		String[] str=sentence.split(" ");
		Map<String,Integer> fre=new HashMap<>();
		int num=1;
		for(String s: str){
			if(fre.containsKey(s)){
				fre.put(s,num+1);
			}
			else{
				fre.put(s,1);
			}
		}
		fre.entrySet().stream().forEach(val->System.out.println(""+val.getKey()+"= "+val.getValue()));

		

	}

}
