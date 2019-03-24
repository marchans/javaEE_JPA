package com.marchans.jpa.data.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.marchans.jpa.data.Lecture;
import com.marchans.jpa.data.dao.LecturesDao;


@Component("worker")
public class LecturesWorker {
@Autowired
LecturesDao lecturesDao;
public Lecture addLecture(Lecture lecture){
lecture = lecturesDao.addLecture(lecture);
System.out.println(lecture);
return lecture;
}
}

