import org.scalatest._
import Basics.echo_something

class BasicsTest extends FlatSpec {

    it should "return true if true is true" in {
        assert(true)
    }

    it should "return non-empty value from block even if 'return' word was not used" in {
        val retVal = echo_something()
        assert(retVal.length > 0)
    }

}
