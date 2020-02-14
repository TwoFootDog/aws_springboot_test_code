#!/bin/bash
JAR_FILE=$(basename ./*.jar)
echo $JAR_FILE
nohup java -jar $JAR_FILE >>./java.log &
