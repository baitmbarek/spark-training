name := "spark-training"

version := "0.1"

scalaVersion := "2.12.10"

val sparkVersion = "2.4.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-graphx" % sparkVersion
)
libraryDependencies += "org.apache.bahir" %% "spark-streaming-twitter" % "2.4.0"


libraryDependencies += "it.bitbl" %% "scala-faker" % "0.4"
