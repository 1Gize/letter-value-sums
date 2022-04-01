import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class LetterValueSumSpec extends AnyFlatSpec with should.Matchers{
  def letterValueSum(s:String)= 1
  it should "return value 1 for input a" in {
    letterValueSum("a") shouldBe 1
  }
}
