resolvers ++= Seq[Resolver](
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases",
  "Artima Maven Repository" at "http://repo.artima.com/releases",
  Resolver.sbtPluginRepo("releases"),
  Classpaths.sbtPluginReleases
)

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.7")