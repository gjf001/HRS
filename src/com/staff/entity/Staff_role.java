package com.staff.entity;

public class Staff_role {
	private int sr_id;
	private int s_id;
	private int r_id;
	public Staff_role(){
	}
	public Staff_role(int sr_id, int s_id, int r_id){
		this.sr_id=sr_id;
		this.s_id=s_id;
		this.r_id=r_id;
	}
	public void setSr_id(int sr_id){
		this.sr_id=sr_id;
	}
	public int getSr_id(){
		return sr_id;
	}
	public void setS_id(int s_id){
		this.s_id=s_id;
	}
	public int getS_id(){
		return s_id;
	}
	public void setR_id(int r_id){
		this.r_id=r_id;
	}
	public int getR_id(){
		return r_id;
	}
}

