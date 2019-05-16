package com.youzhi.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGoods<M extends BaseGoods<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setGoodsImage(java.lang.String goodsImage) {
		set("goodsImage", goodsImage);
	}
	
	public java.lang.String getGoodsImage() {
		return getStr("goodsImage");
	}

	public void setGoodsName(java.lang.String goodsName) {
		set("goodsName", goodsName);
	}
	
	public java.lang.String getGoodsName() {
		return getStr("goodsName");
	}

	public void setGoodsPrice(java.math.BigDecimal goodsPrice) {
		set("goodsPrice", goodsPrice);
	}
	
	public java.math.BigDecimal getGoodsPrice() {
		return get("goodsPrice");
	}

	public void setGoodsCategory(java.lang.Integer goodsCategory) {
		set("goodsCategory", goodsCategory);
	}
	
	public java.lang.Integer getGoodsCategory() {
		return getInt("goodsCategory");
	}

	public void setNumber(java.lang.Integer number) {
		set("number", number);
	}
	
	public java.lang.Integer getNumber() {
		return getInt("number");
	}

	public void setManufacturename(java.lang.String Manufacturename) {
		set("Manufacturename", Manufacturename);
	}
	
	public java.lang.String getManufacturename() {
		return getStr("Manufacturename");
	}

	public void setGoodsDescription(java.lang.String goodsDescription) {
		set("goodsDescription", goodsDescription);
	}
	
	public java.lang.String getGoodsDescription() {
		return getStr("goodsDescription");
	}

}
