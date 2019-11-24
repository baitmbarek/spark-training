package io.univalence.spark.training.core.dataframe

import io.univalence.spark.training.core.SparkEnvironment

/**
  * WARNING : Exercises were not sorted by difficulty level. Feel free to skip hard exercises and to come back later
  */
object PlayingWithUDFs extends SparkEnvironment {

  def main(args: Array[String]): Unit = {

    import sparkSession.implicits._
    import org.apache.spark.sql.functions._

    val inputEx1DF = Seq(
      Seq("a","b","c"),
      Seq("X","Y","Z")).toDF("value")

    /**
      * Exercise 1 : Easy
      *   - Flatten all records in order to get a dataframe with a single column and 6 rows
      */


    /**
      * Exercise 2 : Hard
      *   Transform the following dataframe. Number of columns should depend on the array size and is dynamic.
      *
      * +---------+
      * |    value|
      * +---------+
      * |[a, b, c]|
      * |[X, Y, Z]|
      * +---------+
      *
      * to
      *
      * +---+---+---+
      * |  0|  1|  2|
      * +---+---+---+
      * |  a|  b|  c|
      * |  X|  Y|  Z|
      * +---+---+---+
      */


    /**
      * Exercise 3 : Easy
      *   - Find most populated cities by country in the following dataset. Print the city name in capital letters :
      * +-----------------+-------------+----------+
      * |             name|      country|population|
      * +-----------------+-------------+----------+
      * |           Warsaw|       Poland| 1 764 615|
      * |           Cracow|       Poland|   769 498|
      * |            Paris|       France| 2 206 488|
      * |Villeneuve-Loubet|       France|    15 020|
      * |    Pittsburgh PA|United States|   302 407|
      * |       Chicago IL|United States| 2 716 000|
      * |     Milwaukee WI|United States|   595 351|
      * +-----------------+-------------+----------+
      */


    /**
      * Exercise 4 : Easy
      *   Create a custom UDF returning the fibonacci of N as a new column
      */
    val inputFiboDF = (1 to 50).toDF("n")

    /**
      * Exercise 5 : Easy
      *   Replace all null values with "N/A"
      */
    val inputNA = Seq(
      ("hello", null),
      ("hello", "world"),
      (null, null)
    ).toDF("a","b")

    /**
      * Exercise 6 : Easy
      *   Create a new column (result) by applying the following rule :
      *     When "operation" is multiplication, multiply the values from columns a and b with default value = 1
      *     When "operation" is addition, add the values from columns a and b with default value = 0
      *
      */
    val operationsDF = Seq[(String, Option[Int], Option[Int])](
      ("multiplication", Some(3), Some(5)),
      ("multiplication", Option.empty[Int], Some(5)),
      ("multiplication", Some(3), null),
      ("addition", Some(3), Some(5)),
      ("addition", Some(3), null),
      ("addition", null, Some(5))
    ).toDF("operation","a","b")

    /**
      * Exercise 7 : Easy
      *   Find first and second Bestsellers per Genre
      *
      * +---+-----------------+--------+--------+
      * | id|            title|   genre|quantity|
      * +---+-----------------+--------+--------+
      * |  1|    Hunter Fields| romance|      15|
      * |  2|    Leonard Lewis|thriller|      81|
      * |  3|     Jason Dawson|thriller|      90|
      * |  4|      Andre Grant|thriller|      25|
      * |  5|      Earl Walton| romance|      40|
      * |  6|      Alan Hanson| romance|      24|
      * |  7|   Clyde Matthews|thriller|      31|
      * |  8|Josephine Leonard|thriller|       1|
      * |  9|       Owen Boone|  sci-fi|      27|
      * | 10|      Max McBride| romance|      75|
      * +---+-----------------+--------+--------+
      *
      * Expected result :
      *
      * +---+-------------+--------+--------+----+
      * | id|        title|   genre|quantity|rank|
      * +---+-------------+--------+--------+----+
      * | 10|  Max McBride| romance|      75|   1|
      * |  5|  Earl Walton| romance|      40|   2|
      * |  3| Jason Dawson|thriller|      90|   1|
      * |  2|Leonard Lewis|thriller|      81|   2|
      * |  9|   Owen Boone|  sci-fi|      27|   1|
      * +---+-------------+--------+--------+----+
      *
      */

  }

}
