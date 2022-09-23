package com.app.demo.stream;

import com.app.demo.stream.dto.MarineUnit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01_ObjectOutputStream {
    public static void main(String[] args) {

        MarineUnit unit = new MarineUnit();
        unit.setName("전사1");


        MarineUnit unit2 = new MarineUnit();
        unit2.setName("전사2");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\serialObject\\Object.bin"))){
            oos.writeObject(unit);
            oos.writeObject(unit2);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
