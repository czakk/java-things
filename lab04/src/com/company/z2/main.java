package com.company.z2;

public class main {
    public static void main(String[] args) {
         point pnt = new point(5, 7);

        pnt.count_distance(10, 20);

        point point2 = new point(5, 7);
        point2.x2 = 13;
        point2.y2 = 8;

        point2.count_distance_w_class();
    }
}
