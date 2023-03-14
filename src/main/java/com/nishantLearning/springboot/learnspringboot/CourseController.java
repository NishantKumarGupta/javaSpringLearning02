package com.nishantLearning.springboot.learnspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


/*
    Trying to make a Rest API
    '/course' route
    return Course : id, name, author
    [
        {
            "id" : 1,
            "name" : "Learn AWS",
            "author" : "Nishant the springboot pro"
        }
    ]
 */

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Nishant the sprinboot pro"),
                new Course(2, "Learn DevOps", "Nishant the sprinboot pro"),
                new Course(3, "Learn Azure", "Nishant the sprinboot pro")
        );
    }
}
