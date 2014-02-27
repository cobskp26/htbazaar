package model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
@Id
	private Long id;
private String name;

@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
private Collection<Employee> employees;

public Collection<Employee> getEmployees() {
	return employees;
}

public void setEmployees(Collection<Employee> employees) {
	this.employees = employees;
}

public Department(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Department() {
	// TODO Auto-generated constructor stub
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


}
