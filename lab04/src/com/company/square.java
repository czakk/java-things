package com.company;

public class square {
    int field;
    int circuit;


    square(int a){
        this.field = a;
        this.circuit = a;

    }
    void count_field(){
        System.out.println("Pole: "+ this.field* this.field);
    }

    void count_circuit(){
        System.out.println("Obwód "+this.circuit * 4);
    }

}
