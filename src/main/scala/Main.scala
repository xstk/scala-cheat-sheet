/**
 * Basics package deals with basic concepts in scala
 *
 * See KeyWordExamples for basic keywords
 * See LiteralsExamples for literals examples
 */

import basics.KeyWordExamples
import basics.LiteralsExamples

import java.time.LocalDateTime

object Main {

  def main(args: Array[String]): Unit = {
    val literalsExamples = new LiteralsExamples
    literalsExamples.showLiterals()

    val keyWordExamples = new KeyWordExamples
    keyWordExamples.printKeyWordExamples

    val syntaxExamples = new SyntaxExamples
    //An anonymous function is passed as an argument
    syntaxExamples.repeatCallback(() => {
      println("Current time: " + LocalDateTime.now)
    })
  }
}

class SyntaxExamples {
  //This method takes a callback function as an argument
  def repeatCallback(callback: () => Unit): Unit = {
    //while (true) {
    callback();
    //Thread.sleep(1000)
    //}
  }
}