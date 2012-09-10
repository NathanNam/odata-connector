/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.jersey.consumer;

import org.core4j.Enumerable;
import org.odata4j.consumer.ODataClientRequest;
import org.odata4j.core.OEntityKey;
import org.odata4j.edm.EdmDataServices;

class ConsumerDeleteEntityRequest extends ConsumerEntityRequestBase<Void> {

  ConsumerDeleteEntityRequest(ODataJerseyClient client, String serviceRootUri,
      EdmDataServices metadata, String entitySetName, OEntityKey key) {
    super(client, serviceRootUri, metadata, entitySetName, key);
  }

  @Override
  public Void execute() {
    getClient().deleteEntity(this.getRawRequest());
    return null;
  }
  
  /**
   * @see org.odata4j.core.OEntityRequest#getRawRequest()
   */
  @Override
  public ODataClientRequest getRawRequest() {
	  String path = Enumerable.create(getSegments()).join("/");
	  ODataClientRequest request = ODataClientRequest.delete(getServiceRootUri() + path);
	  
	  return request;
  }

}
