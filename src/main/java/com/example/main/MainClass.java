package com.example.main;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        List<String> list = hz.getList("list");
        if(list.size()==2){
            list.add("c");
        }
        else if(list.size()==3){
            list.add("d");
        }
        else {
            list.add("a");
            list.add("b");
        }
        System.out.println(list.size());
	}
}
