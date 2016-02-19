package com.dev.entity;

public class Image {

	private Long id ;
	private String picname;
	private Double score = 1400d; // 默认1400
	private String version;
	private String piclink; // 图片保存位置
	
	
	public String getPiclink() {
		return piclink;
	}
	public void setPiclink(String piclink) {
		this.piclink = piclink;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPicname() {
		return picname;
	}
	public void setPicname(String picname) {
		this.picname = picname;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
