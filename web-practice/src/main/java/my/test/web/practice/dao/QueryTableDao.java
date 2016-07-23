package my.test.web.practice.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import my.test.web.practice.entity.DevicePreConfig;

@Repository
public interface QueryTableDao {
	public List<DevicePreConfig> findDp(Map<String, String> searchParam);
}
