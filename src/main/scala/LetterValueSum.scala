object LetterValueSum {
  val chars = 'a' to 'z'
  val charsWithValues = chars.foldLeft(Map.empty[Char,Int]){(z,c)=>
    z + (c -> (c.toInt - 96))
    z
  }
  def letterValueSum(s: String)={
    var sum = 0
    val score = s.foreach(c =>
       sum  += (c.toInt - 96))
    sum
  }
}
