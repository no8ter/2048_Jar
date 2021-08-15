package ru.sbt.Game2048;

public class NotEnoughSpace extends Exception {
    public NotEnoughSpace(String message) {
        super(message);
    }
}
