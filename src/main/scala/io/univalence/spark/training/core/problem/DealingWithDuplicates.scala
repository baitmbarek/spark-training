package io.univalence.spark.training.core.problem

import io.univalence.spark.training.core.SparkEnvironment

/**
  * Download the following files :
  * Contacts :
  * https://baitmbarek-spark-training.s3.eu-west-3.amazonaws.com/contacts/contacts-csv/part-00000-c23d16e2-d34c-4873-bb35-e40873733f12-c000.csv.gz
  * https://baitmbarek-spark-training.s3.eu-west-3.amazonaws.com/contacts/contacts-csv/part-00001-c23d16e2-d34c-4873-bb35-e40873733f12-c000.csv.gz
  * https://baitmbarek-spark-training.s3.eu-west-3.amazonaws.com/contacts/contacts-csv/part-00002-c23d16e2-d34c-4873-bb35-e40873733f12-c000.csv.gz
  * https://baitmbarek-spark-training.s3.eu-west-3.amazonaws.com/contacts/contacts-csv/part-00003-c23d16e2-d34c-4873-bb35-e40873733f12-c000.csv.gz
  *
  * Coordinates :
  * https://baitmbarek-spark-training.s3.eu-west-3.amazonaws.com/contacts/coordinates-csv/part-00000-15379f9f-74a3-47e2-8721-5b1d5eba0f37-c000.csv.gz
  * https://baitmbarek-spark-training.s3.eu-west-3.amazonaws.com/contacts/coordinates-csv/part-00001-15379f9f-74a3-47e2-8721-5b1d5eba0f37-c000.csv.gz
  * https://baitmbarek-spark-training.s3.eu-west-3.amazonaws.com/contacts/coordinates-csv/part-00002-15379f9f-74a3-47e2-8721-5b1d5eba0f37-c000.csv.gz
  * https://baitmbarek-spark-training.s3.eu-west-3.amazonaws.com/contacts/coordinates-csv/part-00003-15379f9f-74a3-47e2-8721-5b1d5eba0f37-c000.csv.gz
  *
  *
  * Find all the duplicated contacts (matching one of the following rules) :
  *   - Same firstname / lastname / email address
  *   - Same firstname / lastname / phone number
  *   - Same firstname / lastname / birthdate
  *
  *
  * You'll have to write both the deduplicated dataset in a parquet file and the duplicated rows in a csv so we can notify our source application about anomalies
  *
  */
object DealingWithDuplicates extends SparkEnvironment {

  def main(args: Array[String]): Unit = {

  }

}
