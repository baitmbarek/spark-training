package io.univalence.spark.training.core.dataset

import io.univalence.spark.training.core.SparkEnvironment

/**
  * BEFORE STARTING
  *   Download the following archive and untar it :
  *     https://storage.cloud.google.com/baitmbarek-spark-training/the-movies-dataset.zip?folder&hl=fr&organizationId
  *   Source Data from Kaggle : https://www.kaggle.com/rounakbanik/the-movies-dataset
  */
object MoviePreparation extends SparkEnvironment {
  def main(args: Array[String]): Unit = {

    /**
      * Exercise 1 : Read the downloaded files as DataFrames.
      * Warning: Some records' descriptions contain both double quotes and commas (ie: movie 31357)
      * Take a look to available csv options : https://docs.databricks.com/data/data-sources/read-csv.html
      *
      * Print some records and make sure the structure is correct
      */

    /**
      * Exercise 2 : Extract the nested json informations to get a Scala structure (ie: collection, genres, keywords)
      * You can use for instance the jackson library, circe or any other scala Json library
      * The dataframes can be encoded as Datasets with custom structures.
      */

    /**
      * Exercise 3 : Join all the datasets to obtain one complete record by movie.
      * Note that ratings can be summerized : for each movie, keep track of the number of rates by "rating value", the minimum and the maximum rating timestamps.
      */

    /**
      * Exercise 4 : Save your result as a parquet file.
      */

  }
}
