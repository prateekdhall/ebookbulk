package main.java.com.mps.wiley.ebb.service;


import java.util.List;

import main.java.com.mps.common.util.RandomCodeGenerator;
import main.java.com.mps.wiley.ebb.dao.PromoCodeDao;
import main.java.com.mps.wiley.ebb.dao.PromoValueDao;
import main.java.com.mps.wiley.ebb.domain.CodeConfig;
import main.java.com.mps.wiley.ebb.domain.CodeValue;
import main.java.com.mps.wiley.ebb.domain.Project;
import main.java.com.mps.wiley.ebb.domain.ProjectUrl;
import main.java.com.mps.wiley.ebb.domain.PromoCodeConfigValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("PromoCodeService")
@Transactional
public class PromoCodeServiceImpl implements PromoCodeService
{
	PromoCodeServiceImpl()
	{
		
	}
	@Autowired
	PromoCodeDao promoCodeDao;
	
	@Autowired
	PromoValueDao promoValueDao;
	@Override
	public int insertPromoCode(CodeConfig codeConfig) throws DataAccessException
	{
		return promoCodeDao.insertPromoCode(codeConfig);
	}
	
	@Override
	public int insertPromoValue(CodeValue codeValue, CodeConfig codeConfig, Project project) throws DataAccessException
	{
		if(project.getOnceActive().toString().equals("1"))
		{
			promoCodeDao.updatePromoCodeConfig(codeConfig);
		}
		else if(project.getOnceActive().toString().equals("0"))
		{
			promoCodeDao.insertPromoCode(codeConfig);	
		}
		return promoValueDao.insertPromoValue(codeValue);
	}
	
	@Override
	public CodeConfig selectPromoCode(int projectId) throws DataAccessException
	{
		return promoCodeDao.selectPromoCode(projectId);
	}
	
	@Override
	public List<CodeValue> selectPromoCodeValueService(int projectId) throws DataAccessException
	{
		return promoValueDao.selectPromoCodeValue(projectId);
	}
	
	@Override
	public int selectPromoCountService(int projectId) throws DataAccessException
	{
		return promoCodeDao.selectPromoCodeCount(projectId);
	}
	
	
	
