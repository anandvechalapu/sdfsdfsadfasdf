package com.test.qwerty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.qwerty.model.UserStories;

@Repository
public interface UserStoriesRepository extends JpaRepository<UserStories, Long> {

    //method to fetch user stories from Jira API
    List<UserStories> fetchUserStoriesFromJira();

    //method to display user stories in a readable and organized manner
    void displayUserStories();

    //method to display user stories in real-time
    void displayUserStoriesInRealTime();

}