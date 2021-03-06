/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.producer.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CommitTransactionCommand implements Command {

  @Override
  public boolean execute(JPAContext context) {
    EntityManager em = context.getEntityManager();
    EntityTransaction tx = em.getTransaction();
    tx.commit();
    context.setEntityTransaction(null);

    return false;
  }
}