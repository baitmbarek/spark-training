package io.univalence.spark.training.spark.rdd

import org.apache.spark.sql.SparkSession

object GettingStartedWithRDD extends App {

  /**
    * Exercise 1 : Define a Spark Session with a local Master
    */
  val spark: SparkSession = ???

  /**
    * Exercise 2 : Using spark, read the following file as an RDD[String]
    *   resources/rdd/frankenstein-or-the-modern-prometheus.txt
    *
    */

  /**
    * Exercise 3 : Count the number of occurences of each word and print the 10 most used ones
    *   We will consider spaces, dashes and punctuation marks (.,;?!) as delimiters
    */


  /**
    * Exercise 4 : Count the number of occurences of each word and print the 10 most used ones ignoring the stop words.
    * A stop words dictionary can be found in :
    *   resources/rdd/stop-words-eng.txt
    */

  /**
    * Exercise 5 : How many words start with letter 'F' in the book ?
    */

  /**
    * Exercise 6 : How many times does "frankenstein" appear in the book ?
    */

  /**
    * Exercise 7 : Which letter is the less used in the book ?
    */




}
