import scala.io.Source


@main
def makeString(f: String) {


  val lines= Source.fromFile(f).getLines.toVector
  val textlines = lines.mkString(" ")



  println("Read" + textlines)

}
