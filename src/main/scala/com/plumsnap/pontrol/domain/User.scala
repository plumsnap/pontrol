package com.plumsnap.pontrol.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.Version

@Entity
@Table(name = "USER_TABLE")
class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id : Long = _

  @Column(name = "NAME")
  var name : String = _

  @Column(name = "PASSWORD")
  var password : String = _

  @Version
  var olv : Long = _

}
