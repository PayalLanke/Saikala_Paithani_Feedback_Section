package com.example.sarifeedbacksection;

public class Feedback {
    private String name;
    private String email;
    private String serviceProductUsed;  // New field
    private String deliveryExperience;
    private String suggestions;
    private float rating;

    // Default constructor
    public Feedback() {
    }

    // Updated constructor without userId and with serviceProductUsed
    public Feedback(String name, String email, String serviceProductUsed, String deliveryExperience, String suggestions, float rating) {
        this.name = name;
        this.email = email;
        this.serviceProductUsed = serviceProductUsed;  // Set the new field
        this.deliveryExperience = deliveryExperience;
        this.suggestions = suggestions;
        this.rating = rating;
    }

    // Getters for all fields
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getServiceProductUsed() {
        return serviceProductUsed;
    }

    public String getDeliveryExperience() {
        return deliveryExperience;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public float getRating() {
        return rating;
    }
}
