<%@taglib prefix="s" uri="/struts-tags"%>
<div id="topnav">
	<ul>
		<li>Welcome <span><s:property value="#session['user'].name"/></span></li>
		<li class="pipe">|</li>
		<li>
			<s:url id="url" action="myAccount.do"/>
			<s:a href="%{url}"><s:text name="label.myaccount"/></s:a>
		</li>
		<s:if test="#session['user'].roleId==1">
			<li class="pipe">|</li>
			<li>
				<s:url id="url" action="searchUser.do"/>
				<s:a href="%{url}"><s:text name="label.useraccounts"/></s:a>
			</li>
		</s:if>
		<li class="pipe">|</li>
		<li>
			<s:url id="url" action="contactus.do"/>
			<s:a href="%{url}"><s:text name="label.contactus"/></s:a>
		</li>
		<li class="pipe">|</li>
		<li>
			<s:url id="url" action="help.do"/>
			<s:a href="%{url}"><s:text name="label.help"/></s:a>
		</li>
		<li class="pipe">|</li>
		<li>
			<s:url id="url" namespace="login" action="logoff.do"/>
			<s:a href="%{url}"><s:text name="label.logout"/></s:a>
		</li>
	</ul>
</div>
<!--Top Navigation starts here-->
<!--Application Navigation-->
<div id="application-bar">
	<div class="pubLogo">
		<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/wiley-logo.png" alt="Wiley" />
	</div>
	<div class="tabbedNavigation">
		<ul class="tabs">
			<li>
				<s:url id="url" action="home.do"/>
				<s:a href="%{url}"><s:text name="label.home"/></s:a>
			</li>
		</ul>
	</div>
</div>
<!--Application Navigation-->

