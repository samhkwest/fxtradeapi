# A simple RESTFul API Controller for query and creation of Fx Trades 

## How to use

**1. Clone the application**

```bash
Create a project folder "fxtrade" inside your PC's working folder [Root Path].
Download program sources by: [Root Path]\fxtrade\git clone https://github.com/samhkwest/fxtradeapi
```

**2. Mysql database**
```bash
For demonstration, a MySql database has been created by Aurora MySql and is hosted in AWS.
The DB configurations are in application.properties file.
```

**3. Run the app using maven**

```bash
In folder "fxtrade", run this command:
java -jar target/fxtradeapp-0.0.1-SNAPSHOT.jar

```

The app will start running at <http://localhost:8080/fxtrade>.

**4. Usage of APIs**
```bash
The app defines following APIs.

    GET /fxtradeapi/trades
    
    POST /fxtradeapi/trade
```  
**5. Test the APIs**
```bash
Setup service endpoints in Open Postman

1) GET /fxtradeapi/trades
Endpoint: http://localhost:8080/fxtrade/trades
Header: Key: Content-Type, Value: application/json

2) POST /fxtradeapi/trade
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

Send API request
1) For GET API, click "Send" and then check the response in Body frame.

2) For POST API, same as above. For repetitive request message, change the value of "usrid" or "messagets" because there is a unique constraints for column usrid and messagets.
```
