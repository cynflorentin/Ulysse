/**
 * 
 * Copyright (C) 2006-2010 THALES
 * http://www.thalesgroup.fr - gregory.cunha@thalesgroup.com
 *
 * This software is free software; you can redistribute it and/or
 * modify it under the terms of the license LGPL.
 *
 * Initial author :
 * Gregory Cunha from Thales Service, THERESIS Competence Center Open Source Software
 *
 */
package org.qualipso.factory.svn.ssh.command;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.qualipso.factory.svn.exception.SVNServiceException;
import org.qualipso.factory.svn.ssh.command.filter.RequestFilter;
import org.qualipso.factory.svn.ssh.command.filter.component.RequestComponent;

/**
 * PumpingTaskS2C
 */
public class PumpingTaskS2C extends PumpingTask {

	/**
	 * RequestFilter
	 */
	protected RequestFilter queryAnalyser;

	/**
	 * SVNServeSSHCommand
	 */
	protected SVNServeSSHCommand command;
	
	/**
	 * Constructor
	 * @param in InputStream
	 * @param out OutputStream
	 * @param command SVNServeSSHCommand
	 * @param queryAnalyser RequestFilter
	 */
	public PumpingTaskS2C(InputStream in, OutputStream out, SVNServeSSHCommand command, RequestFilter queryAnalyser) {
		super(in, out, TaskType.S2C, command);
		this.queryAnalyser = queryAnalyser;
	}

	protected void filter(String request, Map<Integer, RequestComponent> requestComponents, TaskType type) throws SVNServiceException {
		this.queryAnalyser.filter(request, requestComponents, type);
	}
}
