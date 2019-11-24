package io.univalence.spark.training.core.rdd

import io.univalence.spark.training.core.SparkEnvironment


/**
  * BEFORE STARTING
  *   Download the following archive and untar it :
  *     https://storage.cloud.google.com/baitmbarek-spark-training/purchases.tar?folder&hl=fr&organizationId
  */
object ValidatingRecords extends SparkEnvironment {

  def main(args: Array[String]): Unit = {

    /**
      * Spark Session can be retrieved as sparkSession value
      */

    /**
      * Exercise 1 : Read the customers.csv file from resources/rdd/
      */


    /**
      * Exercise 2 : Check the file is valid :
      *   - Each row must have exactly 7 columns :
      * * User ID
      * * first name
      * * last name
      * * phone number
      * * company name
      * * email address
      * * city
      *   - Phone numbers cannot be null
      *   - Email addresses must contain an '@' and be suffixed with a domain name
      *
      * Write the rejected rows to a "rejected.txt" file and keep the valid rows in the RDD.
      */


    /**
      * Exercise 3 : How many persons named Elisabeth can you find in the valid customers RDD ?
      */


    /**
      * Exercise 4 : Read the transactions and products files.
      */


    /**
      * Exercise 5 : For each customer, list the products he bought and the transaction details. All information should be stored in a Root case class "Customer"
      */


    /**
      * Exercise 6 : Which customer spent the most money in our store ?
      */

    /**
      * Exercise 7 : Which day of the week do we sell the most products (in number) ?
      * Hint : Consider using the LocalDate API
      */


  }


}
