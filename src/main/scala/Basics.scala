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

object Fenix {
    var livesCount = 0
    def createOrRecreateFromAshes() ={
        livesCount += 1
        livesCount
    }
}

trait EarningMoney {
    def getHowMuch: String = {
        ""
    }

    def earn(): String = {
        getHowMuch + " of money"
    }
}

class WorkingAsDeveloper extends EarningMoney {
    override def getHowMuch: String = "Lots"
}

class WorkingInElester extends EarningMoney {
    override def getHowMuch: String = "Little"
}
