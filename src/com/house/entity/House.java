package com.house.entity;
/**
 * 
 * ClassName:House  房源
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   wzx
 * @version  
 * @since    Ver 1.1
 * @Date	 2018	2018年1月3日		下午5:58:19
 *
 * @see 	 
 *
 */
public class House {
	//房源id
	private int h_id;
	//房源面积
	private String h_area;
	//房源格局id
	private int p_id;
	//格局
	private Pattern pattern;
	//房源性质id
	private int ch_id;
	//性质
	private Characters characters;
	//房源年代
	private String h_year;
	//房源类型id
	private int t_id;
	//类型
	private Type type;
	//房源价格
	private String h_price;
	//户主信息id
	private int ho_id;
	//户主信息
	private Host host;
	//房源照片
	private String h_photo;
	//房源区域
	private String h_district;
	//房源街道
	private String h_address;
	
	public House(){
	}
	public House(int h_id, String h_area, int p_id, int ch_id, String h_year, int t_id, String h_price, int ho_id, String h_photo, String h_district, String h_address){
		this.h_id=h_id;
		this.h_area=h_area;
		this.p_id=p_id;
		this.ch_id=ch_id;
		this.h_year=h_year;
		this.t_id=t_id;
		this.h_price=h_price;
		this.ho_id=ho_id;
		this.h_photo=h_photo;
		this.h_district=h_district;
		this.h_address=h_address;
	}
	public void setH_id(int h_id){
		this.h_id=h_id;
	}
	public int getH_id(){
		return h_id;
	}
	public void setH_area(String h_area){
		this.h_area=h_area;
	}
	public String getH_area(){
		return h_area;
	}
	public void setP_id(int p_id){
		this.p_id=p_id;
	}
	public int getP_id(){
		return p_id;
	}
	public void setCh_id(int ch_id){
		this.ch_id=ch_id;
	}
	public int getCh_id(){
		return ch_id;
	}
	public void setH_year(String h_year){
		this.h_year=h_year;
	}
	public String getH_year(){
		return h_year;
	}
	public void setT_id(int t_id){
		this.t_id=t_id;
	}
	public int getT_id(){
		return t_id;
	}
	public void setH_price(String h_price){
		this.h_price=h_price;
	}
	public String getH_price(){
		return h_price;
	}
	public void setHo_id(int ho_id){
		this.ho_id=ho_id;
	}
	public int getHo_id(){
		return ho_id;
	}
	public void setH_photo(String h_photo){
		this.h_photo=h_photo;
	}
	public String getH_photo(){
		return h_photo;
	}
	public void setH_district(String h_district){
		this.h_district=h_district;
	}
	public String getH_district(){
		return h_district;
	}
	public void setH_address(String h_address){
		this.h_address=h_address;
	}
	public String getH_address(){
		return h_address;
	}
	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	public Characters getCharacters() {
		return characters;
	}
	public void setCharacters(Characters characters) {
		this.characters = characters;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	
}

