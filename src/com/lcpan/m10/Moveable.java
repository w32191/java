package com.lcpan.m10;

public interface Moveable {
	default void move(){
        System.out.println("Animal is moving");
    }
	void run();
}
