package com.example.myproject;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import android.app.Application;

import java.util.List;

public class CourseHubViewModel extends AndroidViewModel {
    private CourseHubRepository repository;

    public CourseHubViewModel(Application application) {
        super(application);
        repository = new CourseHubRepository(application);
    }

    public void registerUser(User user) {
        repository.registerUser(user);
    }

    public LiveData<User> login(String email, String password) {
        MutableLiveData<User> result = new MutableLiveData<>();
        new Thread(() -> result.postValue(repository.login(email, password))).start();
        return result;
    }

    public LiveData<List<Course>> getAllCourses() {
        MutableLiveData<List<Course>> courses = new MutableLiveData<>();
        new Thread(() -> courses.postValue(repository.getAllCourses())).start();
        return courses;
    }
}
