package com.company;

public class main {
    public static void main(String[] args) {
            point pnt = new point(5, 7);

            pnt.count_distance(10, 20);

            point pnt2 = new point(10, 20);

        pnt.count_distance(pnt2.x, pnt2.y);
    }
}
