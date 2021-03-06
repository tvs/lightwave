/*
 *  Copyright (c) 2012-2016 VMware, Inc.  All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License.  You may obtain a copy
 *  of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, without
 *  warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 *
 */
package com.vmware.identity.rest.idm.samples;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import org.apache.http.HttpException;
import org.apache.http.client.ClientProtocolException;

import com.vmware.identity.rest.core.client.exceptions.ClientException;
import com.vmware.identity.rest.core.client.exceptions.WebApplicationException;
import com.vmware.identity.rest.idm.client.SolutionUserResource;
import com.vmware.identity.rest.idm.data.SolutionUserDTO;

/**
 * Samples for using {@code SolutionUserResource}. The SolutionUser resource is a container that gathers all of the commands related to a tenant's
 * solution users
 * 
 * @author abapat
 *
 */
public class SolutionUserSample extends SampleBase {
	private SolutionUserResource resource;

	/**
	 * Initializes IDM client and SolutionUserResource.
	 * 
	 * @throws KeyManagementException if an error occurs when making SSL request.
	 * @throws NoSuchAlgorithmException if an error occurs when making SSL request.
	 * @throws KeyStoreException if an error occurs building making SSL request.
	 * @throws ClientProtocolException in case of an http protocol error.
	 * @throws ClientException if a client side error occurs.
	 * @throws IOException if an error occurs when reading response.
	 */
	public SolutionUserSample()
			throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, ClientProtocolException, ClientException, IOException {
		super();
		resource = new SolutionUserResource(client);
	}

	/**
	 * Request a specific solution user.
	 *
	 * <p>
	 * <b>Required Role:</b> {@code user}.
	 *
	 * @param name the name of the solution user.
	 * @param tenant the name of the tenant to request the solution user from.
	 * @return the requested solution user.
	 * @throws ClientException if a client side error occurs.
	 * @throws ClientProtocolException in case of an http protocol error.
	 * @throws WebApplicationException in the event of an application error.
	 * @throws HttpException if there was a generic error with the remote call.
	 * @throws IOException if there was an error with the IO stream.
	 */
	public SolutionUserDTO getSoutionUser(String name, String tenant)
			throws ClientProtocolException, WebApplicationException, ClientException, HttpException, IOException {
		return resource.get(tenant, name);
	}
}
