package com.staff.entity;
public class Checks {
	private int ch_id;
	private int s_id;
	private int d_id;
	private String belate;
	private String leaveearly;
	private String absenteeism;
	public Checks(){
	}
	public Checks(int ch_id, int s_id, int d_id, String belate, String leaveearly, String absenteeism){
		this.ch_id=ch_id;
		this.s_id=s_id;
		this.d_id=d_id;
		this.belate=belate;
		this.leaveearly=leaveearly;
		this.absenteeism=absenteeism;
	}
	public void setCh_id(int ch_id){
		this.ch_id=ch_id;
	}
	public int getCh_id(){
		return ch_id;
	}
	public void setS_id(int s_id){
		this.s_id=s_id;
	}
	public int getS_id(){
		return s_id;
	}
	public void setD_id(int d_id){
		this.d_id=d_id;
	}
	public int getD_id(){
		return d_id;
	}
	public void setBelate(String belate){
		this.belate=belate;
	}
	public String getBelate(){
		return belate;
	}
	public void setLeaveearly(String leaveearly){
		this.leaveearly=leaveearly;
	}
	public String getLeaveearly(){
		return leaveearly;
	}
	public void setAbsenteeism(String absenteeism){
		this.absenteeism=absenteeism;
	}
	public String getAbsenteeism(){
		return absenteeism;
	}
}

