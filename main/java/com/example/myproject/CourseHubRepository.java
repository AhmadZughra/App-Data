package com.example.myproject;

import android.app.Application;

import java.util.List;

public class CourseHubRepository {
    private UserDao userDao;
    private CourseDao courseDao;
    private LessonDao lessonDao;

    public CourseHubRepository(Application application) {
        AppDatabase db = AppDatabase.getInstance(application);
        userDao = db.userDao();
        courseDao = db.courseDao();
        lessonDao = db.lessonDao();
    }

    public void registerUser(User user) {
        new Thread(() -> userDao.insertUser(user)).start();
    }

    public User login(String email, String password) {
        return userDao.login(email, password);
    }

    public void addCourse(Course course) {
        new Thread(() -> courseDao.insertCourse(course)).start();
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }

    public void addLesson(Lesson lesson) {
        new Thread(() -> lessonDao.insertLesson(lesson)).start();
    }

    public List<Lesson> getLessonsByCourse(int courseId) {
        return lessonDao.getLessonsByCourse(courseId);
    }
}

