name := "service-1"

libraryDependencies ++= ReflectionResolver.getDefaultDependencies()

enablePlugins(AkkaGrpcPlugin)
enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

packageName in Docker := "shiraeeshi/service1"
version in Docker := "0.2"
dockerExposedPorts := Seq(2552, 8558)
