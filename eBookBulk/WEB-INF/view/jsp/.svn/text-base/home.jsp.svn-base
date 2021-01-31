<%@taglib uri="/struts-tags" prefix="s"%>

   <!--Dashboard-->
<div class="dashboard">
	<div class="spacer"></div>
	<!--Block-->

<!-- Loop Start -->
	<s:iterator value="#session['menu_list']">
		<div class="block">
			<div class="icon">
				<s:if test="%{key==1}">
					<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/project.png" alt="" />
				</s:if>
				<s:if test="%{key==2}">
					<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/report.png" alt="" />
				</s:if>
				<s:if test="%{key==3}">
					<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/template.png" alt="" />
				</s:if>
				<s:if test="%{key==4}">
					<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/support.png" alt="" />
				</s:if>
			</div>
			<!--Links-->
			<div class="homeBlock"> 
				
						<s:if test="%{key==1}">
							<s:text name="label.project"/>
						</s:if>
						<s:if test="%{key==2}">
							<s:text name="label.reports"/>
						</s:if>
						<s:if test="%{key==3}">
							<s:text name="label.templates"/>
						</s:if>
						<s:if test="%{key==4}">
							<s:text name="label.jirasupport"/>
						</s:if>
					
			</div>
			<div class="links">
				<ul>
					
					<s:iterator value="value" status="a">
						<s:if test="%{#a.index==4}">
						
						</s:if>
						
							<li>
								<a href="ebbs/<s:property value="menuUrl"/>">
									<img src="<s:property value="%{@main.java.com.mps.common.AppSystem@STATIC_PATH}"/>/img/<s:property value="menuImg"/>" border="0" />
									&nbsp;<s:property value="menuName"/>
								</a>
							</li>
						
					</s:iterator>
				</ul>
			</div>
		</div>
		<div class="clear"></div>
	</s:iterator>
<!-- Loop End -->	
	
</div>
<!--Dashboard-->
