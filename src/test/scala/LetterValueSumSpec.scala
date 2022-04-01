import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class LetterValueSumSpec extends AnyFlatSpec with should.Matchers{
  def letterValueSum(s:String)= s match {
    case "a" => 1
    case "z" =>26
  }
  it should "return value 1 for input a" in {
    letterValueSum("a") shouldBe 1
  }
  it should "return value 26 for input z" in {
    letterValueSum("z") shouldBe 26
  }
}
