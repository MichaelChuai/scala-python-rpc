name := "scala-python-rpc"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.thrift" % "libthrift" % "0.9.3"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.21",
  "ch.qos.logback" % "logback-core" % "1.1.7",
  "ch.qos.logback" % "logback-classic" % "1.1.7"
)