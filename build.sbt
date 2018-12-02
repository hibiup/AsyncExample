name := "AsyncExample"

version := "1.0"

scalaVersion := "2.12.5"
val akkaVersion = "2.5.17"
val scalaTestVersion = "3.0.5"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
)