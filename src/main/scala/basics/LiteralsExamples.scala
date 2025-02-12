package basics

class LiteralsExamples {
  /**
   * All types of integer literals with min and max values with both inferred and explicit typing
   */
  val int = 100
  val intMin: Int = -2147483648
  val intMax: Int = 2147483647
  val longMin: Long = -9223372036854775808L
  val longMax: Long = 9223372036854775807L
  val shortMin: Short  = -32768
  val shortMax: Short = 32767
  val byteMin: Byte = -128
  val byteMax: Byte = 127

  /**
   * hexadecimal literal starting with 0x
   */
  val hex = 0xFF

  /**
   * floating point literals
   */
  val doubleOne = 1.0
  val doubleTwo = 1.0D
  val doubleThree: Double = 1.0
  val floatOne = 1.0F
  val floatTwo: Float = 1.0f
  var floatThree = 1.3e4
  val floatFour: Float = 1.3e4F

  /**
   * Boolean literals
   */
  val boolOne = true
  val boolTwo: Boolean = false

  /**
   * Character literals with special escape sequences
   */
  val characterOne = 'a'
  val characterTwo: Char = 'b'
  val characterThree = '\u0101'

  val backspace = '\b'
  val backspaceUnicode = '\u0008'
  val horizontalTab = '\t'
  val horizontalTabUnicode = '\u0009'
  val carriageReturn = '\r'
  val carriageReturnUnicode = '\u000D'
  val lineFeed = '\n'
  val lineFeedUnicode = '\u000A'
  val formFeed = '\f'
  val formFeedUnicode = '\u000C'
  val doubleQuote = '\"'
  val doubleQuoteUnicode = '\u0022'
  val backSlash = '\\'
  //val backSlashUnicode = "\u005c"" //since it's a backslash it escapes the first double quote
  val singleQuote = '\''
  val singleQuoteUnicode = '\u0027'

  /**
   * String literals
   * Triple quote string literals can be multiline and accept escape characters inside them
   */
  val stringLiteral = "This is a string"
  val tripleQuoteStringOne =
    """This is a
      | multiline
      | String"""
  val tripleQuoteStringTwo = """ / " ' \ """

  /**
   * Symbol literals
   *
   */
  val symbol = 'testSymbol

  /**
   * Tuple literals
   *
   */
  val tuple: (String, String, String) = ("val1", "val2", "val3")
  val pair: (Int, String) = 1 -> "One"

  /**
   * Function literals
   */


  def showLiterals():  Unit = {
    println("intMin: " + intMin)
    println("intMax: " + intMax)
    println("longMin: " + longMin)
    println("longMax: " + longMax)
    println("shortMin: " + shortMin)
    println("shortMax: " + shortMax)
    println("byteMin: " + byteMin)
    println("byteMax: " + byteMax)
    println("Tuple values: " + tuple._1 + " " + tuple._2 + " " + tuple._3)
    println("Pair values: " + pair._1 + " " + pair._2)
    println("###########################################################")
  }
}
