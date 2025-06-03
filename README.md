# ChatApp

A simple Java-based client-server chat application built from scratch using sockets.

## 🚀 Features

- Peer-to-peer messaging via TCP
- Separate `ChatServer` and `ChatClient` classes
- Real-time communication in terminal
- Built using core Java (no external libraries)

## 🛠 How to Run

### 🖥 Requirements
- Java Development Kit (JDK)
- Terminal (macOS, Linux, or Windows)

### 📦 Compile the files
```bash
javac ChatServer.java
javac ChatClient.java

Step 1: Run the Server
In one terminal tab:java ChatServer

Step 2: Run the Client
In a second terminal tab:java ChatClient
Enter the server IP and port when prompted.

 File Structure
ChatApp/
├── ChatServer.java
├── ChatClient.java
├── README.md

Notes

Server must be running before clients can connect.
Localhost IP (127.0.0.1) works for testing on the same machine.

Future Improvements

GUI interface using JavaFX or Swing
Group chat or multiple client support
Chat history and logging
File sharing capability

Author

Alfin Sen Varghese
GitHub: @AlfinSen# ChatApp
