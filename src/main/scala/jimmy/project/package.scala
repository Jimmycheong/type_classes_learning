package jimmy

package object project {

  trait CanGreet[T] {
    def sayHi(t: T): String
  }

  object CanGreet {

    def apply[T](implicit C: CanGreet[T]): CanGreet[T] = C

    implicit val playerGreeter: CanGreet[Player] = new CanGreet[Player] {
      def sayHi(t: Player): String = s"Hi, I'm player ${t.nickname}, I'm lvl ${t.level}"
    }
  }

  implicit class CanGreetSyntax[T: CanGreet](t: T) {
    def greet: String = CanGreet[T].sayHi(t)
  }

  case class Player(nickname: String, level: Int)

}
