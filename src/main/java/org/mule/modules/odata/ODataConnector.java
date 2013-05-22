/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.odata;

import org.mule.api.ConnectionException;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.MetaDataSwitch;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.param.ConnectionKey;

/**
 * Connector for consuming OData feeds by performing read, create, update and delete operations.
 * Bath operations are also supported.
 * 
 * This version of the connector does not use any kind of authentication.  
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@Connector(name = "odata", schemaVersion = "1.0", friendlyName = "OData", minMuleVersion = "3.4", configElementName="config", metaData=MetaDataSwitch.OFF)
public class ODataConnector extends BaseODataConnector {
	
	/**
	 * @param serviceUri the url of the target OData service
	 * @throws ConnectionException
	 */
	@Connect
	public void connect(@ConnectionKey String serviceUri) throws ConnectionException {
		this.setConsumer(this.getConsumerFactory().newConsumer(serviceUri, this.getFormatType(), null, null, this.getConsumerVersion()));
		this.setBaseServiceUri(serviceUri);
	}
	
	@ConnectionIdentifier
	public String getConnectionIdentifier() {
		return this.getBaseServiceUri();
	}
	
	@ValidateConnection
	public boolean isConnected() {
		return this.getConsumer() != null;
	}
	
	@Disconnect
	public void disconnect() {
		this.setConsumer(null);
		this.setBaseServiceUri(null);
	}
	
}
