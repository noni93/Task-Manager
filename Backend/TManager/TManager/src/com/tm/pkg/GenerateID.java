package com.tm.pkg;

import java.util.*;
public class GenerateID {
	private int length;
	private String criteria;
	public GenerateID(int length, String criteria) {
		if(length <= 0) length = 6;
		else this.length = length;
		if(criteria.length() == 0 || criteria.length() < length) {
			criteria = "abcdefghijklmnopqrstuvwxyz1234567890.,/;']][[";
		}else this.criteria = criteria;
		
	}
	public String getId() {
		return generate();
	}
	private String generate() {
		Random r  = new Random();
		String id = "";
		for(int i = 0; i < length; i++) {
			id += criteria.charAt(r.nextInt(criteria.length()));
		}
		return id;
	}
}

