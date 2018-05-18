object Basics {

    def echo_something() = {
        "blabla"
    }

    def main(args: Array[String]): Unit = {

        println(this.getClass.getSimpleName)
        println(this.echo_something())
    }

}

class Traveller(from: String, to: String) {
    def whereDoYouGo(): String = {
        "I am travelling from "+from+" to "+to
    }

    def iAmJustDoingNothingAndReturningNothingPoorUnitMethod(): Unit = {
    }
}

case class ProgrammingLanguage(name: String, dynamicTyping: Boolean)

