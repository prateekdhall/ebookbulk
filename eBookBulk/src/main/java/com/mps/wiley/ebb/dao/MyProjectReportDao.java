package main.java.com.mps.wiley.ebb.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
 
import main.java.com.mps.common.BaseDao;
 
import main.java.com.mps.wiley.ebb.reportsBean.MyProjectReportDto;

public interface MyProjectReportDao  extends BaseDao<MyProjectReportDto>
{
public List<MyProjectReportDto> getProjectListByStatus(int status)throws DataAccessException;
}
