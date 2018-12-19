package com.sparta.jas;

import java.util.List;

public class Triangle2 implements Shape{

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){
        System.out.println("Triangle with points at:");
        for(Point point:points) {
            System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");
        }
    }
//
//    public void myInit(){
//        System.out.println("Initialisation for Triangle");
//    }
//
//    public void cleanup(){
//        System.out.println("Cleanup Commencing");
//    }
}
