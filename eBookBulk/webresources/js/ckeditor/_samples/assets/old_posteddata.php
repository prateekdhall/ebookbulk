<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?php
/*
Copyright (c) 2003-2011, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/
?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Sample &mdash; CKEditor</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="../../css/style.css" type="text/css"/>
</head>
<body>
<div id="container">
 <div class="content-wrapper">
  <div id="main" role="main">
   <h1 class="samples">Preview</h1>
<?php

$postedValue=stripslashes( $_POST['editor1'] );

echo $postedValue;
?>
  </div>
 </div>
</div>
</body>
</html>
