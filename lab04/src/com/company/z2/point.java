package com.company.z2;
import static java.lang.Math.*;

public class point {
    int x, y,x2,y2;

    point(){
        this.x = 0;
        this.y = 0;
    }

    point(int x, int y){
        this.x = x;
        this.y = y;
    }


    void count_distance(int x, int y){
        System.out.println("Dystans: "+sqrt( (Math.pow(x-this.x, 2))+ (Math.pow(y-this.y, 2))));
        }

    void count_distance_w_class(){
        System.out.println("Dystans: "+sqrt( (Math.pow(x2-this.x, 2))+ (Math.pow(y2-this.y, 2))));
    }
    }

