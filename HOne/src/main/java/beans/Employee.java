package beans;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Employee {

@Id
	private Long id;

	private String name;
	
	//@OneToOne(cascade=CascadeType.ALL)
	@OneToOne
	@JoinColumn(name="pcid",unique=true)
	private PC pc;
	

	public Employee(Long id, String name, PC pc) {
		super();
		this.id = id;
		this.name = name;
		this.pc = pc;
	}

	public PC getPc() {
		return pc;
	}
	
	public void setPc(PC pc) {
		this.pc = pc;
	}
	
	public Employee(Long id, String name) {
		this.id=id;
		this.name=name;
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
