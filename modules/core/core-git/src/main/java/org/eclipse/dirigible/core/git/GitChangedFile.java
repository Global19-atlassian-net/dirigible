/**
 * Copyright (c) 2010-2020 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 */
package org.eclipse.dirigible.core.git;

/**
 * Changed File representation POJO
 *
 */
public class GitChangedFile {
	
	private String path;
	
	private int type;

	/**
	 * The constructor
	 * 
	 * @param path the full path
	 * @param type the change type
	 */
	public GitChangedFile(String path, int type) {
		super();
		this.path = path;
		this.type = type;
	}

	/**
	 * Getter for path
	 * 
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Setter for path
	 * 
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * Setter for type
	 * 
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	

}
