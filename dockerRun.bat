@echo off
rem docker run -p 8080:8080 --name docker-maven docker-maven
rem mvn package
docker run --rm -p 8080:8080 --name docker-maven jonasschuh/docker-maven:0.0.2


