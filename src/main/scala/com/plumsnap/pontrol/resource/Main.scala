package com.plumsnap.pontrol.resource

import java.util.ArrayList
import java.util.List
import java.util.logging.Logger

import java.util.logging.Logger
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import com.plumsnap.pontrol.service.AppService
import com.google.inject.Inject
import com.sun.jersey.api.view.{ImplicitProduces, Viewable}

@Path("/")
@ImplicitProduces(Array("text/html;qs=5"))
class Main @Inject() (val appManager : AppService) {

  @GET
  def getAds = {
    appManager.initData()
    appManager
  }

  def getTest = " Dziala "

}