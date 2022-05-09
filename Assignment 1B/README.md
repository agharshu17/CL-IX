# Java RMI

Remote Method Invocation is a pure Java solution to Remote Procedure Calls

## Steps
1. **Define a remote interface** - provides description of the methods that can be invoked by remote clients. `ClassInterface` extends `Remote`
2. **Implement the remote interface** - `ClassName` extends `UnicastRemoteObject` and implement the interface
3. **Create stub and skeleton objects using the RMI compiler** - run `rmic ClassName`
4. **Start the `rmiregistry`** - run `start rmiregistry`
5. **Create and execute the server application project**
  <br>a. `ClassInterface object = new ClassName;`
  <br>b. Create the registry - `LocateRegistry.createRegistry(1900)`
  <br>c. `Naming.rebind("rmi://locahost:1900" + "/endpoint", object);`
6. **Create and execute the client application project**
  <br>a. `ClassInterface object = (ClassInterface)Naming.lookup("rmi://localhost:1900" + "/endpoint");`
  <br>b. `result = object.function(parameter);`
