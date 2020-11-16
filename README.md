# A simple RESTFul API Controller for query and creation of Fx Trades 

## How to use

**1. Clone the application**

```bash
Create a project folder "fxtrade" inside your PC's working folder [Root Path].
Run this command to download program sources:

[Root Path]\fxtrade\git clone https://github.com/samhkwest/fxtradeapi
```

**2. Mysql database**
```bash
For demonstration, a MySql database "MySqlDb" has been created by Aurora MySql and is hosted in AWS.
The DB configurations are in application.properties file.
The database MySqlDbA contains only 1 table "fxtrade", which is used to store the json data:

CREATE TABLE `fxtrade` (
  `id` int NOT NULL AUTO_INCREMENT,
  `usrid` varchar(50) DEFAULT NULL,
  `sellccy` char(3) DEFAULT NULL,
  `buyccy` char(3) DEFAULT NULL,
  `sellamt` float DEFAULT NULL,
  `buyamt` float DEFAULT NULL,
  `fxrate` float DEFAULT NULL,
  `messagets` varchar(30) DEFAULT NULL,
  `origctry` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UC_TRADE_MESSAGE` (`usrid`,`messagets`)
) 

```

**3. Package and run the app**

```bash
Compile and package the app:
[root drive]\fxtradeapi>mvn install -Dmaven.test.skip=true

Run the app:
[root drive]\fxtradeapi>java -jar target/fxtradeapi-0.0.1-SNAPSHOT.jar

```

The app will start running at <http://localhost:8080/fxtrade>.


![compile success](https://github.com/samhkwest/mydoc/blob/master/run_fxtradeapi.PNG)

**4. Usage of APIs**
```bash
The app defines 2 APIs.

    GET /fxtrade/trades: to get all fx trades
    
    POST /fxtrade/trade: to add a new fx trade
```  

## How to test

**1. Setup endpoints in Postman**

```bash
1) GET /fxtrade/trades

Endpoint: http://localhost:8080/fxtrade/trades

Header: Key: Content-Type, Value: application/json

2) POST /fxtrade/trade

Endpoint: http://localhost:8080/fxtrade/trade

Header: Key: Content-Type, Value: application/json

Body:
{
    	"usrid":"334256",
	"sellccy":"EUR",
	"sellamt":2345000,
	"buyccy":"GBP",
	"buyamt":10000,
	"fxrate":0.747,
	"messagets":"12-Nov-20 12:57:44",
	"origctry":"FR"
}
```
**2. Test the APIs**

```bash
1) For GET API, click "Send" and then check the response in Body frame.
```
![get fx trades](https://github.com/samhkwest/mydoc/blob/master/getfxtrades_results.PNG)

```bash
2) For POST API, same as above. 
As a unique constraints for column usrid and messagets is set to DB table, 
change the value of "usrid" OR "messagets" for each new request.
```
![add fx trade](https://github.com/samhkwest/mydoc/blob/master/addfxtrade_results.PNG)



## Automation Test

**1. JUnit classes**

```bash
The JUnit test classes are in fxtradeapi\src\test\java\com\fxtradeapi\controller.
```
**2. Run the automation test**

```bash
In eclipse, right click the class file FxTradeControllerTest and run as "JUnit Test".

The test results will be shown in console.

For Post API, newly added recorded can be checked in the UI fxtradeapp.
```



