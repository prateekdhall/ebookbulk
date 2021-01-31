<%@taglib uri="/struts-tags" prefix="s"%>
<div class="medium-spacer"></div>
<div class="fixContainer">
        <div class="col-1 expanded">
           <s:textfield key="customer.companyName" id="companyName" required="true" labelSeparator=" :" cssClass="extended" theme="xhtml" tabindex="1" cssErrorClass="error-alert" maxlength="50"/>
        </div>
        
         <div class="col-1 expanded">
   		   <s:textfield key="customer.address" labelSeparator=" :" cssClass="extended" theme="xhtml" tabindex="2" cssErrorClass="error-alert" maxlength="255"/>
         </div>
         <div class="clear"></div>
         
         <div class="col-1">
        	<s:textfield key="customer.city"  labelSeparator=" :" theme="xhtml" tabindex="3" cssErrorClass="error-alert" maxlength="50"/>
         </div>
        
        <div class="col-2">
            <s:textfield key="customer.zipCode"  labelSeparator=" :" theme="xhtml" tabindex="6" cssErrorClass="error-alert" maxlength="10"/>
        </div>
        <div class="clear"></div>
        
        <div class="col-1">
  			<s:textfield key="customer.state"  labelSeparator=" :" theme="xhtml" tabindex="4" cssErrorClass="error-alert" maxlength="50"/>
	  	</div>
        
        <div class="col-2">
           <s:textfield key="customer.phoneNo" labelSeparator=" :" theme="xhtml" tabindex="7" cssErrorClass="error-alert" maxlength="50"/>
        </div>
		<div class="clear"></div>
        
  	    <div class="col-1">
	    	<s:select name="customer.country.id" label="Country" id="country" required="true" list="countries" listKey="countryId" listValue="countryName" headerKey="-1" headerValue="Select Country"  labelSeparator=" :" theme="xhtml" tabindex="5" cssErrorClass="error-alert"/>   
        </div>
       <div class="clear"></div>
       
        
        <div class="clear"></div>
         <div class="col-1"> &nbsp;</div>

      <div class="clear"></div>
</div>