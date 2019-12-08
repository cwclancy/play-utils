playBuildRepoName in ThisBuild := "play-utils"

lazy val `play-utils` = project
  .in(file("."))
  .enablePlugins(PlayLibrary)
  .settings(
    name := "play-utils",
    scalaVersion := "2.12.1",
    crossScalaVersions := Seq("2.11.8", "2.12.1"),
    releaseCrossBuild := true
  )
