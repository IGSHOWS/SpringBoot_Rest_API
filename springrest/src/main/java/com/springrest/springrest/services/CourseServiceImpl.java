package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl()
	{
//		list = new ArrayList<>();
//		list.add(new Course(145,"Java core","this course is very useful."));
//		list.add(new Course(201,"SpringBoot course","Advance level Course"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
		
//		Course c= null;
//		
//		for(Course course:list)
//		{
//			if(course.getId() == courseId)
//			{
//				c = course;
//				break;
//			}
//		}
		
//		return c;
		
		return courseDao.getReferenceById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId())
//			{
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		
		courseDao.save(course);
		
		return course;
	}

	@Override
	public void deleteCourse(Long parseLong) {
		
//		list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
		
		Course entity = courseDao.getReferenceById(parseLong);
		courseDao.delete(entity);
		
	}
}
