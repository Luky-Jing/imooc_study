package com.imooc.tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test03 {

    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://www.baidu.com");
            // 通过openStream获取资源的字节输入流
            InputStream is = url.openStream();
            // 将字节输入流转换为字符输入流
            InputStreamReader isr = new InputStreamReader(is);
            // 为字符输入流添加缓冲
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
            isr.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
