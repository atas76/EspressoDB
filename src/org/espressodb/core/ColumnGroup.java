package org.espressodb.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColumnGroup {
	
	private List<Column> columns;
	private Map<String, String> namedColumns = new HashMap<String, String>();
	private Map<Integer, Column> orderedColumns = new HashMap<Integer, Column>();
	
	public ColumnGroup(List<Column> columns) {
		
		this.columns = columns;
		
		int counter = 0;
		for (Column column: columns) {
			this.orderedColumns.put(counter++, column);
			if (column.getName() != null) {
				// System.out.println("Adding column with name: " + column.getName());
				this.namedColumns.put(column.getName(), column.getValue());
			}
		}
	}
	
	public Column getOrderedColumn(int index) {
		return this.orderedColumns.get(index);
	}
	
	public String getValueByColumnName(String fieldName) {
		return this.namedColumns.get(fieldName);
	}
	
	public List<Column> getColumns() {
		return this.columns;
	}
}
