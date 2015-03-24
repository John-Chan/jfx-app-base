package jfx.app.base.controller;

import java.util.ArrayList;
import java.util.List;

import jfx.app.base.model.Page;

public class PageMgr implements PageCtrl{

	public PageMgr(){
		//
	}
	
	/** {@inheritDoc} */
	public Page	findPage(String id){
		return null;
	}
	/** {@inheritDoc} */
	public List<String>	allPage(){
		return new ArrayList<String>();
	}
	/** {@inheritDoc} */
	public Page	unloadPage(String id){
		return null;
	}
	
	/** {@inheritDoc} */
	public	void	hidePage(Page page){
		//
	}
	/** {@inheritDoc} */
	public	void	unHidePage(Page page){
		//
	}
	
	/** {@inheritDoc} */
	public boolean		jump(Page dest){
		//
		return false;
	}
}
