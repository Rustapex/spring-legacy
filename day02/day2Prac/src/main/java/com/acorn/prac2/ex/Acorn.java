package com.acorn.prac2.ex;

public class Acorn {
	String id;
	String name;

	public Acorn() {
	}

	public Acorn(String id, String name) {
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

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + "]";
	}

}
