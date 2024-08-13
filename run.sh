#!/bin/bash

echo $1

java -cp target/demo-0.0.1-SNAPSHOT.jar -Dloader.main=org.fogbeam.demo.$1Application  org.springframework.boot.loader.PropertiesLauncher
