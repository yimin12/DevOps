#!/usr/bin/env bash

mvn package
docker build -t user-edge-service:latest .

#docker run -idt -p 8082:8082 yimin-user-edge-service:latest \ --mysql.address=192.168.119.7