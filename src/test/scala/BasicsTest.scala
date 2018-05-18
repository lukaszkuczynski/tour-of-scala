import org.scalatest._
import Basics._


class BasicsTest extends FlatSpec {

    it should "return true if true is true" in {
        assert(true)
    }

    it should "return non-empty value from block even if 'return' word was not used" in {
        val retVal = echo_something()
        assert(retVal.length > 0)
    }

    it should "do not allow val value to be re-valued" in {
        assertDoesNotCompile("val a = 1; a = 2")
    }

    it should "call the anonymous function returning the not-anonymous answer" in {
        val nameMeLukasz = (text : String) => text.replaceAll("anonymous", "Lukasz")
        val sentenceWithAnonymous = "I was calling myself anonymous"
        val lukaszSentence = nameMeLukasz(sentenceWithAnonymous)
        assert(lukaszSentence.contains("Lukasz"))
    }

    it should "call the happy function returning always good mood exclamation 'Yay'" in {
        val alwaysHappyFun = () => "Yay"
        assert(alwaysHappyFun() == "Yay")
    }


}
