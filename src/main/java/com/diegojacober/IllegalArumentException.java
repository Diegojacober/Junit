package com.diegojacober;

public class IllegalArumentException extends Exception{
    IllegalArumentException() {
        super("Number grade cannot lower than 0");
    }
}
