# Java Sockets

1. Used for communication between different Java apps running on JRE
2. Connection oriented - `Socket`, `ServerSocket`
3. Connection less - `DatagramSocket`, `DatagramPacket`

## `Socket` class
1. `public InputStream getInputStream()`
2. `public OutputStream getOutputStream()`
3. `public synchronized void close()`
4. Uses TCP
5. Used for client

## `ServerSocket` class
1. `public Socket accept()` - returns the socket and accepts the connection with the client
2. `public synchronized void close()`
4. Uses TCP
5. Used for server

## `DatagramSocket` class
1. Every packet is individually routed and delivered, uses `DatagramPacket` objects
2. Can be used for sending and receiving broadcast messages
3. Uses UDP
4. `DatagramSocket()` - creates a Datagram Socket and binds it to any available port on the machine
4. `DatagramSocket(int port, InetAddress address)` - creates a Datagram Socket and binds it to the specified address and port
5. Used for both client and server
6. `send(DatagramPacket p)`
7. `receive(DatagramPacket p)`
8. `close()`
9. `connect(InetAddress ip, int port)` - used by the client socket instance

## `DatagramPacket` class
1. Independent, self-contained message sent over the network whose arrival, arrival time and content are not guaranteed
2. `DatagramPacket(byte[] buf, int length)` - data must be in the form of bytes
3. `DatagramPacket(byte[] buf, int length, InetAddress address, int port)` - specifies the address and port of the destination
