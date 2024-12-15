package com.example.myproject;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class User {
        @PrimaryKey(autoGenerate = true)
        private int userId;

        @ColumnInfo(name = "username")
        private String username;

        @ColumnInfo(name = "email")
        private String email;

        @ColumnInfo(name = "password")
        private String password;

        public User(int userId, String username, String email, String password) {
                this.userId = userId;
                this.username = username;
                this.email = email;
                this.password = password;
        }

        // Getters and Setters
        public int getUserId() { return userId; }
        public void setUserId(int userId) { this.userId = userId; }
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
}