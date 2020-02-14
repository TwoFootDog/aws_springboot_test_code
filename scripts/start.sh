#!/bin/bash
BUILD_PATH=$(ls /home/ec2-user/build/*.jar)
JAR_NAME=$(basename $BUILD_PATH)
echo "> build 파일명: $JAR_NAME" >> deploy.log

echo "> build 파일 복사" >> deploy.log
DEPLOY_PATH=/home/ec2-user/
cp $BUILD_PATH $DEPLOY_PATH

APPLICATION_JAR=$DEPLOY_PATH$JAR_NAME
echo "> $APPLICATION_JAR 배포"    >> deploy.log
nohup java -jar $APPLICATION_JAR >> deploy.log &