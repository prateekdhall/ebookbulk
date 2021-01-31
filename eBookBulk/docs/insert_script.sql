INSERT INTO `ROLE` (`ROLE_ID`,`ROLE_NAME`,`ROLE_RIGHTS`) VALUES
(1,'System Admin','RW'),
(2,'Read Write','RW'),
(3,'Read Only','RO'),
(4,'Key Contact','RO');

INSERT INTO `MENU_ITEM` (`MENU_ID`,`MENU_TYPE`,`MENU_NAME`,`MENU_URL`,`MENU_IMG`,`MENU_ORDER`,`MENU_SHOW`) VALUES
(1,1,'Create','createProject.do','create-project.png',2,1),
(2,1,'Search','searchProject.do','search-project-icon.png',3,1),
(3,1,'My Projects','myProject.do','myproject.png',1,1),
(4,1,'','','',0,0),
(5,1,'','','',0,0),
(6,2,'Project Details','projectDetailsReport.do','general-reports-icon.png',1,1),
(7,2,'Project Overview','projectOverviewReport.do','general-reports-icon.png',2,1),
(8,2,'Project Activity','projectActivityReport.do','general-reports-icon.png',3,1),
(9,2,'Project History','projectHistoryReport.do','general-reports-icon.png',4,1),
(10,2,'','','',5,1),
(11,2,'Project Overview-Customer','projectOverviewCustomerReport.do','customer-report.png',6,1),
(12,2,'Project Activity-Customer','projectActivityCustomerReport.do','customer-report.png',7,1),
(13,2,'','','',0,0),
(14,2,'','','',0,0),
(15,2,'','','',0,0),
(16,3,'Create','createTemplate.do','create-template.png',1,1),
(17,3,'','','',0,0),
(18,3,'','','',0,0),
(19,3,'','','',0,0),
(20,3,'','','',0,0),
(21,4,'Create','createJiraIssue.do','track_content.gif',1,1),
(22,4,'','','',0,0),
(23,4,'','','',0,0);

INSERT INTO `ROLE_PROFILE` (`ROLE_ID`,`RES_ID`) VALUES
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(1,7),
(1,8),
(1,9),
(1,10),
(1,11),
(1,12),
(1,13),
(1,14),
(1,15),
(1,16),
(1,17),
(1,18),
(1,19),
(1,20),
(1,21),
(1,22),
(1,23),
(2,1),
(2,2),
(2,3),
(2,4),
(2,5),
(2,6),
(2,7),
(2,8),
(2,9),
(2,10),
(2,11),
(2,12),
(2,13),
(2,14),
(2,15),
(2,16),
(2,17),
(2,18),
(2,19),
(2,20),
(2,21),
(2,22),
(2,23),
(3,2),
(3,6),
(3,7),
(3,8),
(3,9),
(3,10),
(3,11),
(3,12),
(3,21);

