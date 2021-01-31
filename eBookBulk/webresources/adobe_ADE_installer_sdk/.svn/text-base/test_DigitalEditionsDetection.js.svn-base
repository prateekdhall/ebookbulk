/*************************************************************
 *
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2006-2009 Adobe Systems Incorporated
 * All Rights Reserved
 *
 * NOTICE: Adobe permits you to use, modify, and distribute
 * this file in accordance with the terms of the Adobe license
 * agreement accompanying it. If you have received this file
 * from a source other than Adobe, then your use, modification,
 * or distribution of it requires the prior written permission
 * of Adobe.
 *
 *************************************************************/
//-----------------------------------------------------------------------------
//  Maintenance Log:
//  
//  01/23/2008 A few cosmetic edits
//-----------------------------------------------------------------------------
// ********************
// NOTE: This JS file is meant to be used IN CONJUNCTION with 
// DigitalEditionsDetection.js.  The G_ global variables live there
// as well as the call to ShowADE_DivLayer()
// ********************
var	GD_at_set_ADE_TestDetectionForm_Data = 0;
var	GD_at_TPlat = 0;
var	GD_at_TFlash = 0;
var	GD_at_TADE = 0;
 
// ********************
// Dump state for viewing
// ********************
function set_ADE_TestDetectionForm_Data()
{
	GD_at_set_ADE_TestDetectionForm_Data++;

	var strVars = "Platform-";
	if (G_nPlatform == 1)
	{
		strVars += "win";		
	}
	else if (G_nPlatform == 2)
	{
		strVars += "mac";		
	}
	else if (G_nPlatform == 3)
	{
		strVars += "linux";		
	}
	else // (G_nPlatform == 4)
	{
		strVars += "unknown";		
	}
		
	strVars += " Flash-";		
	if (G_bFlashInstalled)
		strVars += "true";		
	else
		strVars += "false";		
		
	strVars += " ADE-";		
	if (G_nADEInstalled == 1)
		strVars += "true";		
	else if (G_nADEInstalled == 0)
		strVars += "false";		
	else  // (G_nADEInstalled == 2, 3)
		strVars += G_nADEInstalled;		

	strVars += " OS-";		
	strVars += G_nav_platform;	
		
	document.ADE_TestDetectionForm.Data.value = strVars;
}

// ********************
// Toggle Platform
// ********************
function TPlat()
{
	GD_at_TPlat++;
	
	G_nPlatform++;
	if (G_nPlatform > 4)
		G_nPlatform = 1;		
		
	ShowADE_DivLayer();		
//	set_ADE_TestDetectionForm_Data();	// called by ShowADE_DivLayer()
}

// ********************
// Toggle Flash
// ********************
function TFlash()
{
	GD_at_TFlash++;

	if (G_bFlashInstalled)
		G_bFlashInstalled = false;		
	else
		G_bFlashInstalled = true;		
		
	ShowADE_DivLayer();		
//	set_ADE_TestDetectionForm_Data();	// called by ShowADE_DivLayer()
}

// ********************
// Toggle ADE
// ********************
function TADE()
{
	GD_at_TADE++;
	
	G_bTEST_nADEInstalled_control = true;

	// force to 0 below by 1 now
	if (G_bForce_nADEInstalled_zero)
		G_nADEInstalled = 1;		
	
	if (G_nADEInstalled == 1)
		G_nADEInstalled = 0;		
	else
		G_nADEInstalled = 1;		
		
	ShowADE_DivLayer();		
//	set_ADE_TestDetectionForm_Data();	// called by ShowADE_DivLayer()
}

/***************************************************
<!-- START ADE_TestDetectionForm form for testing with test_DigitalEditionsDetection.js -->
<hr/>
<form name="ADE_TestDetectionForm" method="POST" ID="Form1">
  <p>
  <center>
  <b><font color="#0099CC">ADE test Detection Controller<br></font></b>
  <input type="button" value="Toggle Platform" name="Plat" onClick="TPlat();" ID="Button1">
  <input type="button" value="Toggle Flash" name="Flash" onClick="TFlash();" ID="Button2">
  <input type="button" value="Toggle ADE" name="ADE" onClick="TADE();" ID="Button3">
  &nbsp;<br>
  Form Data: 
  <input type="text" name="Data" size="70" value="UN-INITIALIZED ???" ID="Text1"> 
  </center>
  </p>
  <p>&nbsp;</p>
</form>
<hr/>
<!-- END controller form for testing with test_DigitalEditionsDetection.js -->
***************************************************/
