package pojo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private Long id;
	private String name;
	
	@ManyToMany(mappedBy="courses",cascade=CascadeType.ALL)
	private Collection<Student> students;
	
	public Collection<Student> getStudents() {
		return students;
	}
	public void setStudents(Collection<Student> students) {
		this.students = students;
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
	public Course(Long id, String name, Collection<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}
	
}
