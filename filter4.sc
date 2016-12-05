import scala.io.Source

@main
def filter(f: String) {
  val oneLine = Source.fromFile(f).getLines.mkString

  //oneLine.replaceAll("-  ", "")

  val dehyphenated = oneLine.replaceAll("- ", "")

  //dehyphenated.split(["\\.\\?"])

  val sentences = dehyphenated.split("[\\.\\?]")
  for (s <- sentences) {
    println(s)
  }
}
