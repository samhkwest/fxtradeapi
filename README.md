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

## Explore Rest APIs

The app defines following APIs.

    GET /fxtradeapi/trades
    
    POST /fxtradeapi/trade
  
**4. Test the APIs**

