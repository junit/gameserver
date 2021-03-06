package com.xinqihd.sns.gameserver.admin.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.BasicDBList;
import com.mongodb.DBObject;
import com.xinqihd.sns.gameserver.admin.i18n.ColumnNames;
import com.xinqihd.sns.gameserver.admin.util.MongoUtil;
import com.xinqihd.sns.gameserver.db.mongo.GameDataManager;

/**
 * Use DBObject as the data model
 * 这个模型针对数据库中某一列对象为DBObject的情况
 * @author wangqi
 *
 */
public class ObjectDBListModel extends MyTableModel {
	
	private static final Logger logger = LoggerFactory.getLogger(GameDataManager.class);
	
	private ArrayList<Object> rows = new ArrayList<Object>();
	private ArrayList<String> columnNames = new ArrayList<String>();
	private ArrayList<Class>  columnClasses = new ArrayList<Class>();
	private HashSet<String> hiddenFields = new HashSet<String>();
	private int columnSize = 0;
	private List<Object> dbObjList = null;
	private BasicDBList cellValue = null;
	
	public ObjectDBListModel(BasicDBList cellValue) {
		this.cellValue = cellValue;
		this.dbObjList = new ArrayList();
		BasicDBList dbObj = (BasicDBList)cellValue;
		if ( dbObj != null ) {
			for ( Object obj : dbObj ) {
				this.dbObjList.add(obj);
			}
		}
	}
	
	public void setHiddenFields(Collection<String> hiddenFields) {
		this.hiddenFields.addAll(hiddenFields);
	}
	
	public HashSet<String> getHiddenFields() {
		return this.hiddenFields;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	@Override
	public int getRowCount() {
		return rows.size();
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	@Override
	public int getColumnCount() {
		return columnSize;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object dbObject = rows.get(rowIndex);
		String columnKey = columnNames.get(columnIndex);
		return dbObject.toString();
	}
	
	@Override
	public Object getRowObject(int rowIndex) {
		return rows.get(rowIndex);
	}
	

	/* (non-Javadoc)
	 * @see javax.swing.table.AbstractTableModel#getColumnName(int)
	 */
	@Override
	public String getColumnName(int column) {
		String cn = columnNames.get(column);
		return ColumnNames.translate(cn);
	}
	
	@Override
	public String getOriginalColumnName(int column) {
		return columnNames.get(column);
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.AbstractTableModel#getColumnClass(int)
	 */
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnClasses.get(columnIndex);
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.AbstractTableModel#isCellEditable(int, int)
	 */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	
	@Override
	public String getCollectionName() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.xinqihd.sns.gameserver.admin.model.MyTableModel#reload()
	 */
	@Override
	public void reload() {
		//Load data from database
		columnNames.clear();
		columnClasses.clear();
		rows.clear();
		
		DBObject query = MongoUtil.createDBObject();
		rows.addAll(this.dbObjList);
		columnNames.add("值");
		columnClasses.add(String.class);
		columnSize = 1;
		logger.debug("Load total {} rows into model", rows.size());
		this.fireTableStructureChanged();
		this.fireTableDataChanged();
	}

	/* (non-Javadoc)
	 * @see com.xinqihd.sns.gameserver.admin.model.MyTableModel#export(java.io.File)
	 */
	@Override
	public void export(File file) {
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			//output header
			for ( String column : columnNames ) {
				if ( !hiddenFields.contains(column) ) {
					bw.append(column).append('\t');
				}
			}
			bw.append('\n');
			for ( Object dbObj : rows ) {
				bw.append(String.valueOf(dbObj)).append('\t');
				bw.append('\n');
			}
			bw.close();
		} catch (IOException e) {
			logger.warn("Failed to export file: {}", file);
		}
	}

	/* (non-Javadoc)
	 * @see com.xinqihd.sns.gameserver.admin.model.MyTableModel#insertRow(java.lang.Object)
	 */
	@Override
	public void insertRow(Object row) {
		DBObject objectToSave = (DBObject)row;
		rows.add(objectToSave);
		cellValue.add(objectToSave);
		isDataChanged = true;
		this.fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
	}

	/* (non-Javadoc)
	 * @see com.xinqihd.sns.gameserver.admin.model.MyTableModel#deleteRow(int)
	 */
	@Override
	public void deleteRow(int rowIndex) {
		Object objToDelete = rows.get(rowIndex);
		rows.remove(rowIndex);
		cellValue.remove(rowIndex);
		isDataChanged = true;
		this.fireTableRowsDeleted(rowIndex, rowIndex);
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.AbstractTableModel#setValueAt(java.lang.Object, int, int)
	 */
	@Override
	public void setValueAtWithoutUndo(Object aValue, int rowIndex, int columnIndex) {
		Object objectToSave = rows.get(rowIndex);
		cellValue.set(rowIndex, objectToSave);
	}
	
}
