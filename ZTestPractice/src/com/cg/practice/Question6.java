package com.cg.practice;

import java.util.*;

public class Question6 {

	public static void main(String[] args) {

		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("abc", 50);
		m1.put("efg", 70);

		System.out.println(examResult(m1));
	}

	public static Map<String, String> examResult(Map<String, Integer> m1) {

		Map<String, String> m2 = new HashMap<String, String>();
		String s1 = new String();
		String s2 = new String();
		int n = 0;

		Iterator<String> i = m1.keySet().iterator();
		while (i.hasNext()) {
			s1 = (String) i.next();
			n = m1.get(s1);

			if (n >= 60) {
				s2 = "PASS";
			} else {
				s2 = "FAIL";
			}
			m2.put(s1, s2);
		}
		return m2;
	}
}