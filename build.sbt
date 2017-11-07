import AssemblyKeys._

assemblySettings

name := "PredictionIO-MultiLabelClassification"

organization := "org.apache.predictionio"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.predictionio" % "apache-predictionio-core_2.11" % "0.12.0-incubating" % "provided",
  "de.julielab" % "aliasi-lingpipe" % "4.1.0",
  "org.carrot2" % "carrot2-core" % "3.11.0",
  "org.apache.spark" %% "spark-core" % "1.3.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "1.3.0" % "provided",
  "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test",
  "com.google.guava" % "guava" % "18.0",
  "org.jblas" % "jblas" % "1.2.4"
)