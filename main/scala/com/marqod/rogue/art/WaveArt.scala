package com.marqod.rogue.art

import com.marqod.rogue.models.{Entity, Wave}
import com.marqod.rogue.utils.Colors

import scala.swing.Graphics2D

/**
  * Created by ryan.walker on 11/12/16.
  */
class WaveArt extends Art {

  def drawClass(g: Graphics2D, w: Entity) = {
    g.setColor(Colors.brightBlue)
    g.fill3DRect(
      (-w.dimensions.x / 2).toInt,
      (-w.dimensions.y / 2).toInt,
      w.dimensions.x.toInt,w.dimensions.y.toInt,true
    )
  }
}

class WakeArt extends Art {
  def drawClass(g: Graphics2D, w: Entity) = {
    g.setColor(Colors.getFoamBlue(1 - (w.dimensions.x * 2 / 60)))
    val oX = (-w.dimensions.x / 2).toInt
    val oY = (-w.dimensions.y / 2).toInt
    g.fill3DRect(
      oX,
      oY,
      w.dimensions.x.toInt,
      1,
      true
    )
  }
}
