package io.univalence.spark.training.core.dataframe

import io.univalence.spark.training.core.SparkEnvironment

/**
  * Read the following csv Files representing shoes caracteristics :
  *   src/main/resources/dataframe/shoes/
  *
  *   - "attributeValues" file has one record by shoeId and attribute.
  *   - "categories" file has an entry by category for each shoeId
  *   - "sizes" file has an entry by available size for each shoeId
  *
  *  Exercise : Create and store a dataframe with a unique record by shoeId containing all the attributes as columns
  *
  */
object TransposingData extends SparkEnvironment {

  def main(args: Array[String]): Unit = {

  }

}
