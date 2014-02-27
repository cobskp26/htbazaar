package pojo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
private Long id;
private String name;

@ManyToMany
//@ManyToMany(mappedBy="students",cascade=CascadeType.ALL) //error
private Collection<Course> courses;


public Collection<Course> getCourses() {
	return courses;
}
public void setCourses(Collection<Course> courses) {
	this.courses = courses;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student(Long id, String name, Collection<Course> courses) {
	super();
	this.id = id;
	this.name = name;
	this.courses = courses;
}

}
