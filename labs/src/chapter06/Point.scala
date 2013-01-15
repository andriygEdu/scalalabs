package chapter06

import java.awt.Point

/**
 * User: andriyg
 * Date: 1/14/13
 * Time: 1:55 PM
 * 
 *
 */
object Point {
  def apply( x: Double, y: Double ) = {
    val point = new java.awt.Point()
    point.setLocation(x, y)
    point
  }
}
