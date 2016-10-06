#!/usr/bin/env amm

import io.Source



@main
def zipf(f: String) {
//Get lines from a file
val lines = Source.fromFile(f).getLines.toVector
// Convert vector of lines to a vector of words
val words = lines.mkString.split("\\W").filterNot(_.isEmpty)

val grouped = words.groupBy(w => w)
val freqs = grouped.map { case (k,v) => (k,v.size) }

val orderedFreqs = freqs.toSeq

//Make a sequence out of the map and sort by the second part
//i.e. the "value", not the key
val sorted = freqs.toSeq.sortBy(_._2)

for (freq <- sorted) {
  println(freq)
  }



println("Read " + lines.size + "lines," + words.size + "words." )
}
