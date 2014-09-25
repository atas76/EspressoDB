package org.espressodb.core;

public class Column {
	
	private String name;
	private String value;
	
	public Column(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	public Column(String value) {
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getValue() {
		return this.value;
	}
}
