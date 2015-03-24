package jfx.app.base.controller;

import javafx.scene.control.MenuBar;
import javafx.scene.control.ToolBar;
import jfx.app.base.model.ActionList;

import org.controlsfx.control.action.ActionUtils;
import org.controlsfx.control.action.ActionUtils.ActionTextBehavior;

public class ActionMgr {

	private ActionList	savedActionList=new ActionList();
	/*public ContextMenu	createContextMenu(){
		return ActionUtils.createContextMenu(actions);
	}*/

	public MenuBar 	createMenuBar(){
		return ActionUtils.createMenuBar(savedActionList.getMenuBarActions());
	}

	public ToolBar	createToolBar(){
		return ActionUtils.createToolBar(savedActionList.getToolBarActions(), ActionTextBehavior.HIDE);
	}
	public	ActionList	getActionList(){
		return savedActionList;
	}
}
