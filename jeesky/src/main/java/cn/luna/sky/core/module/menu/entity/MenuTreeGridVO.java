package cn.luna.sky.core.module.menu.entity;

import java.util.ArrayList;
import java.util.List;

public class MenuTreeGridVO {
	private String menuId;
	private String parentMenuId;
	private String menuName;
	private int sortNum;
	private String menuUrl;
	private String openType;
	private String icon;
	private List<MenuTreeGridVO> children;
	
	public MenuTreeGridVO(){
		
	}
	
	public MenuTreeGridVO(String menuId, String parentMenuId,
			String menuName, String menuUrl, String openType, String icon) {
		this.menuId = menuId;
		this.parentMenuId= parentMenuId;
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.openType = openType;
		this.icon = icon;
		this.children = new ArrayList<MenuTreeGridVO>();
	}
	public List<MenuTreeGridVO> getChildren() {
		return children;
	}
	public void setChildren(List<MenuTreeGridVO> children) {
		this.children = children;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getParentMenuId() {
		return parentMenuId;
	}
	public void setParentMenuId(String parentMenuId) {
		this.parentMenuId = parentMenuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getSortNum() {
		return sortNum;
	}
	public void setSortNum(int sortNum) {
		this.sortNum = sortNum;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public String getOpenType() {
		return openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

}
