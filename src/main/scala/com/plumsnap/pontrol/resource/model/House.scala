package com.plumsnap.pontrol.resource

import javax.xml.bind.annotation.XmlRootElement
import reflect.BeanProperty

@XmlRootElement
class House {

  @BeanProperty
  var name = "house"

}