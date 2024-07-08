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
