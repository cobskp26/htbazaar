package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PC {
@Id
	private Long id;
private String name;

@OneToOne
@JoinColumn(name="empid",unique=true)
private Employee emp;

public Employee getEmp() {
	return emp;
}

public void setEmp(Employee emp) {
	this.emp = emp;
}

public PC(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public PC() {
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
