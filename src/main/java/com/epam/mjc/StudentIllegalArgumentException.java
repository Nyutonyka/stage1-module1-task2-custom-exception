package com.epam.mjc;

public class StudentIllegalArgumentException extends IllegalArgumentException{
    public StudentIllegalArgumentException (long id) {
        super("Could not find student with ID " + id);
    }
}
