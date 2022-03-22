# 

### Architecture
![Add architecture](https://github.com/dyangcht/msa-test/blob/main/architecture.png)

Using the artifact "opentracing-spring-jaeger-cloud-starter"
```
		<dependency>
			<groupId>io.opentracing.contrib</groupId>
			<artifactId>opentracing-spring-jaeger-cloud-starter</artifactId>
			<version>3.2.2</version>
		</dependency>
```
Using b3 header to propogate the tracing information, sample as following
```
spring.application.name=orderService
opentracing.jaeger.enable-b3-propagation=true
opentracing.jaeger.http-sender.url=http://jaeger-collector:14268/api/traces
spring.zipkin.enabled=false
```
