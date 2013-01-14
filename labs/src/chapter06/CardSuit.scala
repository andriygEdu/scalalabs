package chapter06

/**
 * User: andriyg
 * Date: 1/14/13
 * Time: 3:02 PM
 *
 *
 */
object CardSuit extends Enumeration {
  val spades = Value("♠")
  val hearts = Value("♥")
  val diamonds = Value("♦")
  val clubs = Value("♣")

  def isRed(suit: this.Value) =
    suit == hearts || suit == diamonds
}
