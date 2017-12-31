package cn.luna.sky.core.module.menu.entity;


import java.util.Date;

public class Menu implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String menuId;
	private String parentMenuId;
	private String parentIds;
	private String entityId;
	private String menuName;
	private int sortNum;
	private String menuUrl;
	private String openType;
	private String icon;
	private Character isEnable;
	private Character isProtect;
	private String permission;
	private String i18nId;
	private String createUserId;
	private Date createDate;
	private String updateUserId;
	private Date updateDate;
	private String remarks;
	private char delFlag;
	private int lockVersion;

	public Menu() {
	}
	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getParentMenuId() {
		return this.parentMenuId;
	}

	public void setParentMenuId(String parentMenuId) {
		this.parentMenuId = parentMenuId;
	}

	public String getParentIds() {
		return this.parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getSortNum() {
		return this.sortNum;
	}

	public void setSortNum(int sortNum) {
		this.sortNum = sortNum;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getOpenType() {
		return this.openType;
	}

	public void setOpenType(String openType) {
		this.openType = openType;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Character getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(Character isEnable) {
		this.isEnable = isEnable;
	}

	public Character getIsProtect() {
		return this.isProtect;
	}

	public void setIsProtect(Character isProtect) {
		this.isProtect = isProtect;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getI18nId() {
		return this.i18nId;
	}

	public void setI18nId(String i18nId) {
		this.i18nId = i18nId;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUserId() {
		return this.updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public char getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(char delFlag) {
		this.delFlag = delFlag;
	}
	public int getLockVersion() {
		return lockVersion;
	}
	public void setLockVersion(int lockVersion) {
		this.lockVersion = lockVersion;
	}
	
}
