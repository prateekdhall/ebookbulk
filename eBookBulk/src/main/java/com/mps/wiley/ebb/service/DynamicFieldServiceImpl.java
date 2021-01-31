package main.java.com.mps.wiley.ebb.service;


import java.util.Collections;
import java.util.List;
import java.util.Map;

import main.java.com.mps.wiley.common.AppConstants;
import main.java.com.mps.wiley.common.DynamicFieldConstants;
import main.java.com.mps.wiley.ebb.dao.DynamicFieldDao;
import main.java.com.mps.wiley.ebb.domain.DynamicField;
import main.java.com.mps.wiley.ebb.domain.Template;
import main.java.com.mps.wiley.util.DynamicFieldComparator;
import main.java.com.mps.wiley.util.StringUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("DynamicFieldService")
@Transactional
public class DynamicFieldServiceImpl implements DynamicFieldService
{
	final String DYNAMICTEMPLATESTRING = "dynamictemplatestring";
	public DynamicFieldServiceImpl()
	{
	}
	
	
	@Autowired
	private DynamicFieldDao dynamicFieldDao;
	
	String strTemplate = "<div id='dynamicHtml'></div>";
	@Override
	@Transactional
	public List<DynamicField> loadDynamicFields() throws DataAccessException
	{
		return dynamicFieldDao.findAllDynamicFields();
	}
	
