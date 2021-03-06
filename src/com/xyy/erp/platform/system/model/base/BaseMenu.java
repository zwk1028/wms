package com.xyy.erp.platform.system.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMenu<M extends BaseMenu<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setParentId(java.lang.String parentId) {
		set("parentId", parentId);
	}

	public java.lang.String getParentId() {
		return get("parentId");
	}

	public void setSystemId(java.lang.String systemId) {
		set("systemId", systemId);
	}

	public java.lang.String getSystemId() {
		return get("systemId");
	}

	public void setOperationId(java.lang.String operationId) {
		set("operationId", operationId);
	}

	public java.lang.String getOperationId() {
		return get("operationId");
	}
	
	public void setOperationName(java.lang.String operationName) {
		set("operationName", operationName);
	}

	public java.lang.String getOperationName() {
		return get("operationName");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setIsparent(java.lang.String isparent) {
		set("isparent", isparent);
	}

	public java.lang.String getIsparent() {
		return get("isparent");
	}

	public void setSortNo(java.lang.Long sortNo) {
		set("sortNo", sortNo);
	}

	public java.lang.Long getSortNo() {
		return get("sortNo");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

	public void setState(java.lang.Integer state) {
		set("state", state);
	}

	public java.lang.Integer getState() {
		return get("state");
	}
	
	public void setMobileState(java.lang.Integer mobileState) {
		set("mobileState", mobileState);
	}
	
	public java.lang.Integer getMobileState() {
		return get("mobileState");
	}
	
	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	
	public java.lang.String getUrl() {
		return get("url");
	}
	
	public void setMobileIcon(java.lang.String mobileIcon) {
		set("mobileIcon", mobileIcon);
	}
	
	public java.lang.String getMobileIcon() {
		return get("mobileIcon");
	}
	
	public String getSrc() {
		return get("url");
	}
}
