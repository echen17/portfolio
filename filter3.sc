import scala.io.Source


@main
def filter(f: String) {
  val lines = Source.fromFile(f).getLines.toVector
  val textlines = lines.mkString

  val results = textlines.mkString.replaceAll("[~^*%//[//]|<>)(=_-]", "")

  println(results.mkString)
  }

//Is there a way to replace dashes preceding a space with no space?
//As in connecting the words together and getting rid of the dash
