#!/usr/bin/env bash

cur_dir=`pwd`
docker stop yimin-mysql
docker rm yimin-mysql
docker run --name yimin-mysql -v ${cur_dir}/conf:../my.cnf -v ${cur_dir}/data:/E:/Dev_Software/mysql/MYSQL/data -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest