# CORBA

1. Stands for Common Object Request Broker Architecture
2. Promotes design of applications as a set of cooperating objects
3. Clients are isolated from servers by interface
4. CORBA objects can be run on any platform, can be located anywhere on the network and can be written in any language that has IDL(Interface Definition Language) mapping.
5. Consists of ORB, APIs for RMI, APIs for IDL.

## Object Request Broker
1. Object manager in CORBA
2. Present on the client side as well as the server side.
3. On the client side, it is responsible for:
  <br>a. accepting requests for a remote object
  <br>b. finding implementation of the object
  <br>c. accepting client side reference of the remote object (e.g. a Java stub object)
  <br>d. routing client method calls through the object reference to the object implementation
4. On the server side, it is responsible for:
  <br>a. lets object servers register new objects
  <br>b. receives requests from the client ORB
  <br>c. uses object's skeleton interface to invoke object's activation method
  <br>d. creates a reference for a new object and sends it back to the client
5. Between the ORBs, **Inter-ORB protocol** is used for communication.

## Steps
1. Make the calc.idl file defining the interface
```
interface calc
{
  double addfn(in double a,in double b);
  double subfn(in double a,in double b);
  double mulfn(in double a,in double b);
  double divfn(in double a,in double b);
};
```
2. Run `idlj -fall calc.idl`
  <br>a. "calcPOA.java" - abstract skeleton class that the server will extend
  <br>b. "calcHelper.java" - provides additional functionality - responsible for writing and reading data to CORBA streams
  <br>c. "calcHolder.java" - provides operations for input stream and output stream
  <br>d. "calcOperations.java" - contains all the methods
  <br>e. "_calcStub.java" - client stub that implements the calc.java interface
  <br>f. "calc.java" - Java version of the IDL interface