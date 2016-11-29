import scala.io.Source


@main
def zip(f: String) {
  val file1 = Source.fromFile(f).getLines.toVector
  val indices= file1.zipWithIndex

  val textContent = indices.map(_._1)
  val index = indices.map(_._2)
  val alignedText = index.zip(textContent)
  println(alignedText.mkString("\n"))
  }
