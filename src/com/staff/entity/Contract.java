package com.staff.entity;

public class Contract {
	private int co_id;
	private String co_uuid;
	private String co_content;
	private int h_id;
	private int s_id;
	private int c_id;
	private String c_cad;
	private String c_ced;
	public Contract(){
	}
	public Contract(int co_id, String co_uuid, String co_content, int h_id, int s_id, int c_id, String c_cad, String c_ced){
		this.co_id=co_id;
		this.co_uuid=co_uuid;
		this.co_content=co_content;
		this.h_id=h_id;
		this.s_id=s_id;
		this.c_id=c_id;
		this.c_cad=c_cad;
		this.c_ced=c_ced;
	}
	public void setCo_id(int co_id){
		this.co_id=co_id;
	}
	public int getCo_id(){
		return co_id;
	}
	public void setCo_uuid(String co_uuid){
		this.co_uuid=co_uuid;
	}
	public String getCo_uuid(){
		return co_uuid;
	}
	public void setCo_content(String co_content){
		this.co_content=co_content;
	}
	public String getCo_content(){
		return co_content;
	}
	public void setH_id(int h_id){
		this.h_id=h_id;
	}
	public int getH_id(){
		return h_id;
	}
	public void setS_id(int s_id){
		this.s_id=s_id;
	}
	public int getS_id(){
		return s_id;
	}
	public void setC_id(int c_id){
		this.c_id=c_id;
	}
	public int getC_id(){
		return c_id;
	}
	public void setC_cad(String c_cad){
		this.c_cad=c_cad;
	}
	public String getC_cad(){
		return c_cad;
	}
	public void setC_ced(String c_ced){
		this.c_ced=c_ced;
	}
	public String getC_ced(){
		return c_ced;
	}
}

