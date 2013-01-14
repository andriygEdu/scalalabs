package chapter06

/**
 * User: andriyg
 * Date: 1/14/13
 * Time: 1:41 PM
 * 
 *
 */
trait UnitConversion {
  def convert( value: Double): Double;
}

object InchesToCentimeters extends UnitConversion {
  def convert(value: Double): Double = Conversions.inchesToCentimetres(value)
}

object GallonsToLiters extends UnitConversion {
  def convert(value: Double): Double = Conversions.gallonsToLitres(value)
}

object MilesToKilometers extends UnitConversion {
  def convert(value: Double): Double = Conversions.milesToKilometers(value)
}
