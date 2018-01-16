import scala.language.postfixOps
import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name := "kubernetes-playground",
    inThisBuild(List(
      organization := "com.backwards",
      scalaVersion := "2.12.4"
    )),
    scalacOptions ++= Seq(
      "-feature",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:reflectiveCalls",
      "-language:postfixOps",
      "-language:experimental.macros",
      "-Yrangepos",
      "-Yrepl-sync"
    ),
    libraryDependencies ++= Seq(
      scalaTest % Test
    ),
    libraryDependencies ++= Seq(
    )
  )