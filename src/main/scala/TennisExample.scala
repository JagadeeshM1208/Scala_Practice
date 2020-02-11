object TennisExample extends App{

  case class TennisGame(player1: Player, player2: Player) {

    def score = {
      if (player1.score >= 3 && player2.score >= 3) {
        if (Math.abs(player2.score - player1.score) >= 2) leadPlayer.name + " won"
        else if (player1.score == player2.score) "deuce"
        else "advantage " + leadPlayer.name
      } else player1.scoreDescription + ", " + player2.scoreDescription
    }

    def leadPlayer = if (player1 > player2) player1 else player2

  }

  var player1:Player = Player("jaga")
  player1.score=5
  val player2:Player = Player("amar")
  player2.score=3
  println(TennisGame(player1,player2).score);

  //permutations And Combination
  def permutaionEx(txt:String) = txt.permutations.toArray
  println("permation of given text is "+permutaionEx("abc").size)



  implicit class StringImprovements(s: String) {

    def wordWrap(maxLength: Int): String = {
      s.split(" ").foldLeft(Array(""))( (out, in) => {
        if ((out.last + " " + in).trim.length > maxLength) out :+ in
        else out.updated(out.size - 1, out.last + " " + in)
      }).mkString("n").trim
    }

  }

  println(new StringImprovements("fsdfjsdfsdjfhsdfhsdkj  fhskdhfsdhfksdhk  fhsdkfhsdkfhksdhfksdhfksd   fkshdfkhsdkfhdskfhsd").wordWrap(2))

}

case class Player(name:String) extends Ordered[Player] {
  val pointsDescription = Array("love", "fifteen", "thirty", "forty")
  var score = 0
  def scoreDescription = pointsDescription(score)
  def compare(that: Player) = this.score - that.score
  def winBall { score += 1 }
}
