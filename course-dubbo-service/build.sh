#!/usr/bin/env bash

mvn package
if [ $? != 0 ];then
    echo "mvn package failed!!!"
    exit 1
fi
docker build -t course-service:latest .