import org.scalatest._
import flatspec._
import matchers._

class ExampleSpec extends AnyFlatSpec with should.Matchers:

  "Integer" should "equal itself" in:
    val i = 1
    i should be(1)
