package edu.fpt.spring.model;

public class Permission {

	private String id;
	private String name;

	public Permission() {
		// TODO Auto-generated constructor stub
	}

	public Permission(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
