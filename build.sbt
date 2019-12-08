import interplay.ScalaVersions

playBuildRepoName in ThisBuild := "play-utils"

lazy val `play-utils` = project
  .in(file("."))
  .enablePlugins(PlayLibrary)
  .settings(
    name := "play-utils",
    scalaVersion := ScalaVersions.scala212,
    crossScalaVersions := Seq(ScalaVersions.scala212, ScalaVersions.scala213),
    releaseCrossBuild := true
  )
