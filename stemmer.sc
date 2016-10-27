#!/usr/bin/env amm

import scala.io.Source

import $ivy.`com.github.rholder:snowball-stemmer:1.3.0.581.1`
import org.tartarus.snowball.SnowballStemmer
import org.tartarus.snowball.ext.italianStemmer

@main
def stemmer(f: String) {

  val lines= Source.fromFile(f).getLines.toVector

  //lines.mkString

  val words= lines.mkString.split("\\W").filterNot(_.isEmpty)

  //Create a stemmer object
  val stemmer = new italianStemmer()

  stemmer.setCurrent("BOOK")
  stemmer.stem()
  val stemmed = stemmer.getCurrent()
  println(stemmed)
  }
