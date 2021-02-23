# a4-api-gateway-jwt
##### This assignment runs with the tutorial and uses the code 
##### from ["Micronaut Microservices Fundamentals In Practice" by Ahmed Al Hashmi](https://medium.com/@hashimati/micronaut-microservices-fundamentals-in-practice-fdf74af2b88f)

However, the tutorial is not that complated in detail for beginners <br/>
Here are some steps to run the code.

### Prerequisites
1. [MYSQL](https://dev.mysql.com/downloads/mysql/) <br/>
2. [MongoDB](https://tutorial.techaltum.com/mongodb-installation.html) <br/>
3. [Consul](https://www.consul.io/)
4. [Homebrew](https://brew.sh/) (optional)
### Step 1
Config JDK using Java8
### Step 2
Enable annotation <br/>
<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/enable-annotation.png" width="700" alt="accessibility text">
### Step 3
Install lombok <br/>
<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/install-lombok.png" width="700" alt="accessibility text">

### Step 4
run consul
```
$ ./consul agent -data-dir="/anywhere/for/storing/node" -dev -ui
```
### Step 5
Start MongoDB
```
$ brew services start mongodb-community
```
or 
```
$ brew services start mongodb-community@version
```
### Step 6 
Update Mysql config in UserServices/src/resources/application.yml
<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/edit-userservices-yml-file.png" width="600" alt="accessibility text">
Run the command line below and input password
```
$ mysql -u root -p
```
Then create a new database
```
mysql>  CREATE DATABASE helloworlddb;
```
### Step 7 run UserService, RequestsService, OfferService <br/>
Open 3 terminals, cd to each directory and run
```
$ gradle run
``` 
if "gradle: command not found" then run ``` $ brew install gradle```
<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/terminals2-running-services.png" width="700" alt="accessibility text">
###

### Step 8 run Gateway
Open a new terminal and run
```
$ gradle rootRun
```
<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/terminals1.png" width="700" alt="accessibility text">

#### open ``` http://localhost:8500 ``` and check the consul

<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/consul%20view.png" width="500" alt="accessibility text">

#### Now we can check the endpoints of the application
### /uaa/signup

<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/check-register-service-provider.png" width="500" alt="accessibility text">

### /uaa/login
<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/check-service-provider-login.png" width="500" alt="accessibility text">

### /reuqests/api/submit

<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/check-submit-request-using-user-token.png" width="500" alt="accessibility text">

### /offers/api/offers

<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/check-getting-offers-of-service-request.png" width="500" alt="accessibility text">

### get /requests/api/requests/reject

<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/check-reject-offer-using-refresh-token.png" width="500" alt="accessibility text">

### get /requests/api/requests/accept

<img src="https://github.com/eggchul/a4-api-gateway-jwt/blob/master/screenshots/check-accept-offer-using-refresh-token.png" width="500" alt="accessibility text">
