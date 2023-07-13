package com.hillel.lesson_15;

import java.io.IOException;

public class WrongPasswordException extends IOException {
    private String input;

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(String message, String input) {
        super(message);
        this.input = input;
    }

    public String toString() {
        return this.getMessage();
    }
}
