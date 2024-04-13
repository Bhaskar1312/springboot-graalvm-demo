package com.example.graalvmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraalvmDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraalvmDemoApplication.class, args);
	}

}
// pre  Started GraalvmDemoApplication in 2.162 seconds
// native-image --version
// mvn -Pnative native:compile or gradle nativeCompile
// target/demo or build/native/nativeCompile/demo
// post graal Started DemoApplication in 0.051 seconds (process running for 0.053)
// Regarding CPU architecture support: Cloud Native Buildpack support allows you to create Linux x86/AMD container images independently of the host Operating System, but ARM CPU architecture (e.g. the Mac M1 CPU) is not yet supported
// ./mvnw spring-boot:build-image [optional -Dspring-boot.build-image.imageName=myorg/myapp] or ./gradlew bootBuildImage  --imageName=myorg/myapp
//  docker run --rm -p 8080:8080 docker.io/library/demo:0.0.1-SNAPSHOT
// Started DemoApplication in 0.041 seconds
