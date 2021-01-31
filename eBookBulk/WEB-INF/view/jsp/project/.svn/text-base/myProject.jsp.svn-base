<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<br/>
<s:url id="status1" action="myprojectgrid?project.projectStatus=%{@main.java.com.mps.wiley.common.AppConstants@STATUS_PENDING}" />
<s:url id="status2" action="myprojectgrid?project.projectStatus=%{@main.java.com.mps.wiley.common.AppConstants@STATUS_ACTIVE}" />
<s:url id="status3" action="myprojectgrid?project.projectStatus=%{@main.java.com.mps.wiley.common.AppConstants@STATUS_INACTIVE}" />
<sj:tabbedpanel id="mytabs" animate="true" collapsible="true" useSelectedTabCookie="false" selectedTab="0">
	<sj:tab id="tab1" href="%{status1}" label="In Progress" />
	<sj:tab id="tab2" href="%{status2}" label="Active" />
	<sj:tab id="tab3" href="%{status3}" label="In Active" />
</sj:tabbedpanel>
