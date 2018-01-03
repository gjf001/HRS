package com.house.entity;
/**
 * 
 * ClassName:Characters 房屋性质
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   wzx
 * @version  
 * @since    Ver 1.1
 * @Date	 2018	2018年1月3日		下午5:57:44
 *
 * @see 	 
 *
 */
public class Characters {
	//房屋性质id
	private int ch_id;
	//房屋性质内容
	private String ch_name;
	public Characters(){
	}
	public Characters(int ch_id, String ch_name){
		this.ch_id=ch_id;
		this.ch_name=ch_name;
	}
	public void setCh_id(int ch_id){
		this.ch_id=ch_id;
	}
	public int getCh_id(){
		return ch_id;
	}
	public void setCh_name(String ch_name){
		this.ch_name=ch_name;
	}
	public String getCh_name(){
		return ch_name;
	}
}

