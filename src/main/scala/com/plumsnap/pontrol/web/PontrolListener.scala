package com.plumsnap.pontrol.web

import com.google.inject.Guice
import com.google.inject.servlet.GuiceServletContextListener
import com.wideplay.warp.persist.{UnitOfWork, PersistenceService}

class PontrolListener extends GuiceServletContextListener {

  override def getInjector = {
    val servletModule = new PontrolServletModule
    val persistenceModule = PersistenceService.usingJpa().across(UnitOfWork.TRANSACTION).buildModule();
    Guice.createInjector(servletModule, persistenceModule)
  }

}