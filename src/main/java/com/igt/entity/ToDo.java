package com.igt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class ToDo {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private Boolean complete;

	public ToDo() {

	}

	public ToDo(String title, boolean complete) {
		this.title = title;
		this.complete = complete;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return this.title + "|" + this.complete;
	}
}
