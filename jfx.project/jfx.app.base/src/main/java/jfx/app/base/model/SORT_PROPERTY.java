package jfx.app.base.model;
/**
 * 
 * @author john
 * @deprecated
 *
 */
public enum SORT_PROPERTY {
	// 由框架决定排序位置(将会出现在PREFER_FIRST之后,PREFER_LAST之前)
	ANY_PLACE,
	// 尽量出现先前面(按照加载顺序,最后一个具有此属性的控件出现在最前面)
	PREFER_FIRST,
	// 尽量出现在后面(按照加载顺序,最后一个具有此属性的控件出现在最后面)
	PREFER_LAST,
	// 固定在前面(按照加载顺序,第一个具有此属性的控件出现在最前面)
	FIXED_FIRST,
	// 固定在后面(按照加载顺序,第一个具有此属性的控件出现在最后面)
	FIXED_LAST
}
