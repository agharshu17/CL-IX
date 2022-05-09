# Java MQ

Messaging queues are used as a protocol for Enterprise Messaging Systems with producers and consumers that communicate using JSON, XML.

1. Java Messaging Service is a Java API that allows applications to create, send, receive, and read messages.
2. Enables communication that is loosely coupled.
3. JMS provider - implements JMS interfaces and provides administrative control and features.
4. JMS clients - produce or consume messages
5. Messages - communicate information between JMS clients
6. JMS destinations - the target of the messages, called topics in pub/sub
7. JMS connections - encapsulates the virtual connection with a JMS provider
8. JMS sessions - single threaded context for producing and consuming messages. Sessions are used to create the producers, consumers, messages and topics.
9. JMS message listeners - acts as an asynchronous event handler for messages. implements the `MessageListener` interface which contains one method `onMessage` where you define actions to be taken when the message arrives.


## Steps
1. Create a `ConnectionFactory connectionFactory`
2. Use `connectionFactory` to create a `Connection connection` to a provider
3. Use `connection` to create a `Session session`
4. Uses `session` to create
  <br>a. `message producer`
  <br>b. `message consumer`
  <br>c. `message`