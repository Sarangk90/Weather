package com.innovect.innovectassignment.model;

public class City {
    private long id;
    private String name;
    private String country;
    private Coordinates coordinates;

    private class Coordinates {
        private double lat;
        private double lon;
    }
}