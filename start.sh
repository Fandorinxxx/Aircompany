#!/bin/bash

mvn install
cd target/ 
java -jar Airline-1.0-SNAPSHOT.jar
