/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.core;

import java.util.Collection;

public class UmbrellaException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private final Collection<Exception> exceptions;

  public UmbrellaException(Collection<Exception> exceptions) {
    this.exceptions = exceptions;
  }

  public Collection<Exception> getExceptions() {
    return exceptions;
  }

}