INSERT INTO `COUNTRY` (`COUNTRY_ID`,`COUNTRY_CODE`,`COUNTRY_NAME`,`ISO_CODE`) values
(1,'AF','AFGHANISTAN',''),
(2,'AX','ALAND ISLANDS',''),
(3,'AL','ALBANIA',''),
(4,'DZ','ALGERIA',''),
(5,'AS','AMERICAN SAMOA',''),
(6,'AD','ANDORRA',''),
(7,'AO','ANGOLA',''),
(8,'AI','ANGUILLA',''),
(9,'AG','ANTIGUA AND BARBUDA',''),
(10,'AR','ARGENTINA',''),
(11,'AM','ARMENIA',''),
(12,'AW','ARUBA',''),
(13,'AU','AUSTRALIA',''),
(14,'AT','AUSTRIA',''),
(15,'AZ','AZERBAIJAN',''),
(16,'BS','BAHAMAS',''),
(17,'BH','BAHRAIN',''),
(18,'BD','BANGLADESH',''),
(19,'BB','BARBADOS',''),
(20,'BY','BELARUS',''),
(21,'BE','BELGIUM',''),
(22,'BZ','BELIZE',''),
(23,'BJ','BENIN',''),
(24,'BM','BERMUDA',''),
(25,'BT','BHUTAN',''),
(26,'BO','PLURINATIONAL STATE OF BOLIVIA',''),
(27,'BQ','SINT EUSTATIUS AND SABA BONAIRE',''),
(28,'BA','BOSNIA AND HERZEGOVINA',''),
(29,'BW','BOTSWANA',''),
(30,'BV','BOUVET ISLAND',''),
(31,'BR','BRAZIL',''),
(32,'IO','BRITISH INDIAN OCEAN TERRITORY',''),
(33,'BN','BRUNEI DARUSSALAM',''),
(34,'BG','BULGARIA',''),
(35,'BF','BURKINA FASO',''),
(36,'BI','BURUNDI',''),
(37,'KH','CAMBODIA',''),
(38,'CM','CAMEROON',''),
(39,'CA','CANADA',''),
(40,'CV','CAPE VERDE',''),
(41,'KY','CAYMAN ISLANDS',''),
(42,'CF','CENTRAL AFRICAN REPUBLIC',''),
(43,'TD','CHAD',''),
(44,'CL','CHILE',''),
(45,'CN','CHINA',''),
(46,'CX','CHRISTMAS ISLAND',''),
(47,'CC','COCOS & KEELING ISLANDS',''),
(48,'CO','COLOMBIA',''),
(49,'KM','COMOROS',''),
(50,'CG','CONGO',''),
(51,'CD','THE DEMOCRATIC REPUBLIC OF THE CONGO',''),
(52,'CK','COOK ISLANDS',''),
(53,'CR','COSTA RICA',''),
(54,'CI','COTE D`IVOIRE',''),
(55,'HR','CROATIA',''),
(56,'CU','CUBA',''),
(57,'CW','CURAEAO',''),
(58,'CY','CYPRUS',''),
(59,'CZ','CZECH REPUBLIC',''),
(60,'DK','DENMARK',''),
(61,'DJ','DJIBOUTI',''),
(62,'DM','DOMINICA',''),
(63,'DO','DOMINICAN REPUBLIC',''),
(64,'EC','ECUADOR',''),
(65,'EG','EGYPT',''),
(66,'SV','EL SALVADOR',''),
(67,'GQ','EQUATORIAL GUINEA',''),
(68,'ER','ERITREA',''),
(69,'EE','ESTONIA',''),
(70,'ET','ETHIOPIA',''),
(71,'FK','FALKLAND ISLANDS - MALVINAS',''),
(72,'FO','FAROE ISLANDS',''),
(73,'FJ','FIJI',''),
(74,'FI','FINLAND',''),
(75,'FR','FRANCE',''),
(76,'GF','FRENCH GUIANA',''),
(77,'PF','FRENCH POLYNESIA',''),
(78,'TF','FRENCH SOUTHERN TERRITORIES',''),
(79,'GA','GABON',''),
(80,'GM','GAMBIA',''),
(81,'GE','GEORGIA',''),
(82,'DE','GERMANY',''),
(83,'GH','GHANA',''),
(84,'GI','GIBRALTAR',''),
(85,'GR','GREECE',''),
(86,'GL','GREENLAND',''),
(87,'GD','GRENADA',''),
(88,'GP','GUADELOUPE',''),
(89,'GU','GUAM',''),
(90,'GT','GUATEMALA',''),
(91,'GG','GUERNSEY',''),
(92,'GN','GUINEA',''),
(93,'GW','GUINEA-BISSAU',''),
(94,'GY','GUYANA',''),
(95,'HT','HAITI',''),
(96,'HM','HEARD ISLAND AND MCDONALD ISLANDS',''),
(97,'VA','VATICAN CITY STATE',''),
(98,'HN','HONDURAS',''),
(99,'HK','HONG KONG',''),
(100,'HU','HUNGARY',''),
(101,'IS','ICELAND',''),
(102,'IN','INDIA',''),
(103,'ID','INDONESIA',''),
(104,'IR','ISLAMIC REPUBLIC OF IRAN',''),
(105,'IQ','IRAQ',''),
(106,'IE','IRELAND',''),
(107,'IM','ISLE OF MAN',''),
(108,'IL','ISRAEL',''),
(109,'IT','ITALY',''),
(110,'JM','JAMAICA',''),
(111,'JP','JAPAN',''),
(112,'JE','JERSEY',''),
(113,'JO','JORDAN',''),
(114,'KZ','KAZAKHSTAN',''),
(115,'KE','KENYA',''),
(116,'KI','KIRIBATI',''),
(117,'KP','DPR KOREA',''),
(118,'KR','REPUBLIC OF KOREA',''),
(119,'KW','KUWAIT',''),
(120,'KG','KYRGYZSTAN',''),
(121,'LA','LAO DPR',''),
(122,'LV','LATVIA',''),
(123,'LB','LEBANON',''),
(124,'LS','LESOTHO',''),
(125,'LR','LIBERIA',''),
(126,'LY','LIBYA',''),
(127,'LI','LIECHTENSTEIN',''),
(128,'LT','LITHUANIA',''),
(129,'LU','LUXEMBOURG',''),
(130,'MO','MACAO',''),
(131,'MK','THE FORMER YUGOSLAV REPUBLIC OF MACEDONIA',''),
(132,'MG','MADAGASCAR',''),
(133,'MW','MALAWI',''),
(134,'MY','MALAYSIA',''),
(135,'MV','MALDIVES',''),
(136,'ML','MALI',''),
(137,'MT','MALTA',''),
(138,'MH','MARSHALL ISLANDS',''),
(139,'MQ','MARTINIQUE',''),
(140,'MR','MAURITANIA',''),
(141,'MU','MAURITIUS',''),
(142,'YT','MAYOTTE',''),
(143,'MX','MEXICO',''),
(144,'FM','FEDERATED STATES OF MICRONESIA',''),
(145,'MD','REPUBLIC OF MOLDOVA',''),
(146,'MC','MONACO',''),
(147,'MN','MONGOLIA',''),
(148,'ME','MONTENEGRO',''),
(149,'MS','MONTSERRAT',''),
(150,'MA','MOROCCO',''),
(151,'MZ','MOZAMBIQUE',''),
(152,'MM','MYANMAR',''),
(153,'NA','NAMIBIA',''),
(154,'NR','NAURU',''),
(155,'NP','NEPAL',''),
(156,'NL','NETHERLANDS',''),
(157,'NC','NEW CALEDONIA',''),
(158,'NZ','NEW ZEALAND',''),
(159,'NI','NICARAGUA',''),
(160,'NE','NIGER',''),
(161,'NG','NIGERIA',''),
(162,'NU','NIUE',''),
(163,'NF','NORFOLK ISLAND',''),
(164,'MP','NORTHERN MARIANA ISLANDS',''),
(165,'NO','NORWAY',''),
(166,'OM','OMAN',''),
(167,'PK','PAKISTAN',''),
(168,'PW','PALAU',''),
(169,'PS','OCCUPIED PALESTINIAN TERRITORY',''),
(170,'PA','PANAMA',''),
(171,'PG','PAPUA NEW GUINEA',''),
(172,'PY','PARAGUAY',''),
(173,'PE','PERU',''),
(174,'PH','PHILIPPINES',''),
(175,'PN','PITCAIRN',''),
(176,'PL','POLAND',''),
(177,'PT','PORTUGAL',''),
(178,'PR','PUERTO RICO',''),
(179,'QA','QATAR',''),
(180,'RE','REUNION',''),
(181,'RO','ROMANIA',''),
(182,'RU','RUSSIAN FEDERATION',''),
(183,'RW','RWANDA',''),
(184,'BL','SAINT BARTHELEMY',''),
(185,'SH','SAINT HELENA - ASCENSION AND TRISTAN DA CUNHA',''),
(186,'KN','SAINT KITTS AND NEVIS',''),
(187,'LC','SAINT LUCIA',''),
(188,'MF','SAINT MARTIN - FRENCH PART',''),
(189,'PM','SAINT PIERRE AND MIQUELON',''),
(190,'VC','SAINT VINCENT AND THE GRENADINES',''),
(191,'WS','SAMOA',''),
(192,'SM','SAN MARINO',''),
(193,'ST','SAO TOME AND PRINCIPE',''),
(194,'SA','SAUDI ARABIA',''),
(195,'SN','SENEGAL',''),
(196,'RS','SERBIA',''),
(197,'SC','SEYCHELLES',''),
(198,'SL','SIERRA LEONE',''),
(199,'SG','SINGAPORE',''),
(200,'SX','SINT MAARTEN - DUTCH PART',''),
(201,'SK','SLOVAKIA',''),
(202,'SI','SLOVENIA',''),
(203,'SB','SOLOMON ISLANDS',''),
(204,'SO','SOMALIA',''),
(205,'ZA','SOUTH AFRICA',''),
(206,'GS','SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS',''),
(207,'SS','SOUTH SUDAN',''),
(208,'ES','SPAIN',''),
(209,'LK','SRI LANKA',''),
(210,'SD','SUDAN',''),
(211,'SR','SURINAME',''),
(212,'SJ','SVALBARD AND JAN MAYEN',''),
(213,'SZ','SWAZILAND',''),
(214,'SE','SWEDEN',''),
(215,'CH','SWITZERLAND',''),
(216,'SY','SYRIAN ARAB REPUBLIC',''),
(217,'TW','TAIWAN - REPLUBLIC OF CHINA',''),
(218,'TJ','TAJIKISTAN',''),
(219,'TZ','UNITED REPUBLIC OF TANZANIA',''),
(220,'TH','THAILAND',''),
(221,'TL','TIMOR-LESTE',''),
(222,'TG','TOGO',''),
(223,'TK','TOKELAU',''),
(224,'TO','TONGA',''),
(225,'TT','TRINIDAD AND TOBAGO',''),
(226,'TN','TUNISIA',''),
(227,'TR','TURKEY',''),
(228,'TM','TURKMENISTAN',''),
(229,'TC','TURKS AND CAICOS ISLANDS',''),
(230,'TV','TUVALU',''),
(231,'UG','UGANDA',''),
(232,'UA','UKRAINE',''),
(233,'AE','UNITED ARAB EMIRATES',''),
(234,'GB','UNITED KINGDOM',''),
(235,'US','UNITED STATES',''),
(236,'UM','UNITED STATES MINOR OUTLYING ISLANDS',''),
(237,'UY','URUGUAY',''),
(238,'UZ','UZBEKISTAN',''),
(239,'VU','VANUATU',''),
(240,'VE','BOLIVARIAN REPUBLIC OF VENEZUELA',''),
(241,'VN','VIET NAM',''),
(242,'VG','BRITISH VIRGIN ISLANDS',''),
(243,'VI','U.S. VIRGIN ISLANDS',''),
(244,'WF','WALLIS AND FUTUNA',''),
(245,'EH','WESTERN SAHARA',''),
(246,'YE','YEMEN',''),
(247,'ZM','ZAMBIA',''),
(248,'ZW','ZIMBABWE','');

