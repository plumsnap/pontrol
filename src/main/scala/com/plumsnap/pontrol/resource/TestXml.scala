package com.plumsnap.pontrol.resource

import java.util.ArrayList
import java.util.List
import java.util.logging.Logger

import javax.ws.rs.CookieParam
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import com.plumsnap.pontrol.service.AppService
import com.google.inject.Inject

@Path("/api/testxml")
class TestXml @Inject() (val appManager : AppService)  {

  @GET @Produces(Array("application/xml"))
  def getAds = {
    val house = new House
    house.name = appManager.getUser.name
    house
  }
}