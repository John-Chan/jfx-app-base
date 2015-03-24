package jfx.app.base.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示一个页面路径,用于页面导航
 * @author john
 */
public class PageTreePath {

	public static final String	NODE_SEPARATER="/";
	private List<String>	pathList;
	public PageTreePath(){
		pathList=new ArrayList<String>();
	}
	public PageTreePath(String...  pathArgs){
		pathList=new ArrayList<String>();
		for(String s:pathArgs){
			pushBack(s);
		}
	}
	public PageTreePath(List<String> list){
		pathList=new ArrayList<String>();
		for(String s:list){
			pushBack(s);
		}
	}
	public	String	toString(){
		StringBuilder	sb=new StringBuilder() ;
		for(String s:pathList){
			if(sb.length()>0) sb.append(PageTreePath.NODE_SEPARATER);
			sb.append(s);
		}
		return sb.toString();
	}
	public	PageTreePath	append(String child){
		pathList.add(child);
		return this;
	}
	public boolean isEmpty(){
		return this.pathList.size()==0;
	}
	private void	pushBack(String child){
		pathList.add(child);
	}
}
