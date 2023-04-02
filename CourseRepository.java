package org.jspiders.springbootcourseapi.repository;

import org.jspiders.springbootcourseapi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
