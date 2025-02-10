import java.time.LocalDateTime

class KeyWordExamples(var paramOne: Double = 1.3, var paramTwo: String = "1.4") {
  //val - value that's immutable
  val one: Double = paramOne
  //var - variable that can be overwritten
  var two: String = paramTwo

  //def is a definition of a method
  def thisisafunc(): String = "thisisafunc was called"

  //a method can be defined without () if it takes no arguments
  //this method has a block body
  def thisisafuncnoparenthesis: String = {
    //last line is the return value in scala
    "thisisafuncnoparenthesis was called"
  }

  //method definition with block body
  def avg(x: Double, y: Double): Double = {
    (x + y) / 2
  }
}

class SyntaxExamples {
  //This method takes a callback function as an argument
  def repeatCallback(callback: () => Unit): Unit = {
    while (true) {
      callback();
      Thread.sleep(1000)
    }
  }
}

object Main {

  def main(args: Array[String]): Unit = {

    val keyWordExamples = new KeyWordExamples
    println("Value: " + keyWordExamples.two)
    println("Variable: " + keyWordExamples.one)
    println("function call: " + keyWordExamples.thisisafunc())
    println("no parenthesis function call: " + keyWordExamples.thisisafuncnoparenthesis)
    println

    val syntaxExamples = new SyntaxExamples
    //An anonymous function is passed as an argument
    syntaxExamples.repeatCallback(() => {
      println("Current time: " + LocalDateTime.now)
    })
  }
}