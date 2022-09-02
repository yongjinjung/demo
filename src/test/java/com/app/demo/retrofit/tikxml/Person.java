package com.app.demo.retrofit.tikxml;

import com.tickaroo.tikxml.annotation.PropertyElement;
import com.tickaroo.tikxml.annotation.Xml;

@Xml
public class Person {

    @PropertyElement
    String name;

}