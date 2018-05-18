object Basics {

    def echo_something() = {
        "blabla"
    }

    def main(args: Array[String]): Unit = {

        println(this.getClass.getSimpleName)
        println(this.echo_something())
    }

}
