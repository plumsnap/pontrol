package com.plumsnap.pontrol.resource

import java.util.ArrayList
import java.util.List
import java.util.logging.Logger

import javax.ws.rs.CookieParam
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path("/api/test")
class Test {

  @GET @Produces(Array("application/json"))
  def getAds() = {
    var user = new House    
    user
  }
}

