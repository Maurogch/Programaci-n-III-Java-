package com.company;

public class NotExistException extends Exception{

    public NotExistException(){}

    public NotExistException(String message) {
        super(message);
    }
}
