package com.plumsnap.pontrol.web

import com.google.inject.Inject
import com.wideplay.warp.persist.PersistenceService

class Initializer @Inject() (val service : PersistenceService) {

  service.start()

}
