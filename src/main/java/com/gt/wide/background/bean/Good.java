package com.gt.wide.background.bean;

import java.io.Serializable;
import java.util.Date;

public class Good  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id; //商品id
	private String name; //商品名称
	private Integer directoryId; //商品目录id
	private Integer brandId; //商品品牌id
	private Integer kindId; //商品种类id
	private boolean quality; //是否精品
	private boolean promation; //是否促销
	private boolean goodNew; //是否新品
	private Double price; //价格
	private Double promotionPrice;//促销价格
	private Integer count; //库存
	private Integer sales; //已售数量
	private String picture;//第一张图片位置
	private boolean flag; //删除标记
	private Date createTime; //创建时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	
	public Good() {
		super();
	}
	public Good(Integer id, String name, Integer directoryId, Integer brandId, Integer kindId, boolean quality,
			boolean promation, boolean goodNew, Double price, Double promotionPrice, Integer count, Integer sales,
			String picture, boolean flag, Date createTime, Date updateTime, String updatePerson) {
		super();
		setId(id);
		setName(name);
		setDirectoryId(directoryId);
		setBrandId(brandId);
		setKindId(kindId);
		setQuality(quality);
		setPromation(promation);
		setGoodNew(goodNew);
		setPrice(price);
		setPromotionPrice(promotionPrice);
		setCount(count);
		setSales(sales);
		setPicture(picture);
		setFlag(flag);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((directoryId == null) ? 0 : directoryId.hashCode());
		result = prime * result + (flag ? 1231 : 1237);
		result = prime * result + (goodNew ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kindId == null) ? 0 : kindId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + (promation ? 1231 : 1237);
		result = prime * result + ((promotionPrice == null) ? 0 : promotionPrice.hashCode());
		result = prime * result + (quality ? 1231 : 1237);
		result = prime * result + ((sales == null) ? 0 : sales.hashCode());
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
		Good other = (Good) obj;
		if (brandId == null) {
			if (other.brandId != null)
				return false;
		} else if (!brandId.equals(other.brandId))
			return false;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (directoryId == null) {
			if (other.directoryId != null)
				return false;
		} else if (!directoryId.equals(other.directoryId))
			return false;
		if (flag != other.flag)
			return false;
		if (goodNew != other.goodNew)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (kindId == null) {
			if (other.kindId != null)
				return false;
		} else if (!kindId.equals(other.kindId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (promation != other.promation)
			return false;
		if (promotionPrice == null) {
			if (other.promotionPrice != null)
				return false;
		} else if (!promotionPrice.equals(other.promotionPrice))
			return false;
		if (quality != other.quality)
			return false;
		if (sales == null) {
			if (other.sales != null)
				return false;
		} else if (!sales.equals(other.sales))
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
		return "Good [id=" + id + ", name=" + name + ", directoryId=" + directoryId + ", brandId=" + brandId
				+ ", kindId=" + kindId + ", quality=" + quality + ", promation=" + promation + ", goodNew=" + goodNew
				+ ", price=" + price + ", promotionPrice=" + promotionPrice + ", count=" + count + ", sales=" + sales
				+ ", picture=" + picture + ", flag=" + flag + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", updatePerson=" + updatePerson + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDirectoryId() {
		return directoryId;
	}
	public void setDirectoryId(Integer directoryId) {
		this.directoryId = directoryId;
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
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	public boolean isPromation() {
		return promation;
	}
	public void setPromation(boolean promation) {
		this.promation = promation;
	}
	public boolean isGoodNew() {
		return goodNew;
	}
	public void setGoodNew(boolean goodNew) {
		this.goodNew = goodNew;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(Double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
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
