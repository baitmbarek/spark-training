package io.univalence.spark.training.streaming

import org.apache.spark.streaming.twitter.TwitterUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}

object TwitAnalytics extends App {

  System.setProperty("twitter4j.oauth.consumerKey", "consumerKey")
  System.setProperty("twitter4j.oauth.consumerSecret", "consumerSecret")
  System.setProperty("twitter4j.oauth.accessToken", "accessToken")
  System.setProperty("twitter4j.oauth.accessTokenSecret", "accessTokenSecret")

  System.setProperty("twitter4j.oauth.consumerKey", "wTd7bqfJUJUFCzqREhQTtitte")
  System.setProperty("twitter4j.oauth.consumerSecret", "vPpeKw6M2wVJRwdJ1MmqTZeGLQpViiM6nSsGVWt0TJk2BZUXC9")
  System.setProperty("twitter4j.oauth.accessToken", "793825353537953794-UGI0guYS0JYttRFycOow5tJLT9gfmoW")
  System.setProperty("twitter4j.oauth.accessTokenSecret", "B8tmz7R3Gim6pNtGAiJUinAQajYx1yPiSXMJhKnq4fqJa")

  //Here we look at tweets every 5 seconds
  val ssc = new StreamingContext("local[*]", "PrintTweets", Seconds(5))

  val filters = Array("mourinho")
  val tweetStream = TwitterUtils.createStream(ssc, None, filters)

  tweetStream.map{status =>
    status.getUser.getName + s"(${status.getLang})" + " => "+status.getText
  }.foreachRDD(rdd =>
    rdd.foreach(println)
  )

  ssc.start()
  ssc.awaitTermination()

}