	@Override
	public int generatePromoCode(CodeConfig codeConfig,CodeValue codeValue, Project project) throws DataAccessException
	{
		String strCode = null;
		int prjQuantity=0;
		prjQuantity = project.getSoldQty() + project.getBackupQty();
		if(codeConfig.getCodeStyle().equalsIgnoreCase("PREFIX"))
		{
			StringBuilder codeBuilder = new StringBuilder();
			String prefixStr = codeConfig.getCodePrefix();
			RandomCodeGenerator codeGenerator = new RandomCodeGenerator();
			if(codeConfig.getCodeType().equalsIgnoreCase("MULTI"))
			{
				strCode = codeGenerator.codeGenerator(5,codeConfig.getCodeQuantity());
			}
			else if(codeConfig.getCodeType().equalsIgnoreCase("SINGLE"))
			{
				strCode = codeGenerator.codeGenerator(5,prjQuantity);
			}
		 
			String strCodeArray[] = strCode.split(","); 
			for(int i = 0;i<strCodeArray.length;i++)
				{
				strCodeArray[i] = prefixStr+strCodeArray[i];
					System.out.println(strCodeArray[i]);
					if(i == 0)
					{
						codeBuilder.append(strCodeArray[i]);
					}
					else
					{
						codeBuilder.append(","+strCodeArray[i]);
					}
				}
			codeValue.setPromoCode(codeBuilder.toString());
			codeValue.setCount(0);
			promoValueDao.insertPromoValue(codeValue);
		}
		if(codeConfig.getCodeStyle().equalsIgnoreCase("AUTO"))
		{
			int size = Integer.parseInt(codeConfig.getCodeSize().substring(0, 1));
			String prefixStr = codeConfig.getCodePrefix();
			RandomCodeGenerator codeGenerator = new RandomCodeGenerator();
			if(codeConfig.getCodeType().equalsIgnoreCase("MULTI"))
			{
				strCode = 	codeGenerator.codeGenerator(size,codeConfig.getCodeQuantity());
			}
			else if(codeConfig.getCodeType().equalsIgnoreCase("SINGLE"))
			{
				//strCode = 	codeGenerator.codeGenerator(size,codeValue.getCount());
				strCode = 	codeGenerator.codeGenerator(size,prjQuantity);
			}
			System.out.println(strCode);
			codeValue.setPromoCode(strCode);
			codeValue.setCount(0);
			promoValueDao.insertPromoValue(codeValue);
		}
		return 1;
	}
	
	
	@Override
	public int generatePromoCode(CodeConfig codeConfig,CodeValue codeValue, Project project, ProjectUrlService prjurlservice) throws DataAccessException
	{
		String strCode = null; int prjQuantity=0;boolean insertEntryPrefix=false;int size1=0;int size2=0;boolean insertEntryPrefix_0=false;
		prjQuantity = project.getSoldQty() + project.getBackupQty();int quant=0;
		List<CodeValue> promoCodeValueList = this.selectPromoCodeValueService(project.getProjectId());
		if(promoCodeValueList==null)
		{
			size1=0;
		}
		else
		{
			size1=promoCodeValueList.size();
		}
		
		List<ProjectUrl> list = prjurlservice.getProjectUrlList(project);
		
		if(list==null)
		{
			size2=0;
		}
		else
		{
			size2=list.size();
		}
		
		
		
		if(codeConfig.getCodeQuantity()>size1)
		{
			quant=(codeConfig.getCodeQuantity())-(size1);
			insertEntryPrefix=true;
		}
		else if(codeConfig.getCodeQuantity()==size1)
		{
			quant=(codeConfig.getCodeQuantity())-(size1);
			insertEntryPrefix=false;
		}
		else
			insertEntryPrefix=false;
		
		if(prjQuantity>size2)
		{
			prjQuantity=((prjQuantity)-(size2));
			insertEntryPrefix_0=true;
		}
		else if(prjQuantity==size2)
		{
			prjQuantity=((prjQuantity)-(size2));
			insertEntryPrefix_0=false;
		}
		else
			insertEntryPrefix_0=false;
		
		
		
		if(codeConfig.getCodeStyle().equalsIgnoreCase("PREFIX"))
		{
			StringBuilder codeBuilder = new StringBuilder();
			String prefixStr = codeConfig.getCodePrefix();
			RandomCodeGenerator codeGenerator = new RandomCodeGenerator();
			if(codeConfig.getCodeType().equalsIgnoreCase("MULTI"))
			{
				strCode = codeGenerator.codeGenerator(5,quant);
			}
			else if(codeConfig.getCodeType().equalsIgnoreCase("SINGLE"))
			{
				strCode = codeGenerator.codeGenerator(5,prjQuantity);
			}
		 if(strCode.contains(","))
		 {
			String strCodeArray[] = strCode.split(","); 
			for(int i = 0;i<strCodeArray.length;i++)
				{
				strCodeArray[i] = prefixStr+strCodeArray[i];
					System.out.println(strCodeArray[i]);
					if(i == 0)
					{
						codeBuilder.append(strCodeArray[i]);
					}
					else
					{
						codeBuilder.append(","+strCodeArray[i]);
					}
				}
		 }
		 else
		 {
			 codeBuilder.append(prefixStr+strCode);
		 }
			codeValue.setPromoCode(codeBuilder.toString());
			codeValue.setCount(0);
			if(codeConfig.getCodeType().equalsIgnoreCase("MULTI"))
			{
				if(insertEntryPrefix)
					promoValueDao.insertPromoValue(codeValue);
			}
			else if(codeConfig.getCodeType().equalsIgnoreCase("SINGLE"))
			{
				if(insertEntryPrefix_0)
				promoValueDao.insertPromoValue(codeValue);
			}
			/*if(insertEntryPrefix || insertEntryPrefix_0)
			promoValueDao.insertPromoValue(codeValue);*/
		}
		if(codeConfig.getCodeStyle().equalsIgnoreCase("AUTO"))
		{
			int size = Integer.parseInt(codeConfig.getCodeSize().substring(0, 1));
			String prefixStr = codeConfig.getCodePrefix();
			RandomCodeGenerator codeGenerator = new RandomCodeGenerator();
			if(codeConfig.getCodeType().equalsIgnoreCase("MULTI"))
			{
				strCode = 	codeGenerator.codeGenerator(size,quant);
			}
			else if(codeConfig.getCodeType().equalsIgnoreCase("SINGLE"))
			{
				strCode = 	codeGenerator.codeGenerator(size,prjQuantity);
			}
			System.out.println(strCode);
			codeValue.setPromoCode(strCode);
			codeValue.setCount(0);
			
			if(codeConfig.getCodeType().equalsIgnoreCase("MULTI"))
			{
				if(insertEntryPrefix)
					promoValueDao.insertPromoValue(codeValue);
			}
			else if(codeConfig.getCodeType().equalsIgnoreCase("SINGLE"))
			{
				if(insertEntryPrefix_0)
				promoValueDao.insertPromoValue(codeValue);
			}
			/*if(insertEntryPrefix || insertEntryPrefix_0)
			promoValueDao.insertPromoValue(codeValue);*/
		}
		return 1;
	}
	
	@Override
	@Transactional
	public  List<PromoCodeConfigValue> getProjectPromoCodeService(Project project) throws DataAccessException
	{
		System.out.println("In service");
		return promoCodeDao.getProjectPromoCodeList(project);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public int updatePromoCodeService(CodeConfig codeConfig) throws DataAccessException
	{
		int iStatus = promoCodeDao.updatePromoCodeConfig(codeConfig);
		return iStatus;
		
	}
	
	@Override
	@Transactional
	public void deletePromoCode(Project project)	throws DataAccessException 
	{
		promoCodeDao.removePromoCodeConfig(project);
		promoValueDao.removePromoCodeValue(project);
		
	}
	
	@Override
	@Transactional
	public void deletePromoCodeValues(Project project)	throws DataAccessException 
	{
		//promoCodeDao.removePromoCodeConfig(project);
		promoValueDao.removePromoCodeValue(project);
		
	}

	
}
