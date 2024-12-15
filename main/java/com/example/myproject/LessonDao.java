package com.example.myproject;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LessonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertLesson(Lesson lesson);

    @Query("SELECT * FROM Lesson WHERE courseId = :courseId")
    List<Lesson> getLessonsByCourse(int courseId);
}
