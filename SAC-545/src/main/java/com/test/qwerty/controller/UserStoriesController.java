package com.test.qwerty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.qwerty.model.UserStories;
import com.test.qwerty.service.UserStoriesService;

@RestController
public class UserStoriesController {

    @Autowired
    private UserStoriesService userStoriesService;

    @GetMapping("/userstories")
    public List<UserStories> fetchUserStoriesFromJira() {
        return userStoriesService.fetchUserStoriesFromJira();
    }

    @GetMapping("/userstories/display")
    public void displayUserStories() {
        userStoriesService.displayUserStories();
    }

    @GetMapping("/userstories/realtime")
    public void displayUserStoriesInRealTime() {
        userStoriesService.displayUserStoriesInRealTime();
    }
}