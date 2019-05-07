package com.liandi.ems04.entity.train;

import org.springframework.stereotype.Component;

@Component
public class Train {
   int trainId;
   int sid;
   String num;
   String date;
   String info;
   String name;
   String checkIn;
   int result;
   public Train() {
	   super();
   }
   public Train(String num, String date,String info) {
	   this.num=num;
	   this.date=date;
	   this.info=info;
   }
   public Train(int sid, String name,String checkIn,int result) {
	   this.sid=sid;
	   this.name=name;
	   this.checkIn=checkIn;
	   this.result=result;
   }
public int getTrainId() {
	return trainId;
}
public void setTrainId(int trainId) {
	this.trainId = trainId;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getcheckIn() {
	return checkIn;
}
public void setCheck_in(String checkIn) {
	this.checkIn =checkIn;
}
public int getResult() {
	return result;
}
public void setResult(int result) {
	this.result = result;
}
}
