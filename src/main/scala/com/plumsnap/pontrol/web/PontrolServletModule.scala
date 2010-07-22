package com.plumsnap.pontrol.web

import com.google.inject.servlet.ServletModule
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer
import scala.collection.JavaConversions._

import com.plumsnap.pontrol.resource.{Main, TestXml, Test}
import com.plumsnap.pontrol.service.AppService
import com.wideplay.warp.persist.jpa.JpaUnit
import _root_.org.fusesource.scalate.guice.ScalateModule

class PontrolServletModule extends ScalateModule {

  override def configureServlets() {
    super.configureServlets();
    // Setup Jersey Guice filter
//    var params = Map(
//      "com.sun.jersey.config.property.WebPageContentRegex" -> "(/(style)/.*)|(/.*\\.html)"
//      )
//    filter("/*").through(classOf[GuiceContainer], params)


    bind(classOf[Initializer]).asEagerSingleton()
    
    // Persistence
    bindConstant().annotatedWith(classOf[JpaUnit]).to("pontrol")
    
    // Bind JAX-RS resources
    bind(classOf[Test])
    bind(classOf[TestXml])
    bind(classOf[Main])

    // Code
    bind(classOf[AppService])




  }


}