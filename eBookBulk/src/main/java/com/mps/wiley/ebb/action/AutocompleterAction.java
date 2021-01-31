package main.java.com.mps.wiley.ebb.action;


import java.util.ArrayList;
import java.util.List;

import main.java.com.mps.common.struts2.action.Struts2AbstractAction;
import main.java.com.mps.wiley.ebb.service.AutoCompleterService;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Preparable;


@ParentPackage("ebbs")
@Namespace("/ebbs")
public class AutocompleterAction extends Struts2AbstractAction implements Preparable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2608470066433443818L;
	
	@Autowired
	private AutoCompleterService autoCompleterService;
	
	private String term;
	private String[] listContain;
	private int moduleId;
	private int componentId;
	
	
	public int getModuleId()
	{
		return moduleId;
	}
	
	public void setModuleId(int moduleId)
	{
		this.moduleId = moduleId;
	}
	
	public int getComponentId()
	{
		return componentId;
	}
	
	public void setComponentId(int componentId)
	{
		this.componentId = componentId;
	}
	
	public String[] getListContain()
	{
		return listContain;
	}
	
	public void setListContain(String[] listContain)
	{
		this.listContain = listContain;
	}
	
	
	public String getTerm()
	{
		return term;
	}
	
	public void setTerm(String term)
	{
		this.term = term;
	}
	
	
	@Action(value = "autoCompleterAction",
			results = {@Result(type = "json", name = "success", params = {"root", "listContain"}),
					@Result(type = "json", name = "input", params = {"root", "listContain"})
			})
	public String autoCompleteAction()
	{
		try
		{
// System.out.println(" In autosuggest,,,,,,,,");
			
			System.out.println("moduleName>>>> ::" + moduleId + "  and  componentName ::: " + componentId + " and term :::" + term);
			
			List<String> listData = autoCompleterService.getContentByAutoSearch(moduleId, componentId, term);
			
			if (term != null && term.length() > 1)
			{
				
				List<String> tmp = new ArrayList<String>();
				
				for (String str : listData)
				{
					if (StringUtils.contains(str.toLowerCase(), term.toLowerCase()))
					{
						System.out.println(">>> : " + str);
						tmp.add(str);
					}
				}
				listContain = tmp.toArray(new String[tmp.size()]);
				
			}
			return SUCCESS;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return INPUT;
		}
	}
	
	
	@Override
	public void prepare() throws Exception
	{
		// TODO Auto-generated method stub
		
	}
}
