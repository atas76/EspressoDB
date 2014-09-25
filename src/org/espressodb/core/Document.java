package org.espressodb.core;

import java.util.List;

public class Document {
	
	private String name;
	private List<ColumnGroup> columnGroups;
	
	public Document(String name, List<ColumnGroup> columnGroups) {
		this.name = name;
		this.columnGroups = columnGroups;
	}
}
