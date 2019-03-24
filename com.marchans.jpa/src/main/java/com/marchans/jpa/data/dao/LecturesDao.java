package com.marchans.jpa.data.dao;

import com.marchans.jpa.data.Lecture;

public interface LecturesDao {

Lecture addLecture(Lecture lecture);

Lecture getLecture(int id);

void saveLecture(Lecture lecture);

}
