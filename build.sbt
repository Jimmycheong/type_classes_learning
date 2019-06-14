name := "type_classes_learning"

version := "0.1"

scalaVersion := "2.12.0"

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.0.0-M1"
)
