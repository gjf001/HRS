package com.customer.entity;
/**
 * 
 * ClassName:Intention 客户状态
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018	2018年1月3日		下午5:34:04
 *
 * @see 	 
 *
 */
public class Intention {
	//自增id
	private int i_id;
	//状态名称
	private String i_name;
	public Intention(){
	}
	public Intention(int i_id, String i_name){
		this.i_id=i_id;
		this.i_name=i_name;
	}
	public void setI_id(int i_id){
		this.i_id=i_id;
	}
	public int getI_id(){
		return i_id;
	}
	public void setI_name(String i_name){
		this.i_name=i_name;
	}
	public String getI_name(){
		return i_name;
	}
}

