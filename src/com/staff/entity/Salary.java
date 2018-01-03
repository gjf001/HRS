package com.staff.entity;

public class Salary {
	private int sa_id;
	private int s_id;
	private String base_pay;
	private String pfmc_pay;
	private String check_pay;
	private String ought_pay;
	private String reality_pay;
	public Salary(){
	}
	public Salary(int sa_id, int s_id, String base_pay, String pfmc_pay, String check_pay, String ought_pay, String reality_pay){
		this.sa_id=sa_id;
		this.s_id=s_id;
		this.base_pay=base_pay;
		this.pfmc_pay=pfmc_pay;
		this.check_pay=check_pay;
		this.ought_pay=ought_pay;
		this.reality_pay=reality_pay;
	}
	public void setSa_id(int sa_id){
		this.sa_id=sa_id;
	}
	public int getSa_id(){
		return sa_id;
	}
	public void setS_id(int s_id){
		this.s_id=s_id;
	}
	public int getS_id(){
		return s_id;
	}
	public void setBase_pay(String base_pay){
		this.base_pay=base_pay;
	}
	public String getBase_pay(){
		return base_pay;
	}
	public void setPfmc_pay(String pfmc_pay){
		this.pfmc_pay=pfmc_pay;
	}
	public String getPfmc_pay(){
		return pfmc_pay;
	}
	public void setCheck_pay(String check_pay){
		this.check_pay=check_pay;
	}
	public String getCheck_pay(){
		return check_pay;
	}
	public void setOught_pay(String ought_pay){
		this.ought_pay=ought_pay;
	}
	public String getOught_pay(){
		return ought_pay;
	}
	public void setReality_pay(String reality_pay){
		this.reality_pay=reality_pay;
	}
	public String getReality_pay(){
		return reality_pay;
	}
}