	@Override
	@Transactional
	public String writeHtmlFile(List<DynamicField> obj, Template template, Map<String, Object> session, String countrySelected, String hearus, String footNote, int arr[]) throws Exception
	{
	
		try
		{
			StringBuffer sb = new StringBuffer();
			if (obj != null)
			{
				final String strFileSeperator = "/";
				this.replaceDiv(session);
				Collections.sort(obj, new DynamicFieldComparator());
				String[] countryList = StringUtility.countryList;
				String[] countryKey = StringUtility.countryKey;
				String[] hearUSList = StringUtility.hearUSList;
				String[] hearUSKey = StringUtility.hearUSKey;
				
				sb.append("<form action='http://172.29.1.179:8080/eBookBulk/ebbs/registerUser.do' name='frmMain' id='frmMain' onsubmit='return userValidation();'> ");
				sb.append("<script>");
				sb.append("function userValidation()");
				sb.append("{");
				sb.append("var elem = document.getElementById('frmMain').elements;");
				sb.append("for(var i = 0; i < elem.length; i++)");
				sb.append("{");
				sb.append("var valId=elem[i].id;");
				sb.append("var valValue=elem[i].value;");
				sb.append("var valName=elem[i].name;");
				sb.append("if(valId.indexOf(';') !=-1)");
				sb.append("{");
				sb.append("var temp = new Array();");
				sb.append("var temp1 = new Array();");
				sb.append("var temp2 = new Array();");
				sb.append("temp = valId.split(';');");
				sb.append("temp1 = temp[0].split(':');");
				sb.append("temp2 = temp[2].split(':');");
				sb.append("if(temp1[1]=='true')");
				sb.append("{");
				
				sb.append("if(valValue=='')");
				sb.append("{");
				sb.append("alert('Please enter '+temp2[1]);");
				sb.append("return false;");
				sb.append("}");
				sb.append("}");
				sb.append("}");
				sb.append("}");
				sb.append("return true;");
				sb.append("}");
				/*
				 * sb.append("function trim(stringToTrim) {");
				 * sb.append("return stringToTrim.replace(/^\s+|/\s+$//g, '');");
				 * sb.append("}");
				 * sb.append("function ltrim(stringToTrim) {");
				 * sb.append("return stringToTrim.replace(/^\s+/, "");");
				 * sb.append("}");
				 * sb.append("function rtrim(stringToTrim) {");
				 * sb.append("return stringToTrim.replace(/\s+$/, "");");
				 * sb.append("}");
				 */
				sb.append("</script> ");
				
				
				for (DynamicField dynamicField : obj)
				{
					String selected="";
					sb.append("<div>" + dynamicField.getFieldName() + "<span style='color:#F00;'>");
					if (dynamicField.getFieldMandatory().equals("true"))
					{
						sb.append("*");
					}
					sb.append("</span></div>");
					if (dynamicField.getFieldType().equalsIgnoreCase("TEXT"))
					{
						sb.append("<input type='text' name='field" + dynamicField.getFieldId() + "' id='m:" + dynamicField.getFieldMandatory() + ";o:" + dynamicField.getFieldOrder() + ";n:" + dynamicField.getFieldName() + "' style='margin-bottom:1px;min-width:180px; height: 18px;' />");
						if(dynamicField.getFieldId()==DynamicFieldConstants.STATE && !footNote.equals(""))
						{
							sb.append("</br><span style='color:#F00;'>"+footNote+"</span>");
						}
					}
					else if (dynamicField.getFieldType().equalsIgnoreCase("BIGTEXT"))
					{
						sb.append("<textarea rows='1' cols='10' name='field" + dynamicField.getFieldId() + "' id='m:" + dynamicField.getFieldMandatory() + ";o:" + dynamicField.getFieldOrder() + ";n:" + dynamicField.getFieldName() + "' style='margin-bottom:1px;min-width:220px; height: 18px;'></textarea>");
					}
					else if (dynamicField.getFieldType().equalsIgnoreCase("RADIO") && dynamicField.getFieldId()==DynamicFieldConstants.GENDER)
					{
						sb.append("Male :<input type='radio' checked='checked' name='field" + dynamicField.getFieldId() + "' id='m:" + dynamicField.getFieldMandatory() + ";o:" + dynamicField.getFieldOrder() + ";n:" + dynamicField.getFieldName() + "' />");
						sb.append("Female :<input type='radio' name='" + dynamicField.getFieldName() + "' id='m:" + dynamicField.getFieldMandatory() + ";o:" + dynamicField.getFieldOrder() + ";n:" + dynamicField.getFieldName() + "'/>");
					}
					else if (dynamicField.getFieldType().equalsIgnoreCase("RADIO") && dynamicField.getFieldId()==DynamicFieldConstants.DO_YOU_WANT_US_TO_CONTACT_YOU)
					{
						sb.append("Yes :<input type='radio' checked='checked' name='field" + dynamicField.getFieldId() + "' id='m:" + dynamicField.getFieldMandatory() + ";o:" + dynamicField.getFieldOrder() + ";n:" + dynamicField.getFieldName() + "' />");
						sb.append("No :<input type='radio' name='field" + dynamicField.getFieldId() + "' id='m:" + dynamicField.getFieldMandatory() + ";o:" + dynamicField.getFieldOrder() + ";n:" + dynamicField.getFieldName() + "'/>");
					}
					else if (dynamicField.getFieldType().equalsIgnoreCase("DROPDOWN") && dynamicField.getFieldId()==DynamicFieldConstants.COUNTRY)
					{
						sb.append("<select name='field" + dynamicField.getFieldId() + "' style='margin-bottom:1px;min-width:220px; height: 18px;' id='m:" + dynamicField.getFieldMandatory() + ";o:" + dynamicField.getFieldOrder() + ";n:" + dynamicField.getFieldName() + "' >");
						for (int is = 0; is < countryKey.length; is++)
						{
							if(countrySelected.equals(countryKey[is]))
							{
								selected="selected";
							}
							else
							{
								selected="";
							}
							sb.append("<option value='" + countryKey[is] + "' "+selected+" >" + countryList[is] + "</option>");
						}
						sb.append("</select>");
					}
					else if (dynamicField.getFieldType().equalsIgnoreCase("DROPDOWN") && dynamicField.getFieldId()==DynamicFieldConstants.WHERE_DID_YOU_HEAR_ABOUT_US)
					{
						sb.append("<select name='field" + dynamicField.getFieldId() + "' style='margin-bottom:1px;min-width:220px; height: 18px;' id='m:" + dynamicField.getFieldMandatory() + ";o:" + dynamicField.getFieldOrder() + ";n:" + dynamicField.getFieldName() + "' >");
						for (int iss = 0; iss < hearUSKey.length; iss++)
						{
							if(hearus.equals(hearUSKey[iss]))
							{
								selected="selected";
							}
							else
							{
								selected="";
							}
							sb.append("<option value='" + hearUSKey[iss] + "' "+selected+" >" + hearUSList[iss] + "</option>");
						}
						sb.append("</select>");
					}
					else if (dynamicField.getFieldType().equalsIgnoreCase("CHECKBOX"))
					{
						sb.append("<input type='checkbox' name='field" + dynamicField.getFieldId() + "' style='margin-bottom:1px;min-width:220px;' />");
					}
					
				}
				
				sb.append("<input type='hidden' name='projectid' value='" + ((template.getProjectId() != null) ? template.getProjectId() : "") + "' />");
				sb.append("<div class='btnWrapper'>");
				sb.append("<input type='button' name='addForm' Value='Submit' style='   margin: 2px 0 0; padding:3px 0px;font-size:11px;color:#fff;min-width:65px;background:none;border:none;background: #87e0fd; background: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzg3ZTBmZCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjE2JSIgc3RvcC1jb2xvcj0iIzUzY2JmMSIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjI5JSIgc3RvcC1jb2xvcj0iIzA1YWJlMCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgPC9saW5lYXJHcmFkaWVudD4KICA8cmVjdCB4PSIwIiB5PSIwIiB3aWR0aD0iMSIgaGVpZ2h0PSIxIiBmaWxsPSJ1cmwoI2dyYWQtdWNnZy1nZW5lcmF0ZWQpIiAvPgo8L3N2Zz4=);background: -moz-linear-gradient(top,  #87e0fd 0%, #53cbf1 16%, #05abe0 29%); background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#87e0fd), color-stop(16%,#53cbf1), color-stop(29%,#05abe0)); background: -webkit-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: -o-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: -ms-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%);'/>");
				sb.append(" <input type='reset' value='Cancel'  style=' margin: 2px 0 0;padding:3px 0px;font-size:11px;color:#fff;min-width:65px;background:none;border:none;background: #87e0fd; background: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzg3ZTBmZCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjE2JSIgc3RvcC1jb2xvcj0iIzUzY2JmMSIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjI5JSIgc3RvcC1jb2xvcj0iIzA1YWJlMCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgPC9saW5lYXJHcmFkaWVudD4KICA8cmVjdCB4PSIwIiB5PSIwIiB3aWR0aD0iMSIgaGVpZ2h0PSIxIiBmaWxsPSJ1cmwoI2dyYWQtdWNnZy1nZW5lcmF0ZWQpIiAvPgo8L3N2Zz4=);background: -moz-linear-gradient(top,  #87e0fd 0%, #53cbf1 16%, #05abe0 29%); background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#87e0fd), color-stop(16%,#53cbf1), color-stop(29%,#05abe0)); background: -webkit-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: -o-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: -ms-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%);'/>");
				if(arr[1]!=AppConstants.MANDATORY)
				{
					sb.append(" <input type='button' value='Skip'  style=' margin: 2px 0 0;padding:3px 0px;font-size:11px;color:#fff;min-width:65px;background:none;border:none;background: #87e0fd; background: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzg3ZTBmZCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjE2JSIgc3RvcC1jb2xvcj0iIzUzY2JmMSIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjI5JSIgc3RvcC1jb2xvcj0iIzA1YWJlMCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgPC9saW5lYXJHcmFkaWVudD4KICA8cmVjdCB4PSIwIiB5PSIwIiB3aWR0aD0iMSIgaGVpZ2h0PSIxIiBmaWxsPSJ1cmwoI2dyYWQtdWNnZy1nZW5lcmF0ZWQpIiAvPgo8L3N2Zz4=);background: -moz-linear-gradient(top,  #87e0fd 0%, #53cbf1 16%, #05abe0 29%); background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#87e0fd), color-stop(16%,#53cbf1), color-stop(29%,#05abe0)); background: -webkit-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: -o-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: -ms-linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%); background: linear-gradient(top,  #87e0fd 0%,#53cbf1 16%,#05abe0 29%);'/>");
				}
				sb.append("</div></form>");
				
				
				sb.append("<script>");
				sb.append("if(document.getElementById('colnew'))");
				sb.append("{");
				sb.append("document.getElementById('dynamicHtml').innerHTML=document.getElementById('colnew').innerHTML;");
				sb.append("document.getElementById('colnew').style.display='none';");
				sb.append("}");
				sb.append("</script>");
				
				this.replaceDynamicHtmlDiv(strTemplate, sb, session);
				System.out.println("Done: End of writeHtmlTemplate String");
				
			}
			return sb.toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public void replaceDiv(Map<String, Object> session) throws Exception
	{
		try
		{
			System.out.println("in replaceDiv..");
			String stringWillReplace = "";
			String tempDyanmicHtmlString = this.saveSession(session);
			System.out.println("Before Replace=" + tempDyanmicHtmlString);
			if(session!=null)
			{
				if (session.get(DYNAMICTEMPLATESTRING) != null && session.get(DYNAMICTEMPLATESTRING).toString().length() > 28)
				{
					if (tempDyanmicHtmlString.indexOf("<div id='dynamicHtml'") >= 0)
					{
						stringWillReplace = tempDyanmicHtmlString.substring(tempDyanmicHtmlString.indexOf("<div id='dynamicHtml'>") + 22, tempDyanmicHtmlString.lastIndexOf("</div>") - 6);
						tempDyanmicHtmlString = tempDyanmicHtmlString.replace(stringWillReplace, "");
						System.out.println("After Replace=" + tempDyanmicHtmlString);
					}
				}
			}
			session.put(DYNAMICTEMPLATESTRING, tempDyanmicHtmlString);
		
			
		}
		catch (Exception ioe)
		{
			ioe.printStackTrace();
			throw ioe;
		}
	}
	
	public void replaceDynamicHtmlDiv(String tempDyanmicHtmlString, StringBuffer sb1, Map<String, Object> session) throws Exception
	{
		try
		{
			System.out.println("in replaceDynamicHtmlDiv..");
			String stringWillReplace = "";
			System.out.println("Before Replace=" + tempDyanmicHtmlString);
			if (tempDyanmicHtmlString.indexOf("<div id='dynamicHtml'") >= 0)
			{
				stringWillReplace = tempDyanmicHtmlString.substring(tempDyanmicHtmlString.indexOf("<div id='dynamicHtml'>") + 22, tempDyanmicHtmlString.lastIndexOf("</div>") + 6);
				tempDyanmicHtmlString = tempDyanmicHtmlString.replace(stringWillReplace, sb1.toString());
				System.out.println("After Replace=" + tempDyanmicHtmlString);
			}
			session.put(DYNAMICTEMPLATESTRING, tempDyanmicHtmlString);
		}
		catch (Exception ioe)
		{
			ioe.printStackTrace();
			throw ioe;
		}
	}
	
	public String saveSession(Map<String, Object> session)
	{
		if(session!=null)
		{
			if (session.get(DYNAMICTEMPLATESTRING) != null)
				strTemplate = session.get(DYNAMICTEMPLATESTRING).toString();
			else
				return strTemplate;
		}
		return strTemplate;
	}
	
	

	
}
