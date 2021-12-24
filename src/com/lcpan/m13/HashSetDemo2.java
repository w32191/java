package com.lcpan.m13;

import java.util.*;

public class HashSetDemo2 {
	public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(34);
        set.add(67);
        for (Integer s : set) {
        	System.out.println(s);
        }
        set.forEach(s -> System.out.println(s));
        set.stream().forEach(System.out::println);
	}
}
