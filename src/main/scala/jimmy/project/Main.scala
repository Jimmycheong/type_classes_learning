package jimmy.project

object Main extends App {

  val somePlayer = Player("theBest", 99)

//  def greet[T: CanGreet](t: T): String = {
//    CanGreet[T].sayHi(t)
//  }
//

  println(somePlayer.greet)

}
