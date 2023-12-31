package com.example.myapplication.Classes;

import java.util.ArrayList;
import java.util.Random;

public class Dishes {
    private String name;
    private int id;
    private String description;
    private float initPrice;
    private String RestaurantName;

    public enum cuisines {
        ITALIAN,
        MEXICAN,
        RUSSIAN
    }

    public enum categories {
        BREAKFAST,
        DINNER,
        LUNCH
    }

    public cuisines cuisineType;
    public categories category;
    private float rating = 0;
    public Dishes(String name, String description, float initPrice, cuisines cuisineType, categories category, String restaurant) {
        this.id = dishGeneratedId(new ArrayList<>(), new Random());
        this.name = name;
        this.description = description;
        this.initPrice = initPrice;
        this.category = category;
        this.cuisineType = cuisineType;
        this.RestaurantName = restaurant;
    }

    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getInitPrice() {
        return initPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private float noOfDishes = 1;
    private float extra = 0;
    public boolean spicy = false;

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

    public float getNoOfDishes() {
        return noOfDishes;
    }

    public void setNoOfDishes(float noOfDishes) {
        this.noOfDishes = noOfDishes;
    }

    public float getExtra() {
        return extra;
    }

    public void setExtra(float extra) {
        this.extra = extra;
    }

    public float getPrice() {
        return noOfDishes * initPrice + extra;
    }

    public void setInitPrice(float initPrice) {
        this.initPrice = initPrice;
    }

    public static int dishGeneratedId(ArrayList<Integer> dishesId, Random random) {
        // Random Id for every dish with range (100 to 250)
        int id = random.nextInt(101) + 150;

        if (dishesId == null) {
            dishesId = new ArrayList<>();
        }

        if (dishesId.contains(id)) {
            return dishGeneratedId(dishesId, random); // Return the result of the recursive call
        }

        dishesId.add(id);
        return id;
    }
}
