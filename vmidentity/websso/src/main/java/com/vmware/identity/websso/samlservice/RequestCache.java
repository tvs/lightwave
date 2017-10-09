/*
 *  Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
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
 */
package com.vmware.identity.websso.samlservice;

/**
 * Request Cache interface. We support following methods:
 *  - boolean shouldDenyRequest(String), will return true if we are getting spammed with the same request
 *  - void storeRequest(String), will remember the request being handled
 *
 */
public interface RequestCache {
	/**
	 * Will return true if request should be denied
	 * @param request
	 * @return
	 */
	boolean shouldDenyRequest(String request);

	/**
	 * Will store request
	 * @param request
	 */
	void storeRequest(String request);

	/**
	 * query a request
	 * @param request
	 */
	boolean isExistingRequest(String request);
}