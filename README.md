# Overview

Leisure Pass Group :: Coding Assesment

###Pre-Requisites

This project is contains a [**Docker Compose**](https://docs.docker.com/compose/)  file that contains all the infrastructure dependencies for the project to run. Hence will be required to have installed [Docker](https://www.docker.com/get-started) in your computer.


###Install Infrastrcuture REquired
1. Run `cd environment` from project root
2. Run `docker-compose up`
3. if it desired to DB only:
    * Run `docker-compose -f db.yml up`

### DB Setup

1. To connect to the DB indroduce details below:
    * Host: **localhost**
    * Port: **5432**
    * DB: **postgres**
    * Username: **postgres**
    * Password: **postgres**

2. To create a DB instance type the command below:
   * Run `CREATE DATABASE lpg OWNER postgres;`


### Running the application
* Run `gradle build`
* Run `gradle bootRun`

### Build and Run Docker container
* Run the `./gradlew build -x test`
* Run `docker build -f ./Dockerfile -t gnovoab-lpg-service:local .`
* Run `docker run --rm -it -p 8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" --env MANAGEMENT_PATH=/admin --name gnovoab-lpg-service gnovoab-lpg-service:local` 
     


### Endpoints

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html  ) 
 

