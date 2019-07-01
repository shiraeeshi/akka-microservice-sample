name := "service-2"

libraryDependencies ++= ReflectionResolver.getDefaultDependencies()

enablePlugins(AkkaGrpcPlugin)
enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)


packageName in Docker := "shiraeeshi/service2"
version in Docker := "0.1"
dockerExposedPorts := Seq(2552, 8558, 8090)
