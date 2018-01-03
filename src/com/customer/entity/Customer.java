package com.customer.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * ClassName:Customer 客户实体类
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018	2018年1月3日		下午5:27:32
 *
 * @see 	 
 *
 */
public class Customer {
	//自增id
	private int c_id;
	//客户姓名
	private String c_name;
	//客户年龄
	private int c_age;
	//客户地址
	private String c_address;
	//客户邮箱
	private String c_email;
	//客户联系方式
	private String c_moblie;
	//客户工作
	private String c_work;
	//客户身份证号（成交之后必填）
	private String c_cardid;
	//客户性别
	private String c_sex;
	//客户状态
	private Set<Intention> set=new HashSet<Intention>();
	//对应员工
	private Integer s_id;
	
	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}
	public Set<Intention> getSet() {
		return set;
	}
	public void setSet(Set<Intention> set) {
		this.set = set;
	}
	public Customer(){
	}
	
	public Customer(int c_id, String c_name, int c_age, String c_address,
			String c_email, String c_moblie, String c_work, String c_cardid,
			String c_sex, Set<Intention> set, Integer s_id) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_age = c_age;
		this.c_address = c_address;
		this.c_email = c_email;
		this.c_moblie = c_moblie;
		this.c_work = c_work;
		this.c_cardid = c_cardid;
		this.c_sex = c_sex;
		this.set = set;
		this.s_id = s_id;
	}
	public void setC_id(int c_id){
		this.c_id=c_id;
	}
	public int getC_id(){
		return c_id;
	}
	public void setC_name(String c_name){
		this.c_name=c_name;
	}
	public String getC_name(){
		return c_name;
	}
	public void setC_age(int c_age){
		this.c_age=c_age;
	}
	public int getC_age(){
		return c_age;
	}
	public void setC_address(String c_address){
		this.c_address=c_address;
	}
	public String getC_address(){
		return c_address;
	}
	public void setC_email(String c_email){
		this.c_email=c_email;
	}
	public String getC_email(){
		return c_email;
	}
	public void setC_moblie(String c_moblie){
		this.c_moblie=c_moblie;
	}
	public String getC_moblie(){
		return c_moblie;
	}
	public void setC_work(String c_work){
		this.c_work=c_work;
	}
	public String getC_work(){
		return c_work;
	}
	public void setC_cardid(String c_cardid){
		this.c_cardid=c_cardid;
	}
	public String getC_cardid(){
		return c_cardid;
	}
	public void setC_sex(String c_sex){
		this.c_sex=c_sex;
	}
	public String getC_sex(){
		return c_sex;
	}
}

