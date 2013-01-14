package chapter06

/**
 * User: andriyg
 * Date: 1/14/13
 * Time: 2:56 PM
 *
 *
 */
object ReverseApp extends App {
  override def main(args: scala.Array[scala.Predef.String]) = {
    println(args.reverse.mkString(" "))
  }
}
