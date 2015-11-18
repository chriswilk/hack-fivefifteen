name := """hack-five-fifteen"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "com.squareup.okhttp" % "okhttp" % "2.5.0",
  "com.typesafe.play" % "play-json_2.11" % "2.4.0-M2",
  "org.pegdown" % "pegdown" % "1.6.0"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
