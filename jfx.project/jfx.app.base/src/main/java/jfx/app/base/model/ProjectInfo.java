package jfx.app.base.model;


/**
 * 辅助接口.实现方需要暴露一个ProjectInfo类型的接口,页面加载器会根据此接口来扫描需要加载的类
 * @author john
 *
 */
public interface ProjectInfo {

	/**
	 * 项目名称
	 */
	public String getProjectName();
    
    /**
     * 
     * 包名称.
     * 告诉类加载器去那个包下面扫描实现了Page接口的类
     */
    public String getPageBasePackage();
    
    /**
     * 欢迎页面
     * 项目中所有页面以树的方式显示为导航列表,当项目的根节点被选中时,这个欢迎页面就会被显示
     */
    public WelcomePage getWelcomePage();
}
