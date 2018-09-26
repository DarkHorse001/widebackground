package com.gt.wide.background.bean;

import java.io.Serializable;
import java.util.Date;

public class OrderInfo implements Serializable {

	private static final long serialVersionUID = 4295370033536337036L;
	
	private Integer orderInfoId;//商品详情表
	private Integer orderId;//订单号
	private String goodName;//商品名称
	private Integer brandId;//品牌id
	private Integer kindId;//种类id
	private Boolean quality;//是否精品
	private Boolean promotion;//是否促销
	private Boolean goodNew;//是否新品
	private Double promotionPrice;//促销价格
	private Double goodPrice;//商品价格
	private String goodDetail; //商品详情
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	
	
	public OrderInfo() {
		super();
	}
	public OrderInfo(Integer orderInfoId, Integer orderId, String goodName, Integer brandId, Integer kindId,
			Boolean quality, Boolean promotion, Boolean goodNew, Double promotionPrice, Double goodPrice,
			String goodDetail, Date createTime, Date updateTime, String updatePerson) {
		super();
		setOrderInfoId(orderInfoId);
		setOrderId(orderId);
		setGoodName(goodName);
		setBrandId(brandId);
		setKindId(kindId);
		setQuality(quality);
		setPromotion(promotion);
		setGoodNew(goodNew);
		setPromotionPrice(promotionPrice);
		setGoodPrice(goodPrice);
		setGoodDetail(goodDetail);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((goodDetail == null) ? 0 : goodDetail.hashCode());
		result = prime * result + ((goodName == null) ? 0 : goodName.hashCode());
		result = prime * result + ((goodNew == null) ? 0 : goodNew.hashCode());
		result = prime * result + ((goodPrice == null) ? 0 : goodPrice.hashCode());
		result = prime * result + ((kindId == null) ? 0 : kindId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderInfoId == null) ? 0 : orderInfoId.hashCode());
		result = prime * result + ((promotion == null) ? 0 : promotion.hashCode());
		result = prime * result + ((promotionPrice == null) ? 0 : promotionPrice.hashCode());
		result = prime * result + ((quality == null) ? 0 : quality.hashCode());
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
		OrderInfo other = (OrderInfo) obj;
		if (brandId == null) {
			if (other.brandId != null)
				return false;
		} else if (!brandId.equals(other.brandId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (goodDetail == null) {
			if (other.goodDetail != null)
				return false;
		} else if (!goodDetail.equals(other.goodDetail))
			return false;
		if (goodName == null) {
			if (other.goodName != null)
				return false;
		} else if (!goodName.equals(other.goodName))
			return false;
		if (goodNew == null) {
			if (other.goodNew != null)
				return false;
		} else if (!goodNew.equals(other.goodNew))
			return false;
		if (goodPrice == null) {
			if (other.goodPrice != null)
				return false;
		} else if (!goodPrice.equals(other.goodPrice))
			return false;
		if (kindId == null) {
			if (other.kindId != null)
				return false;
		} else if (!kindId.equals(other.kindId))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderInfoId == null) {
			if (other.orderInfoId != null)
				return false;
		} else if (!orderInfoId.equals(other.orderInfoId))
			return false;
		if (promotion == null) {
			if (other.promotion != null)
				return false;
		} else if (!promotion.equals(other.promotion))
			return false;
		if (promotionPrice == null) {
			if (other.promotionPrice != null)
				return false;
		} else if (!promotionPrice.equals(other.promotionPrice))
			return false;
		if (quality == null) {
			if (other.quality != null)
				return false;
		} else if (!quality.equals(other.quality))
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
		return "OrderInfo [orderInfoId=" + orderInfoId + ", orderId=" + orderId + ", goodName=" + goodName
				+ ", brandId=" + brandId + ", kindId=" + kindId + ", quality=" + quality + ", promotion=" + promotion
				+ ", goodNew=" + goodNew + ", promotionPrice=" + promotionPrice + ", goodPrice=" + goodPrice
				+ ", goodDetail=" + goodDetail + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", updatePerson=" + updatePerson + "]";
	}
	public Integer getOrderInfoId() {
		return orderInfoId;
	}
	public void setOrderInfoId(Integer orderInfoId) {
		this.orderInfoId = orderInfoId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getKindId() {
		return kindId;
	}
	public void setKindId(Integer kindId) {
		this.kindId = kindId;
	}
	public Boolean getQuality() {
		return quality;
	}
	public void setQuality(Boolean quality) {
		this.quality = quality;
	}
	public Boolean getPromotion() {
		return promotion;
	}
	public void setPromotion(Boolean promotion) {
		this.promotion = promotion;
	}
	public Boolean getGoodNew() {
		return goodNew;
	}
	public void setGoodNew(Boolean goodNew) {
		this.goodNew = goodNew;
	}
	public Double getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(Double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public Double getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(Double goodPrice) {
		this.goodPrice = goodPrice;
	}
	public String getGoodDetail() {
		return goodDetail;
	}
	public void setGoodDetail(String goodDetail) {
		this.goodDetail = goodDetail;
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
