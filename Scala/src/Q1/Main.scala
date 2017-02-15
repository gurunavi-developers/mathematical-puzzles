object Main extends App{
  def check(n: scala.runtime.RichInt)(f: (scala.runtime.RichInt) => String): Boolean = f(n) == f(n).reverse

  def loop(i: Int): Int = {
    val c = check(i)(_)
    if (c { _.toBinaryString } &&
        c { _.toOctalString } &&
        c { _.toString } ) i
    else loop(i + 1)
  }

  println(loop(10))
}
