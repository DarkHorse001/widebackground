package com.gt.wide.background.bean;

import java.io.Serializable;

public class GoodList implements Serializable{

	private static final long serialVersionUID = 1128249237947887011L;
	
	private Integer id; //商品id
	private String name; //商品名称
	private Integer directoryId; //商品目录id
	private String dname; //目录名称
	private Integer brandId; //商品品牌id
	private String brandName; //品牌名称
	private Integer kindId; //商品种类id
	private String kindName; //种类名称
	private boolean quality; //是否精品
	private boolean promation; //是否促销
	private boolean goodNew; //是否新品
	private Double price; //价格
	private Double promotionPrice;//促销价格
	private Integer count; //库存
	private Integer sales; //已售数量
	private String picture;//第一张图片位置
	
	
	
	public GoodList() {
		super();
	}
	
	public GoodList(Integer id, String name, Integer directoryId, String dname, Integer brandId, String brandName,
			Integer kindId, String kindName, boolean quality, boolean promation, boolean goodNew, Double price,
			Double promotionPrice, Integer count, Integer sales, String picture) {
		super();
		setId(id);
		setName(name);
		setDirectoryId(directoryId);
		setDname(dname);
		setBrandId(brandId);
		setBrandName(brandName);
		setKindId(kindId);
		setKindName(kindName);
		setQuality(quality);
		setPromation(promation);
		setGoodNew(goodNew);
		setPrice(price);
		setPromotionPrice(promotionPrice);
		setCount(count);
		setSales(sales);
		setPicture(picture);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((directoryId == null) ? 0 : directoryId.hashCode());
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		result = prime * result + (goodNew ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kindId == null) ? 0 : kindId.hashCode());
		result = prime * result + ((kindName == null) ? 0 : kindName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + (promation ? 1231 : 1237);
		result = prime * result + ((promotionPrice == null) ? 0 : promotionPrice.hashCode());
		result = prime * result + (quality ? 1231 : 1237);
		result = prime * result + ((sales == null) ? 0 : sales.hashCode());
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
		GoodList other = (GoodList) obj;
		if (brandId == null) {
			if (other.brandId != null)
				return false;
		} else if (!brandId.equals(other.brandId))
			return false;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (directoryId == null) {
			if (other.directoryId != null)
				return false;
		} else if (!directoryId.equals(other.directoryId))
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
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
		if (kindName == null) {
			if (other.kindName != null)
				return false;
		} else if (!kindName.equals(other.kindName))
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
		return true;
	}
	@Override
	public String toString() {
		return "GoodList [id=" + id + ", name=" + name + ", directoryId=" + directoryId + ", dname=" + dname
				+ ", brandId=" + brandId + ", brandName=" + brandName + ", kindId=" + kindId + ", kindName=" + kindName
				+ ", quality=" + quality + ", promation=" + promation + ", goodNew=" + goodNew + ", price=" + price
				+ ", promotionPrice=" + promotionPrice + ", count=" + count + ", sales=" + sales + ", picture="
				+ picture + "]";
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
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getKindId() {
		return kindId;
	}
	public void setKindId(Integer kindId) {
		this.kindId = kindId;
	}
	public String getKindName() {
		return kindName;
	}
	public void setKindName(String kindName) {
		this.kindName = kindName;
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
}
