package cn.com.springmvc.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;


/**
 * 
 * BaseAction åŸºç±»
 * 
 * @author wangzhangxiang@rtmap.com
 * @date 2016å¹?æœ?9æ—? * @since 1.0
 */
public class BaseAction extends AbstractJsonpResponseBodyAdvice{
	protected Logger log = LoggerFactory.getLogger(BaseAction.class);
	
	protected Map<String,String> codeMap;
	
	public BaseAction() {
		super("callback");
	}
	
	public Map<String, String> getCodeMap() {
		return codeMap;
	}
	public void setCodeMap(Map<String, String> codeMap) {
		this.codeMap = codeMap;
	}
}
