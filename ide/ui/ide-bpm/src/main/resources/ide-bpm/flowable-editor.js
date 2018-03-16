/*
 * Copyright (c) 2017 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * SAP - initial API and implementation
 */

exports.getEditor = function() {
	var editor = {
			"id":"flowable",
			"name":"Flowable",
			"factory":"frame",
			"region":"center-top",
			"label":"Flowable",
			"link":"../ide-bpm/index.html#/editor",
			"contentTypes":["application/bpmn+xml"]
	};
	return editor;
}