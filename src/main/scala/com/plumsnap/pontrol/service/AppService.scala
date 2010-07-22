package com.plumsnap.pontrol.service

import javax.persistence.EntityManager
import com.google.inject.{Provider, Inject}
import scala.collection.JavaConversions._
import collection.mutable.Buffer
import com.wideplay.warp.persist.Transactional
import com.plumsnap.pontrol.domain.User

class AppService @Inject() (val em : Provider[EntityManager]) {

  def listUsers() = em.get().createQuery("from User").getResultList

  @Transactional
  def getUser = em.get().createQuery("from User").getSingleResult.asInstanceOf[User]

  @Transactional
  def initData() {
    println("Init data")
    var user = new User
    user.name = "tester"
    user.password = "tester"
    em.get.persist(user)
  }

  def getTest = " app manager worrks"

}