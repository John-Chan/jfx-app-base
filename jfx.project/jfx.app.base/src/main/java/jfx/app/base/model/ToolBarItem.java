package jfx.app.base.model;

import javafx.scene.Node;

/**
 * 
 * @author john
 * @deprecated
 *
 */
public class ToolBarItem {
	private	final PageTreePath	path;
	private final Node	control;
	private final SORT_PROPERTY		rootEntryPlace;
	
	/**
	 * 
	 * @param path 在工具栏上的路径,影响控件工具栏上显示的层级关系.值为空(即"")表示控件直接显示在工具栏.
	 * @param control 任意控件类型,将会显示在工具栏上
	 * @note 目前不支持在工具栏上分级显示控件,path的值被忽略
	 */
	public	ToolBarItem(final PageTreePath	path,final Node	control){
		this.path=path;
		this.control=control;
		this.rootEntryPlace=SORT_PROPERTY.ANY_PLACE;
	}
	public	ToolBarItem(final PageTreePath	path,final Node	control,SORT_PROPERTY rootEntryPlace ){
		this.path=path;
		this.control=control;
		this.rootEntryPlace=rootEntryPlace;
	}
	
	public PageTreePath getPath() {
		return path;
	}
	public Node getControl() {
		return control;
	}
	public	SORT_PROPERTY	SortProperty(){
		return this.rootEntryPlace;
	}
}
