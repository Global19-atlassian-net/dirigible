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
package org.eclipse.dirigible.runtime.git.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * The Git Push Model.
 */
public class GitPushModel extends BaseGitProjectModel {

	@ApiModelProperty(value = "The Commit Message", required = true, example = "Updates README.md")
	private String commitMessage;
	
	@ApiModelProperty(value = "Add all unstaged files", required = true, example = "Updates README.md")
	private boolean autoAdd;
	
	@ApiModelProperty(value = "Commit all staged files", required = true, example = "Updates README.md")
	private boolean autoCommit;
	
	

	/**
	 * Gets the commit message.
	 *
	 * @return the commit message
	 */
	public String getCommitMessage() {
		return commitMessage;
	}

	/**
	 * Sets the commit message.
	 *
	 * @param commitMessage the new commit message
	 */
	public void setCommitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
	}

	/**
	 * @return the autoAdd
	 */
	public boolean isAutoAdd() {
		return autoAdd;
	}

	/**
	 * @param autoAdd the autoAdd to set
	 */
	public void setAutoAdd(boolean autoAdd) {
		this.autoAdd = autoAdd;
	}

	/**
	 * @return the autoCommit
	 */
	public boolean isAutoCommit() {
		return autoCommit;
	}

	/**
	 * @param autoCommit the autoCommit to set
	 */
	public void setAutoCommit(boolean autoCommit) {
		this.autoCommit = autoCommit;
	}
	
	

}
