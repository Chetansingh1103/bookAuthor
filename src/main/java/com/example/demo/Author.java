package com.example.demo;

public class Author {

    private String name;
    private int age;
    private String gender;
    private double rating;

    public Author(String name, int age, String gender, double rating) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
