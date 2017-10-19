package Iteration

object Values {
  sealed trait Values {
    def interpret() = println(interpretValue(this))
  }

  case class Numbers(int: Int) extends Values {
    def < (x: Int): Boolean = int < x
  }
  case class Strings(str: String) extends Values

  case class UnaryFunction[IN, OUT](f: IN => OUT) extends Values

  def interpretValue(v: Any): String = v match {
    case v: Numbers if v < 10 => s"Number(<10):        $v"
    case v: Numbers           => s"Number(>10):        $v"
    case v: Strings           => s"String:             $v"
    case v @UnaryFunction(_)  => s"Unary Function:     ${v.f}"
    case _                    => s"Unrecognized Value: $v"
  }

  def main(args: Array[String]) = {
    val myNum1 = new Numbers(7)
    val myNum2 = new Numbers(14)
    val myStr = new Strings("What up!")
    def addOne(i: Int) = s"${i + 1}"
    val myFunc = new UnaryFunction(addOne)

    myNum1.interpret
    myNum2.interpret
    myStr.interpret
    myFunc.interpret
  }
}
