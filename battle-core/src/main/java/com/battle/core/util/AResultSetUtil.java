/**
 * 
 */
package com.battle.core.util;

import com.battle.core.common.vo.APage;
import com.battle.core.common.vo.AResultSet;

/**
 * @author AceNada
 *
 */
public class AResultSetUtil {

	public static <T> AResultSet success(T object) {
		AResultSet<T> result = new AResultSet<T>();
		result.setStatus(200);
		result.setMessage("Success");
		result.setData(object);
		return result;
	}

	public static <T> AResultSet success(T object, String message) {
		AResultSet<T> result = new AResultSet<T>();
		result.setStatus(200);
		result.setMessage(message);
		result.setData(object);
		return result;
	}

	public static <T> AResultSet success(T object, long pageCount, int pageNo, int pageSize) {
		AResultSet result = new AResultSet();
		APage data = new APage();
		data.setList(object);
		data.setCount(pageCount);
		data.setPageNo(pageNo);
		data.setPageSize(pageSize);
		result.setStatus(200);
		result.setMessage("Success");
		result.setData(data);
		return result;
	}

	public static <T> AResultSet success(T object, long pageCount) {
		AResultSet result = new AResultSet();
		APage<T> data = new APage<T>();
		data.setList(object);
		data.setCount(pageCount);
		result.setStatus(200);
		result.setMessage("Success");
		result.setData(data);
		return result;
	}

	public static AResultSet success() {
		return success(null);
	}

	public static AResultSet error(Integer code, String msg) {
		AResultSet result = new AResultSet();
		result.setStatus(code);
		result.setMessage(msg);
		return result;
	}
}
