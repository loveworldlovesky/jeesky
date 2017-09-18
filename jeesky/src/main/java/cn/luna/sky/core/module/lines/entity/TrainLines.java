package cn.luna.sky.core.module.lines.entity;

import java.math.BigDecimal;

public class TrainLines {
	private int lockVersion;
	private String id;
	private String trainNum;//车次
	private String trainStartTime;//发车时间
	private String trainEndTime;//到达时间
	private String trainStartStation;//发站
	private String trainEndStation;//到站
	private BigDecimal ticketsPrice;//票价
	private int ticketsLeft;//余票
	
	public int getLockVersion() {
		return lockVersion;
	}
	public void setLockVersion(int lockVersion) {
		this.lockVersion = lockVersion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getTrainStartTime() {
		return trainStartTime;
	}
	public void setTrainStartTime(String trainStartTime) {
		this.trainStartTime = trainStartTime;
	}
	public String getTrainStartStation() {
		return trainStartStation;
	}
	public void setTrainStartStation(String trainStartStation) {
		this.trainStartStation = trainStartStation;
	}
	public String getTrainEndStation() {
		return trainEndStation;
	}
	public void setTrainEndStation(String trainEndStation) {
		this.trainEndStation = trainEndStation;
	}
	public BigDecimal getTicketsPrice() {
		return ticketsPrice;
	}
	public void setTicketsPrice(BigDecimal ticketsPrice) {
		this.ticketsPrice = ticketsPrice;
	}
	public int getTicketsLeft() {
		return ticketsLeft;
	}
	public void setTicketsLeft(int ticketsLeft) {
		this.ticketsLeft = ticketsLeft;
	}
	public String getTrainEndTime() {
		return trainEndTime;
	}
	public void setTrainEndTime(String trainEndTime) {
		this.trainEndTime = trainEndTime;
	}
	
}
