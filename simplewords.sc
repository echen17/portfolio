import scala.io.Source


@main
def stemmer(f: String) {


  val lines= Source.fromFile(f).getLines.toVector
  val words= lines.mkString.split("\\W").filterNot(_.isEmpty)
  for (w <- words) {
    println( w)
  }
}
