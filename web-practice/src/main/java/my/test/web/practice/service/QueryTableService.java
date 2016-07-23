package my.test.web.practice.service;

import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.test.web.practice.dao.QueryTableDao;
import my.test.web.practice.entity.DevicePreConfig;
import my.test.web.practice.utils.PageHelper;

@Service
public class QueryTableService {

	@Autowired
	private QueryTableDao qtDao;

	public List<DevicePreConfig> findPreconfigData(Map<String, String> searchParam) {
		return qtDao.findDp(searchParam);
	}
/*
	public PageHelper.Page<SysLoginLog> findSysLoginLog(String loginIp, String username,
			String loginDate, String exitDate, String logerr, int pageNumber, int pageSize)
					throws Exception {
		Proxy.newProxyInstance(null,null,null);
		PageHelper.startPage(pageNumber, pageSize);
		sysLoginLogMapper.findSysLoginLog(loginIp, username, loginDate, exitDate, logerr);
		return PageHelper.endPage();
	}
	*/
}
