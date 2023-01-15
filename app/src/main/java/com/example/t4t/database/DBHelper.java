package com.example.t4t.database;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBHelper {
    public static DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

    private static final String TAG = "DBHelper";

    public static void CreateStudent(Student stu) {
        mDatabase.child("students").child(stu.getEmail()).setValue(stu);
    }

    public static void CreateEvent(Event event) {
        mDatabase.child("events").child(event.getName()).setValue(event);
    }

    public static void CreateGroup(Group group) {
        mDatabase.child("groups").child(group.getName()).setValue(group);
    }
}
