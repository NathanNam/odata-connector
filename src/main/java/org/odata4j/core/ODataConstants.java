/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.core;

/**
 * Useful constants.
 */
public class ODataConstants {

  private ODataConstants() {}

  public static final String TEXT_PLAIN = "text/plain";
  public static final String TEXT_PLAIN_CHARSET_UTF8 = TEXT_PLAIN + ";charset=utf-8";

  public static final String APPLICATION_ATOM_XML = "application/atom+xml";
  public static final String APPLICATION_ATOM_XML_CHARSET_UTF8 = APPLICATION_ATOM_XML + ";charset=utf-8";

  public static final String APPLICATION_ATOMSVC_XML = "application/atomsvc+xml";
  public static final String APPLICATION_ATOMSVC_XML_CHARSET_UTF8 = APPLICATION_ATOMSVC_XML + ";charset=utf-8";

  public static final String APPLICATION_XML_CHARSET_UTF8 = "application/xml;charset=utf-8";
  public static final String TEXT_JAVASCRIPT_CHARSET_UTF8 = "text/javascript;charset=utf-8";
  public static final String APPLICATION_JAVASCRIPT = "application/json";
  public static final String APPLICATION_JAVASCRIPT_CHARSET_UTF8 = APPLICATION_JAVASCRIPT + ";charset=utf-8";

//  public static final ODataVersion DATA_SERVICE_VERSION = ODataVersion.V1;
//  public static final String DATA_SERVICE_VERSION_HEADER = DATA_SERVICE_VERSION.asString;

  /**
   * Http header names.
   */
  public static class Headers {
    public static final String X_HTTP_METHOD = "X-HTTP-METHOD";
    public static final String DATA_SERVICE_VERSION = "DataServiceVersion";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String USER_AGENT = "User-Agent";
  }

}
