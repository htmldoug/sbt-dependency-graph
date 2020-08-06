
resolvers += Resolver.url("Ivy Plugin Releases", url("https://artifacts.werally.in/artifactory/ivy-plugins-release"))(Resolver.ivyStylePatterns)
resolvers += "Maven Plugin Releases" at "https://artifacts.werally.in/artifactory/plugins-release"

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")
addSbtPlugin("com.dwijnand"     % "sbt-dynver"      % "2.0.0")
