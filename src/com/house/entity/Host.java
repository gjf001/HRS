package com.house.entity;
/**
 * 
 * ClassName:Host 户主信息
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   wzx
 * @version  
 * @since    Ver 1.1
 * @Date	 2018	2018年1月3日		下午5:58:07
 *
 * @see 	 
 *
 */

public class Host {
	//户主id
	private int ho_id;
	//户主姓名
	private String ho_name;
	//户主年龄
	private int ho_age;
	//户主现住址
	private String ho_address;
	//户主e_mail
	private String ho_email;
	//户主工作
	private String ho_work;
	//户主身份证号
	private String ho_cardid;
	//户主联系方式
	private String ho_mobile;
	public Host(){
	}
	public Host(int ho_id, String ho_name, int ho_age, String ho_address, String ho_email, String ho_work, String ho_cardid, String ho_mobile){
		this.ho_id=ho_id;
		this.ho_name=ho_name;
		this.ho_age=ho_age;
		this.ho_address=ho_address;
		this.ho_email=ho_email;
		this.ho_work=ho_work;
		this.ho_cardid=ho_cardid;
		this.ho_mobile=ho_mobile;
	}
	public void setHo_id(int ho_id){
		this.ho_id=ho_id;
	}
	public int getHo_id(){
		return ho_id;
	}
	public void setHo_name(String ho_name){
		this.ho_name=ho_name;
	}
	public String getHo_name(){
		return ho_name;
	}
	public void setHo_age(int ho_age){
		this.ho_age=ho_age;
	}
	public int getHo_age(){
		return ho_age;
	}
	public void setHo_address(String ho_address){
		this.ho_address=ho_address;
	}
	public String getHo_address(){
		return ho_address;
	}
	public void setHo_email(String ho_email){
		this.ho_email=ho_email;
	}
	public String getHo_email(){
		return ho_email;
	}
	public void setHo_work(String ho_work){
		this.ho_work=ho_work;
	}
	public String getHo_work(){
		return ho_work;
	}
	public void setHo_cardid(String ho_cardid){
		this.ho_cardid=ho_cardid;
	}
	public String getHo_cardid(){
		return ho_cardid;
	}
	public void setHo_mobile(String ho_mobile){
		this.ho_mobile=ho_mobile;
	}
	public String getHo_mobile(){
		return ho_mobile;
	}
}

