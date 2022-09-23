package com.app.demo.stream;

import com.app.demo.stream.dto.MarineUnit;

import java.io.*;

public class Ex01_ObjectInputStream {
    public static void main(String[] args) {
        

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\serialObject\\Object.bin"))) {
            MarineUnit a = (MarineUnit) ois.readObject();
            System.out.println("a.getName() = " + a.getName());
            MarineUnit b = (MarineUnit) ois.readObject();
            System.out.println("b.getName() = " + b.getName());
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
