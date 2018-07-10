import org.scalatest._


class ClassesTest extends FlatSpec {

    "A class" should "allow to be defined with just a oneliner" in {
        class NaszaKlasa
        val instance = new NaszaKlasa
        assert(instance.getClass == classOf[NaszaKlasa])
    }

    it should "have default params passed" in {
        class HumanBody (var legs: Int = 2, var hands: Int = 2)
        val myBody = new HumanBody
        assert(myBody.legs == 2)
    }

    it should "not expose private members" in {
        class SpyNameNotAllowedException extends Exception
        class Spy {
            private var _realName = ""
            def realName = throw new SpyNameNotAllowedException
            def name:String = return "FakeName"
        }
        val mySpy = new Spy
        assertThrows[SpyNameNotAllowedException](mySpy.realName)
        assertDoesNotCompile("mySpy._realName")
    }

    it should "treat constructor params without val and var as private" in {
        class Spy(realName: String)
        val nextSpy = new Spy("John Kowalski")
        assertDoesNotCompile("nextSpy.realName")
    }

}
