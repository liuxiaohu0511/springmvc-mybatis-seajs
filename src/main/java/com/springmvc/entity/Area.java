package com.springmvc.entity;

import java.io.Serializable;

public class Area implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * primary key
	 */
	private int id;
	/**
	 * area name
	 */
	private String area;
	/**
	 * parent id
	 */
	private int pid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Area() {

	}

	public Area(int id, String area, int pid) {
		this.id = id;
		this.area = area;
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + ", area=" + area + ", pid=" + pid + "]";
	}

}
