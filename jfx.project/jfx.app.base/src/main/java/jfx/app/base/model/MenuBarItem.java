package jfx.app.base.model;

import javafx.scene.control.MenuItem;

/**
 * 表示一个页面在主界面菜单栏的菜单.用于在主界面菜单栏注册菜单
 * @author john
 * @deprecated
 *
 */
public class MenuBarItem {
	private	final PageTreePath	path;
	private final MenuItem	menu;
	private final SORT_PROPERTY		rootEntryPlace;
	/**
	 * 
	 * @param path 菜单在主菜单上的路径,影响菜单在主菜单栏上显示的层级关系.值为空(即"")表示菜单直接显示为一级菜单
	 * @param menu 菜单控件
	 */
	public	MenuBarItem(final PageTreePath	path,final MenuItem	menu){
		this.path=path;
		this.menu=menu;
		this.rootEntryPlace=SORT_PROPERTY.ANY_PLACE;
	}
	/**
	 * 
	 * @param path 菜单在主菜单上的路径,影响菜单在主菜单栏上显示的层级关系.值为空(即"")表示菜单直接显示为一级菜单
	 * @param menu 菜单控件
	 * @param rootEntryPlace 一级菜单在菜单栏上的排序属性.
	 */
	public	MenuBarItem(final PageTreePath	path,final MenuItem	menu,SORT_PROPERTY rootEntryPlace ){
		this.path=path;
		this.menu=menu;
		this.rootEntryPlace=rootEntryPlace;
	}
	public PageTreePath getPath() {
		return path;
	}
	public MenuItem getMenu() {
		return menu;
	}
	public	SORT_PROPERTY	SortProperty(){
		return this.rootEntryPlace;
	}
	
}
