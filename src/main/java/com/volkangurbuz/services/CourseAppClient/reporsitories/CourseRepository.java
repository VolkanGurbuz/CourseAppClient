package com.volkangurbuz.services.CourseAppClient.reporsitories;

import com.volkangurbuz.services.CourseAppClient.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CourseRepository  extends JpaRepository<Course, BigInteger> {
}
