package io.univalence.spark.training.core

import org.apache.spark.sql.SparkSession

trait SparkEnvironment {

  lazy val sparkSession = SparkSession.builder().config("spark.ui.enabled","true").master("local[*]").appName("spark-exercises").getOrCreate

}