INSERT INTO `WILEY_OFFICES` (`OFFICE_ID`, `OFFICE_NAME`, `TIME_DIFF_TO_EST`) values
(1, 'Australia-Brisbane', 0),
(2, 'Australia-Melbourne', 0),
(3, 'Cabada-Etobicoke', 0),
(4, 'Canada-Mississauga', 0),
(5, 'China-Beijing', -12),
(6, 'China-Shanghai', -12),
(7, 'Denmark-Copenhagen', -6),
(8, 'Denmark-Frederiksberg', -6),
(9, 'UAE-Dubai', -8),
(10, 'Germany-Berlin', -6),
(11, 'Germany-Weinheim', -6),
(12, 'Hong Kong-Kowloon', -12),
(13, 'India-Bangalore', -9.5),
(14, 'India-Mumbai', -9.5),
(15, 'India-New Delhi', -9.5),
(16, 'Indonesia-Tangerang', -11),
(17, 'Japan-Tokyo', -13),
(18, 'Malaysia', -12),
(19, 'Philippines', -12),
(20, 'Republic of Korea-Seoul', -13),
(21, 'Russia-Moscow', -8),
(22, 'Singapore', -12),
(23, 'Spain-Madrid', -6),
(24, 'Switzerland-Zurich', -6),
(25, 'Taiwan-Taipei', -12),
(26, 'Thailand-Bangkok', -11),
(27, 'UK-Bognor Regis', -5),
(28, 'UK-Chichester', -5),
(29, 'UK-Ealing', -5),
(30, 'UK-Edinburg', -5),
(31, 'UK-London', -5),
(32, 'UK-Oxford', -5),
(33, 'US-Ames', 1),
(34, 'US-Austin', 1),
(35, 'US-Charlottesville', 0),
(36, 'US-DeKalb', 1),
(37, 'US-Edison', 0),
(38, 'US-Harrisonburg', 0),
(39, 'US-Hoboken', 0),
(40, 'US-Indianapolis', 0),
(41, 'US-Malden', 0),
(42, 'US-Minneapolis', 1),
(43, 'US-New York', 0),
(44, 'US-San Francisco', 3),
(45, 'US-Somerset', 0);

