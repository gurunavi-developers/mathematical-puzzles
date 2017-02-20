object Q3 extends App {
  def flipList(len: Int)(n: Int): Seq[Int] = Range(n, len+1, n).toList // ひっくり返す番号

  val cards = 1 to 100
  val member = 2 to 100

  val ope = member map flipList(cards.max) // それぞれの番号のカードをひっくり返す番号の人を計算
  val count = cards map (num => ope.flatten.count(_ == num)) // ひっくり返された回数を計算
  val result = count.zipWithIndex.filter {case (d, i) => d % 2 == 0}

  println(result.map(k => k._2+1)) // memberが2始まりなので、indexが0のカードが1になる
}
