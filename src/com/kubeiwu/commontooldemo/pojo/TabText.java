package com.kubeiwu.commontooldemo.pojo;

import android.provider.BaseColumns;

import com.kubeiwu.commontool.db.utils.A.Property;

public class TabText {
	public TabText() {
		super();
	}

	public TabText(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Property(column = BaseColumns._ID)
	private int id;
	private int age;
	@Property(unique = true)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
