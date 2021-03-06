package com.myapplicationdev.android.taskmanager;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Task implements Serializable {

    private int id;
    private String taskName;
    private String description;

    public Task(int id, String taskName, String desc){
        this.id = id;
        this.taskName = taskName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDesc() {
        return description;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + taskName + ", " + description;
    }
}
