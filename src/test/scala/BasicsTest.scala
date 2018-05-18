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

    it should "create class with constructor and have constructor argument visible within the class" in {
        val travellerFromWroclaw = new Traveller("Wroclaw", "Opole")
        assert(travellerFromWroclaw.whereDoYouGo().contains("Wroclaw"))
    }

    it should "make case class good-ol-Pojo using magic 'case' keyword and I can use named arguments" in {
        val python = ProgrammingLanguage(name = "Python", dynamicTyping = true)
        val java = ProgrammingLanguage(name = "Java", dynamicTyping = false)
        val javaClone = ProgrammingLanguage(name = "Java", dynamicTyping = false)
        assert(python.toString.contains("Python"))
        assert(python != java)
        assert(javaClone == java)
    }

}
