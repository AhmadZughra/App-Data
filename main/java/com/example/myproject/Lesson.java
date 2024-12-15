package com.example.myproject;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(
        entity = Course.class,
        parentColumns = "courseId",
        childColumns = "courseId",
        onDelete = ForeignKey.CASCADE
))
public class Lesson {
    @PrimaryKey(autoGenerate = true)
    private int lessonId;

    @ColumnInfo(name = "courseId")
    private int courseId;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "content")
    private String content;


    public Lesson(int lessonId, int courseId, String title, String content) {
        this.lessonId = lessonId;
        this.courseId = courseId;
        this.title = title;
        this.content = content;
    }

    // Getters and Setters
    public int getLessonId() { return lessonId; }
    public void setLessonId(int lessonId) { this.lessonId = lessonId; }
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
