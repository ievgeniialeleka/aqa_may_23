package com.hillel.lesson_15;

import java.io.IOException;

public class WrongLoginException extends IOException {
    private String input;

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException(String message, String input) {
        super(message);
        this.input = input;
    }

    public String toString() {
        return this.getMessage() + " You entered: " + this.input;
    }
}
