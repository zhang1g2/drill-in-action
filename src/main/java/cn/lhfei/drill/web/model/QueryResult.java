/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.lhfei.drill.web.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @version 0.1
 *
 * @author Hefei Li
 *
 * @Created 10月 14, 2018
 */
public class QueryResult {

	public Collection<String> getColumns() {
		return columns;
	}

	public void setColumns(Collection<String> columns) {
		this.columns = columns;
	}

	public List<List<String>> getRows() {
		return rows;
	}

	public void setRows(List<List<String>> rows) {
		this.rows = rows;
	}

	public TableMetaDataModel getMetaData() {
		return metaData;
	}

	public void setMetaData(TableMetaDataModel metaData) {
		this.metaData = metaData;
	}

	private Collection<String> columns = new ArrayList<String>();
	private List<List<String>> rows = new ArrayList<List<String>>();
	private TableMetaDataModel metaData = new TableMetaDataModel();
	
}