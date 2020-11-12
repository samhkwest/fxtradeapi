[![Build Status](https://travis-ci.com/givanthak/spring-boot-rest-api-tutorial.svg?branch=master)](https://travis-ci.com/givanthak/spring-boot-rest-api-tutorial)
[![Known Vulnerabilities](https://snyk.io/test/github/givanthak/spring-boot-rest-api-tutorial/badge.svg)](https://snyk.io/test/github/givanthak/spring-boot-rest-api-tutorial)



# A simple RESTFul API Controller for query and creation of Fx Trades 

## How to use

**1. Clone the application**

```bash
https://github.com/samhkwest/fxtradeapi
```

**2. Mysql database**
```bash
For demonstration purpose, a MySql database has been created by Aurora MySql and is hosted in AWS. The DB configurations are in application.properties file.
```

**3. Build and run the app using maven**

```bash
mvn package
java -jar target/fxtradeapp-0.0.1-SNAPSHOT.jar

```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following APIs.

    GET /fxtradeapi/trades
    
    POST /fxtradeapi/trade
      
