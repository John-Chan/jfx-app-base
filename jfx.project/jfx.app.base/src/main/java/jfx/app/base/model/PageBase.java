package jfx.app.base.model;

import java.util.List;

import javafx.scene.Node;
import org.controlsfx.control.action.Action;

/**
 * 
 * @author john
 * @TODO 集成此类,实现 getPageId ,getPanel 方法
 */
public abstract class PageBase implements Page {

	/** {@inheritDoc} */
	public void afgerLoad() {
		System.out.println(getPageName()+" load");

	}

	/** {@inheritDoc} */
	public void beforeDestroy() {
		System.out.println(getPageName()+" destroy");

	}
	/** {@inheritDoc} */
	public boolean readyForEnter() {
		System.out.println(getPageName()+" enter");
		return true;
	}
	/** {@inheritDoc} */
	public boolean readyForLeave() {
		System.out.println(getPageName()+" has been leave");
		return true;
	}


	/** {@inheritDoc} */
	public String getPageName() {
		return "PageBase";
	}
	/** {@inheritDoc} */
	public String getPageDescription() {
		return "A base object of Page ";
	}
	/** {@inheritDoc} */
	public PageTreePath getPagePath() {
		return new PageTreePath("misc","unknow");
	}
	/** {@inheritDoc} */
	public List<Action> getToolBarActions() {
		return null;
	}
	/** {@inheritDoc} */
	public List<Action> getMenuBarActions() {
		return null;
	}
	/** {@inheritDoc} */
	public String getProjectName() {
		return "sunnysec jfx client";
	}
	/** {@inheritDoc} */
	public String getProjectVersion() {
		return "0.1";
	}

	/** {@inheritDoc} */
	public Node getAssistPanel() {
		return null;
	}
	/** {@inheritDoc} */
	public double getAssistPanelDividerPosition() {
		return 0.7;
	}
	/** {@inheritDoc} */
	public String getHelpDocURL() {
		return null;
	}

}
