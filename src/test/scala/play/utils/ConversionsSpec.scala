import org.scalatest._
import play.utils.Conversions

class ConversionsSpec extends FunSuite with DiagrammedAssertions {
  test("Correctly Creates Empty Map") {
    assert(Conversions.newMap() == Map())
  }
  test("converts simple") {
    assert(Conversions.newMap(("A", "B")) == Map("A" -> "B"))
  }
  test("convert complex") {
    assert(Conversions.newMap(("test", ("A", "B", "C"))) == Map("test" -> ("A","B","C")))
  }
}
