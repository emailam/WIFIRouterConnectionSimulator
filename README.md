# Project Name
Wi-Fi Router Connection Simulator
# Description
This project simulates a limited number of devices connected to a router's Wi-Fi using Java threading and semaphores. The simulation ensures that the router only allows a maximum number of concurrent connections (N). If the number of connected devices reaches the limit, new connections must wait until a spot is available.
# Problem Definition
The simulation adheres to the following rules:
* The number of connected devices is initially zero.
* When a client logs in, a message is printed. If the client can be served (i.e., it can connect to the internet), it performs the following actions:
  -  Connect
  -  Perform online activity
  -  Log out
  These actions are represented by printed messages, with random waiting times between actions.
* If all connections are occupied, incoming clients must wait until a current connection is released.
* When a client logs out, a waiting client (if any) will take its place and connect to the internet.
# Solution Design
The program includes the following classes:
1. Router Class: Manages a list of connections and includes methods to occupy and release connections.
2. Semaphore Class: Manages synchronization.
3. Device Class: Represents various devices (threads) that can connect to the router. Each device has a name (e.g., C1) and a type (e.g., mobile, PC, tablet). The device can:
   - Connect
   - Perform online activity
   - Disconnect/logout
4. Network Class: Contains the main method where the user inputs:
   - N: Maximum number of connections the router can accept
   - TC: Total number of devices that wish to connect
   The user also provides the name and type of each device.
# Program Output
The program logs the output to a file, simulating the execution order of device threads and the printed messages of each device.
# Usage
To run this project:
1. Clone the repository.
2. Compile the Java files using a Java compiler.
3. Run the main method in the Network class.
4. Provide the required inputs:
   - Maximum number of connections (N)
   - Total number of devices (TC)
   - Name and type of each device
# Contributors
- [Mohamed Khaled](https://github.com/emailam)
- [Ahmed Mohamed](https://github.com/AliveTube)
- [Beshoy Hany](https://github.com/beshoy-hany74)
