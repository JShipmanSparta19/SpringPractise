package com.sparta.jas;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Circle implements Shape{
    private Point center;

    @Override
    public void draw() {
        System.out.println("Circle centered on: ("+ getCenter().getX() + ", " + getCenter().getY() + ")");
    }

    public Point getCenter() {
        return center;
    }

//    @Autowired
//    @Qualifier("circleRelated")

    @Resource(name="pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initialiseCircle(){
        System.out.println("Init of Circle");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destruction of Circle");
    }
}
