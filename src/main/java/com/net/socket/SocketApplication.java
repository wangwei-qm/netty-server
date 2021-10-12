package com.net.socket;

import com.net.socket.netty.NettyServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetSocketAddress;


@SpringBootApplication
public class SocketApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SocketApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //启动服务端
        NettyServer nettyServer = new NettyServer();
        nettyServer.start(new InetSocketAddress(args[0], Integer.parseInt(args[1])));
    }
}
