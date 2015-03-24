package jfx.app.base.model;

import java.util.List;

import org.controlsfx.control.action.Action;

import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * 页面对象接口.
 * 
 * @author john
 * @note 所有集成此接口的对象必须实现默认构造函数(即不带参数的构造函数)才能别类加载器创建
 */
public interface Page {

	/**
	 * 回调函数,页面加载器创建改页面对象后调用
	 * 页面可以在本方法中做一些内部初始化工作
	 */
	public	void	afgerLoad();
	
	/**
	 * 回调函数,页面加载器在析构页面对象前调用
	 * 页面可以在本方法中做一些资源清理工作
	 */
	public	void	beforeDestroy();
	
	/**
	 * 回调函数,页面对象获得在主界面框架上的显示权时被调用
	 * @return true 页面会在主界面框架显示;false 页面不会在主界面框架显示
	 */
	public	boolean	readyForEnter();
	
	/**
	 * 回调函数,页面对象失去在主界面框架上的显示权时被调用.
	 * @return ture 页面将失去显示权,false 页面希望保留显示权
	 */
	public	boolean	readyForLeave();
	/**
	 * 
     * 返回页面的ID.
     * ID用于页面查找等功能,必须唯一.建议使用完整的包名称+类名称
     */
    public String getPageId();
    
	/**
	 * 
     * 一个简短的描述,说明当前页面的用途.一般用一个名词来表示,比如'登陆'
     */
    public String getPageName();

    /**
     * getSampleDescription
     * 一个简短的描述,说明当前页面的用途.一般用一句话来表示,比getPageName更详细
     */
    public String getPageDescription();
    
    /**
     * 
     * 当前页面路径,比如'[身份验证,第三方身份验证]',这个值影响当前页面在导航栏中的层级组织关系,也是页面导航的依据.
     * 
     */
    public PageTreePath getPagePath();
    
    /**
     * 返回需要在主界面工具栏上显示的控件
     * 如果页面不需要在主界面[工具栏]显示任何内容,可以返回null
     */
    public	List<Action>	getToolBarActions();
    
    /**
     * 返回需要在主界面菜单栏上显示的菜单
     * 如果页面不需要在主界面[菜单栏]显示任何内容,可以返回null
     */
    public List<Action>	getMenuBarActions();
    /**
     * 
     * 当前页面所属项目名称
     */
    public String getProjectName();
    
    /**
     * 
     * 返回项目版本号(因为页面是以插件方式被主界面框架使用)
     */
    public String getProjectVersion();
    
    /**
     * 返回当前页面的界面主面板,这个面板极其里面的子控件被主界面框架加载和显示
     */
    public Node getPanel(final Stage stage);
    

    /**
     * 返回当前页面的辅助面板,辅助面板可以用于放置一些不重要的辅助控件,比如显示帮助,进度条等
     * 这个面板是可选的,可以返回null
     */
    public Node getAssistPanel();
    
    /**
     * 返回辅助面板与主面板的显示比例[0.0~1.0],比如:0.2.
     * 数值越小,AssistPanel占用的空间越大
     * 如果getAssistPanel()不是null,这个值必须设置
     */
    public double getAssistPanelDividerPosition();
    

    /**
     * 
     * 返回当前页面的帮助文档URL.可以为null
     */
    public String getHelpDocURL();

    /**
     * 
     * @return ActionMgr
     */
    
    
    /**
     * 当前页面是否对用户可见
     */
    //public boolean isVisible();
}
