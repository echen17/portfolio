import scala.io.Source
import $ivy.`com.github.rholder:snowball-stemmer:1.3.0.581.1`
import org.tartarus.snowball.SnowballStemmer
import org.tartarus.snowball.ext.italianStemmer



def stem(stemmer: org.tartarus.snowball.ext.italianStemmer,
      s:String) = {
      stemmer.setCurrent(s)
      stemmer.stem()
      stemmer.getCurrent.toLowerCase
}


@main
def stemmer(f: String) {

  val italian = new italianStemmer()
  val lines= Source.fromFile(f).getLines.toVector
  val words= lines.mkString.split("\\W").filterNot(_.isEmpty)
  for (w <- words) {
    println( stem(italian, w) )
  }
}
