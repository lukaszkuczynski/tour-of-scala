import org.scalatest._
import UnifiedTypes._

class UnifiedTypesTest extends FlatSpec {

    it should "say my Class comes from java's Object if I run test in Java context"  in {
        val myInstance = new MyClassIsFromAnyRef
        assert(myInstance.getClass.getSuperclass.toString.contains("java.lang.Object"))
    }

    it should "take all different guys to one list and make it happen" in {
        val inside = new MyClassIsFromAnyRef
        val outside = new MyClassIsFromAnyRef
        val list = List[Any](
            inside,
            'L',
            'O',
            'V',
            'E',
            "Love is very very, extraordinary",
            44
        )
        assert(list.contains('L'))
        assert(list.contains(44))
        assert(list.contains(inside))
        assert(!list.contains(outside))
    }

    it should "not cast Int to Byte (what a heck!), but cast Byte to Int with ease" in {
        val byte : Byte = 2
        val intVal : Int = byte
        assert(intVal == 2)
        assertDoesNotCompile("val int: Int = 2; val byte: Byte = int")
    }
}
