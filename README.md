Java Apache Thrift Demo
=======================

```
brew install thirft
thrift --gen java -out src/main/java/demo plus.thrift
```

将会在`src/main/java/demo/thrift_gen`生成相关的Java文件。

需要注意的是，生成的Java代码中，不光包含描述数据结构的代码，还包括Server和Client需要用到的代码，方便我们直接使用它们来创建我们自己的Server/Client.

Server
------

在IDE中运行`demo.Server`，服务器启动后会监听`9090`端口。

```
Starting the simple server at 9090 ...
```

Client
------

在IDE中运行`demo.Client`，它会连接服务器，并发出请求，得到回应后退出。

```
plus(1, 2) = 3
```