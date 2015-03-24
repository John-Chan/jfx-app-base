package jfx.app.base.model;

import java.util.ArrayList;
import java.util.List;

import org.controlsfx.control.action.Action;

public class ActionList {
	private List<Action> menuBarActions;
	private List<Action> toolBarActions;
	public ActionList(){
		menuBarActions=new ArrayList<Action>();
		toolBarActions=new ArrayList<Action>();
	}
	public List<Action> getMenuBarActions() {
		return menuBarActions;
	}
	public List<Action> getToolBarActions() {
		return toolBarActions;
	}
	public void setMenuBarActions(List<Action> menuBarActions) {
		this.menuBarActions = menuBarActions;
	}
	public void setToolBarActions(List<Action> toolBarActions) {
		this.toolBarActions = toolBarActions;
	}
}
