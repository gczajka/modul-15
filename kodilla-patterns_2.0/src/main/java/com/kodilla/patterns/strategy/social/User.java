package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return publisher.share();
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
