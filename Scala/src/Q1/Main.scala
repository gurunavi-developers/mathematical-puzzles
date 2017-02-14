case class Q1(n: Int) {
  lazy val decimal = n.toString
  lazy val binary = n.toBinaryString
  lazy val octal = n.toOctalString

  def forall(f: String => Boolean): Boolean =
    f(decimal) && f(binary) && f(octal)
}

val answer = Iterator.from(10, 1).find(
  Q1(_).forall(s => s == s.reverse)
).get

println(answer)
