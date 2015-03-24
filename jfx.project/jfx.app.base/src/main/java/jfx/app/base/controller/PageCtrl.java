package jfx.app.base.controller;

import java.util.List;

import jfx.app.base.model.Page;

public interface PageCtrl {
	/**
	 * 根据ID查找一个已经加载的页面对象,如果没有找到返回null
	 */
	public Page	findPage(String id);
	
	/**
	 * 返回所有已经加载的页面对象ID
	 */
	public List<String>	allPage();

	/**
	 * 根据ID查找一个已经加载的页面对象,先将找的页面对象移除,然后返回该对象
	 * 如果没有找到返回null
	 * 如果页面正处于显示状态,将会跳转到框架的默认显示页面.
	 */
	public Page	unloadPage(String id);
	
	/**
	 * 将一个页面设置为隐藏,如果页面正处于显示状态,将会跳转到框架的默认显示页面.
	 * 
	 * @note 页面隐藏后,页面在导航列表中的条目也会隐藏.页面在主框架中注册的菜单,按钮不会受影响,页面自己决定是否要保留.
	 */
	public	void	hidePage(Page page);
	/**
	 * 将一个页面设置为可见.本操作不会引起页面跳转,但是会引起导航列表刷新
	 * 
	 * @note 页面设置为可见后,页面会重新出现在导航列表中
	 */
	public	void	unHidePage(Page page);
	/**
	 * 跳转到某个页面,如果dest为null将会跳转到框架的默认显示页面
	 * @note 该操作成功的前提条件是:
	 * 当前显示的页面没有阻止页面跳转(oldPage.readyForLeave()==true)
	 * 新页面没有阻止页面显示(newPage.readyForEnter()==true)
	 */
	public boolean		jump(Page dest);
}
