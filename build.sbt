import Dependencies.*

val scala3Version = "3.6.4"

ThisBuild / scalaVersion = scala3Version
ThisBuild / organization = "io.github.sceredi"
ThisBuild / description = "A template for Scala3 projects"

ThisBuild / homepage := Some(
  url(
    "https://github.com/sceredi/template-for-scala3-projects"
  )
)
ThisBuild / licenses := List(
  "MIT" -> url("https://mit-license.org/")
)
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / developers := List(
  Developer(
    "sceredi",
    "Simone Ceredi",
    "ceredi.simone@gmail.com",
    url("https://github.com/sceredi")
  )
)
ThisBuild / scalacOptions ++= Seq(
  "-Werror",
  "-Wunused:all",
  "-Wvalue-discard",
  "-Wnonunit-statement",
  "-Yexplicit-nulls",
  "-Wsafe-init",
  "-Ycheck-reentrant",
  "-Xcheck-macros",
  "-rewrite",
  "-indent",
  "-unchecked",
  "-explain",
  "-feature",
  "-language:strictEquality",
  "-language:implicitConversions"
)
ThisBuild / coverageEnabled := true
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / wartremoverErrors ++= Warts.allBut(Wart.Any)

/*
 * Dependencies
 */
ThisBuild / libraryDependencies ++= scalaTestBundle
ThisBuild / libraryDependencies += scalaTestJUnit5

lazy val root = project
  .in(file("."))
  .settings(
    name := "template-for-scala3-projects",

    scalaVersion := scala3Version,
  )