INSERT INTO `USER` (`USR_ID`,`USER_NAME`,`PASSWORD`,`NAME`,`PHONE_NO`,`MOBILE_NO`,`IS_ACTIVE`,`IS_KEY_CONTACT`,`COUNTRY_ID`,`CREATED_BY`,`CREATED_DATE`,`UPDATED_BY`,`UPDATED_DATE`,`ROLE_ID`) values 
(1,'sadmin@wiley.com','bef0dd3f3c768c6b09d8ab4dacd6b1a8','Super Admin','77777777','888888888',1,0,1,'SYSTEM',NOW(),'SYSTEM',NOW(),1),
(2,'pa@wiley.com','bef0dd3f3c768c6b09d8ab4dacd6b1a8','Project Admin','77777777','888888888',1,0,1,'SYSTEM',NOW(),'SYSTEM',NOW(),1),
(3,'requestor@wiley.com','bef0dd3f3c768c6b09d8ab4dacd6b1a8','Project Requestor','77777777','888888888',1,0,1,'SYSTEM',NOW(),'SYSTEM',NOW(),1),
(4,'dpak@mps.com','0192023a7bbd73250516f069df18b500','Deepak Garg','77777777','888888888',1,0,1,'sadmin@wiley.com',NOW(),'sadmin@wiley.com',NOW(),1);

