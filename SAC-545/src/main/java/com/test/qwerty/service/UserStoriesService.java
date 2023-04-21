package com.test.qwerty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.qwerty.model.UserStories;
import com.test.qwerty.repository.UserStoriesRepository;

@Service
public class UserStoriesService {

    @Autowired
    private UserStoriesRepository userStoriesRepository;

    //method to fetch user stories from Jira API
    public List<UserStories> fetchUserStoriesFromJira(){
        return userStoriesRepository.fetchUserStoriesFromJira();
    }

    //method to display user stories in a readable and organized manner
    public void displayUserStories(){
        userStoriesRepository.displayUserStories();
    }

    //method to display user stories in real-time
    public void displayUserStoriesInRealTime(){
        userStoriesRepository.displayUserStoriesInRealTime();
    }

}