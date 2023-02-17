#!/bin/bash
set -e
nohup $TOMCAT_HOME/bin/startup.sh &
tail -f /dev/null
