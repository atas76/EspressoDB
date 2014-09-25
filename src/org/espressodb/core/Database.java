package org.espressodb.core;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private String name;
	private List<ColumnGroup> columnGroups = new ArrayList<ColumnGroup>();
	private List<Document> documents = new ArrayList<Document>();
	
	public Database(String name) {
		this.name = name;
	}
	
	// Anonymous database
	public Database(List<ColumnGroup> columnGroups) {
		this.columnGroups = columnGroups;
	}
	
	public void insert(ColumnGroup colGroup) {
		columnGroups.add(colGroup);
	}
	
	public List<ColumnGroup> getAll() {
		return this.columnGroups;
	}
	
	public List<ColumnGroup> findByNamedField(String fieldName, String value) {
		
		List<ColumnGroup> retVal = new ArrayList<ColumnGroup>();
		
		for (ColumnGroup columnGroup: columnGroups) {
			if (columnGroup.getValueByColumnName(fieldName) != null && columnGroup.getValueByColumnName(fieldName).equals(value)) {
				retVal.add(columnGroup);
			}
		}
		
		return retVal;
	}
	
	public List<ColumnGroup> findByOrderedField(int orderIndex, String value) {
		
		List<ColumnGroup> retVal = new ArrayList<ColumnGroup>();
		
		assert(columnGroups.size() > 0);
		
		for (ColumnGroup columnGroup: columnGroups) {
			// System.out.println("Current team name: " + columnGroup.getOrderedColumn(orderIndex));
			if (columnGroup.getOrderedColumn(orderIndex).getValue().equals(value)) {
				retVal.add(columnGroup);
			}
		}
		
		return retVal;
	}
}