INSERT INTO `PROJECT_SEQUENCE` (`PROJECT_ID`) values ('0');

INSERT INTO `WEBSITE_EXCEPTION_MESSAGE` (`EXCEPTION_EVENT`,`EXCEPTION_TEXT`) values
('Available Date Not Reached','Downloads would be Available from "Available Date", Kindly come back Later'),
('Project Expired','Downloads no more Available'),
('Project Not Active','Downloads have still not been Enabled, Kindly Try Later'),
('No Downloads Available','All Downloads have been Used');

INSERT INTO `DYNAMIC_FIELDS` (`FLD_ID`,`FLD_NAME`,`FLD_TYPE`) VALUES
(1,'Name','TEXT'),
(2,'Email','TEXT'),
(3,'Mobile','TEXT'),
(4,'Address','BIGTEXT'),
(5,'Address Line 2','BIGTEXT'),
(6,'City','TEXT'),
(7,'State','TEXT'),
(8,'Country','DROPDOWN'),
(9,'Promo Codes','TEXT'),
(10,'Gender','RADIO'),
(11,'Where did you hear about us','DROPDOWN'),
(12,'Do you want us to contact you','RADIO'),
(13,'Phone','TEXT'),
(14,'Company','TEXT');

INSERT INTO `WEBSITE_TEMPLATE` (`TEMPLATE_ID`,`PROJECT_ID`,`NAME`,`TYPE`,`CATEGORY`,`TITLE`,`DESCRIPTION`,`PAGE_COUNT`,`CREATED_BY`,`CREATED_DATE`,`UPDATED_BY`,`UPDATED_DATE`) VALUES
(1,NULL,'template_1_page1','SYSTEM','SINGLE','Title 1','DESCRIPTION 1',2,'System',NOW(),'System',NOW()),
(2,NULL,'template_2_page1','SYSTEM','SINGLE','Title 2','DESCRIPTION 2',2,'System',NOW(),'System',NOW()),
(3,NULL,'template_3_page1','SYSTEM','SINGLE','Title 3','DESCRIPTION 3',2,'System',NOW(),'System',NOW()),
(4,NULL,'template_4_page1','SYSTEM','SINGLE','Title 4','DESCRIPTION 4',2,'System',NOW(),'System',NOW()),
(5,NULL,'template_5_page1','SYSTEM','SINGLE','Title 5','DESCRIPTION 5',2,'System',NOW(),'System',NOW()),
(6,NULL,'template_6_page1','SYSTEM','SINGLE','Title 6','DESCRIPTION 6',2,'System',NOW(),'System',NOW()),
(7,NULL,'template_7_page1','SYSTEM','SINGLE','Title 7','DESCRIPTION 7',2,'System',NOW(),'System',NOW()),
(8,NULL,'template_8_page1','SYSTEM','SINGLE','Title 8','DESCRIPTION 8',2,'System',NOW(),'System',NOW()),
(9,NULL,'template_9_page1','SYSTEM','SINGLE','Title 9','DESCRIPTION 9',2,'System',NOW(),'System',NOW()),
(10,NULL,'template_multi_1_page1','SYSTEM','MULTI','Title 10','DESCRIPTION 10',3,'System',NOW(),'System',NOW()),
(11,NULL,'template_multi_2_page1','SYSTEM','MULTI','Title 11','DESCRIPTION 11',4,'System',NOW(),'System',NOW());