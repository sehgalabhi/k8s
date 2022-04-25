# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#production-ready)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)




java -jar target/k8s-demo-app-0.0.1-SNAPSHOT.jar --sping.config.location=file:/.

java -jar target/k8s-demo-app-0.0.1-SNAPSHOT.jar --welcome.message="app-cmd"

$ java -jar myapp.jar --spring.application.json='{"my":{"name":"test"}}'

java -jar target/k8s-demo-app-0.0.1-SNAPSHOT.jar --spring.config.location=file:/Users/asehgal/Documents/workspaces/docker/application.yaml

java -jar target/k8s-demo-app-0.0.1-SNAPSHOT.jar --spring.config.location=file:/Users/asehgal/Documents/workspaces/docker/kubernetes-config/application.yaml



mvn spring-boot:build-image -DskipTests
k apply -f k8s/
kubectl port-forward service/k8s-demo-app 8080:80


kubectl create secret generic mysecrets-dev --from-literal=bean.testpassword1=password1-dev --from-literal=bean.testpassword2=password2-dev
kubectl create secret generic mysecrets-test --from-literal=bean.testpassword1=password1-test --from-literal=bean.testpassword2=password2-test
kubectl create secret generic mysecrets-prod --from-literal=bean.testpassword1=password1-prod --from-literal=bean.testpassword2=password2-prod


kubectl delete secret mysecrets-prod --ignore-not-found
kubectl create secret generic mysecrets-prod --from-literal=bean.testPassword1=password1-prod-changed --from-literal=chrbean.testPassword2=password2-prod-changed

k exec k8s-demo-app-55989d7d58-6g5gv  -it sh

k exec deployment.apps/k8s-demo-app -it sh


kubectl delete -f k8sprofiles/configs
kubectl delete -f k8sprofiles/deployment


kubectl apply -f k8sprofiles/configs
kubectl apply -f k8sprofiles/deployment



kubectl delete -f k8smountedconfigmap/configs
kubectl delete -f k8smountedconfigmap/deployment


kubectl apply -f k8smountedconfigmap/configs
kubectl apply -f k8smountedconfigmap/deployment
