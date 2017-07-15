# osiris
A test project between @inderpreet and @amarjeet for working with Java Spring, SpringBoot and Kotlin.

There is nothing here for you. 

## REST endpoint support

The system implements RESTful services with endpoints represented in the following format

1. Complete URI EndPoint
REST services may be accessed by providing a complete URI for the device which includes the id as part of the URI such as

```
http://localhost:8080/DeviceID/1234?temperature=12.54
```
Here DeviceID is the keyword that may be replaced by other identifier such as ClientID to retrieve data from the service. 1234 is the id in this instance and will vary from device to device. temperature is the parameter values and other variables may be used such as pressure, humidity etc. The name for these variables shall be defined via a web based GUI.

Multiple variables may be used with the HTTP request.

2. Partial URI EndPoint
The partial URL method allows for the device ID and other parameters to be passed as part of a JSON object and POST request. This is intended to be used for browser free interactions.

For more information [Click here ](https://www.leveluplunch.com/java/tutorials/014-post-json-to-spring-rest-webservice/) for a tutorial article on the use case.

## Persistance
Hibernate?

## Web GUI
A Web based GUI allowing for a user to login as administrator. The administrator can view a table of all previous data transactions with date and time stamps and can delete selected sets.

### Graphs
Graphical representation of persisted data.

### Alerts service
Simple Alerts via email for when a particular query results in a threshold crossing.
