/**
 * Packages are created by declaring one or more package names at the top of a Scala file.
 * One convention is to name the package the same as the directory containing the Scala file. However, Scala is agnostic to file layout.
 */
package basics

class KeyWordExamples(var paramOne: Double = 1.3, var paramTwo: String = "1.4") {
  /**
   * val - value that's immutable
   */
  val one: Double = paramOne
  /**
   * var - variable that can be overwritten
   */
  var two: String = paramTwo
  two = "overwritten Value"

  /**
   * def is a definition of a method
   */
  def thisisafunc(): String = "thisisafunc was called"

  /**
   * a method can be defined without () if it takes no arguments
   * this method has a block body
   */
  def thisisafuncnoparenthesis: String = {
    //last line is the return value in scala
    "thisisafuncnoparenthesis was called"
  }

  //method definition with block body
  def avg(x: Double, y: Double): Double = {
    (x + y) / 2
  }

  def printKeyWordExamples: Unit = {
    println("Value: " + one)
    println("Variable: " + two)
    println("function call: " + thisisafunc())
    println("no parenthesis function call: " + thisisafuncnoparenthesis)
  }
}

/**
 * The other way to declare packages is by nesting them inside each other:
 */
package parentPackage {
  package childPackageOne {
    class childOne
  }

  package childPackageTwo {
    class childOne
  }

}
