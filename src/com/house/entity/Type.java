package com.house.entity;
/**
 * 
 * ClassName:Type  房屋格局
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   wzx
 * @version  
 * @since    Ver 1.1
 * @Date	 2018	2018年1月3日		下午5:58:39
 *
 * @see 	 
 *
 */
public class Type {
	//房屋类型id
	private int t_id;
	//总层数
	private String t_count;
	//朝向
	private String t_face;
	//第几层
	private String t_floor;
	public Type(){
	}
	public Type(int t_id, String t_count, String t_face, String t_floor){
		this.t_id=t_id;
		this.t_count=t_count;
		this.t_face=t_face;
		this.t_floor=t_floor;
	}
	public void setT_id(int t_id){
		this.t_id=t_id;
	}
	public int getT_id(){
		return t_id;
	}
	public void setT_count(String t_count){
		this.t_count=t_count;
	}
	public String getT_count(){
		return t_count;
	}
	public void setT_face(String t_face){
		this.t_face=t_face;
	}
	public String getT_face(){
		return t_face;
	}
	public void setT_floor(String t_floor){
		this.t_floor=t_floor;
	}
	public String getT_floor(){
		return t_floor;
	}
}

