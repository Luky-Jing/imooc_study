package com.imooc.tcp;

import java.net.MalformedURLException;
import java.net.URL;

public class Test02 {

    public static void main(String[] args) throws MalformedURLException {
        URL imooc = new URL("http://www.imooc.com");
        URL url = new URL(imooc, "/index.html?username=623620767@qq.com#test"); //?表示参数，#表示锚点
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        // 如果未指定端口号，则使用默认端口号，此时getPort()方法返回-1
        System.out.println(url.getPort());
        System.out.println(url.getRef());
        System.out.println(url.getQuery());
    }
}
