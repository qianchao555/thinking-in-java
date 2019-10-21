package com.qc.ch18;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch18
 * @ClassName: LogonTransient
 * @Author: android2
 * @Description:
 * @Date: 2019/10/21 上午10:48
 * @Version: 1.0
 */
public class LogonTransient implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;

    public LogonTransient(String name, String pwd) {
        this.username = name;
        this.password = pwd;
    }
    @Override
    public String toString(){
        return "username:"+username+"\npassword:"+password+" \n"+ date;
    }


    public static void main(String[] args) throws Exception{
        LogonTransient a = new LogonTransient("qc", "110110");
        System.out.println(a);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("Logon.out"));
        objectOutputStream.writeObject(a);
        objectOutputStream.close();
        TimeUnit.SECONDS.sleep(2);
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("Logon.out"));
        System.out.println("Recovering object at "+new Date());
        a= (LogonTransient) in.readObject();
        System.out.println(a);
    }
}
