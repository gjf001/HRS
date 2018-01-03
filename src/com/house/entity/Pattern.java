package com.house.entity;
/**
 * 
 * ClassName:Pattern  房屋格局
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   wzx
 * @version  
 * @since    Ver 1.1
 * @Date	 2018	2018年1月3日		下午5:58:30
 *
 * @see 	 
 *
 */
public class Pattern {
	//房屋格局id
	private int p_id;
	//房屋格局内容
	private String p_name;
	public Pattern(){
	}
	public Pattern(int p_id, String p_name){
		this.p_id=p_id;
		this.p_name=p_name;
	}
	public void setP_id(int p_id){
		this.p_id=p_id;
	}
	public int getP_id(){
		return p_id;
	}
	public void setP_name(String p_name){
		this.p_name=p_name;
	}
	public String getP_name(){
		return p_name;
	}
}

