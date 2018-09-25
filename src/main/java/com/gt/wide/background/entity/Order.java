package com.gt.wide.background.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{

	private static final long serialVersionUID = 1932933243631616646L;
	
	private Integer id;//订单编号
	private Integer buyerId;//购物者id
	private Double orderMoney;//订单金额
	private Integer orderStatus;//订单状态
	private Integer logisticsId; //物流单号
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	
	public Order() {
		super();
	}
	public Order(Integer id, Integer buyerId, Double orderMoney, Integer orderStatus, Integer logisticsId,
			Date createTime, Date updateTime, String updatePerson) {
		super();
		setId(id);
		setBuyerId(buyerId);
		setOrderMoney(orderMoney);
		setOrderStatus(orderStatus);
		setLogisticsId(logisticsId);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyerId == null) ? 0 : buyerId.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((logisticsId == null) ? 0 : logisticsId.hashCode());
		result = prime * result + ((orderMoney == null) ? 0 : orderMoney.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((updatePerson == null) ? 0 : updatePerson.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (buyerId == null) {
			if (other.buyerId != null)
				return false;
		} else if (!buyerId.equals(other.buyerId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (logisticsId == null) {
			if (other.logisticsId != null)
				return false;
		} else if (!logisticsId.equals(other.logisticsId))
			return false;
		if (orderMoney == null) {
			if (other.orderMoney != null)
				return false;
		} else if (!orderMoney.equals(other.orderMoney))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (updatePerson == null) {
			if (other.updatePerson != null)
				return false;
		} else if (!updatePerson.equals(other.updatePerson))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", buyerId=" + buyerId + ", orderMoney=" + orderMoney + ", orderStatus="
				+ orderStatus + ", logisticsId=" + logisticsId + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", updatePerson=" + updatePerson + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Double getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(Double orderMoney) {
		this.orderMoney = orderMoney;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Integer getLogisticsId() {
		return logisticsId;
	}
	public void setLogisticsId(Integer logisticsId) {
		this.logisticsId = logisticsId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdatePerson() {
		return updatePerson;
	}
	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson;
	}
}
