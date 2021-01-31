<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
					
	<sjg:grid id="gridedittable"
    	caption=""
    	dataType="json"
    	href="%{remoteurl}"
    	pager="true"
    	navigator="true"
    	navigatorAddOptions="{height:325,reloadAfterSubmit:true}"
    	navigatorEditOptions="{height:325,reloadAfterSubmit:true,closeAfterEdit:true}"
    	navigatorDeleteOptions="{height:100,reloadAfterSubmit:true}"
    	navigatorEdit="true"
    	navigatorDelete="true"
    	navigatorSearch="false"
    	navigatorView="false"
    	navigatorRefresh="false"
    	gridModel="keyContactGridModel"
    	rowList="5,10,20"
    	rowNum="10"
    	editurl="%{editurl}"
    	editinline="false"
    	onSelectRowTopics="rowselect"
    	viewrecords="true"
		height="110"
		width="878"		
    	shrinkToFit="false">
    	
    	<sjg:gridColumn name="kcId" index="kcId" title="KC ID" width="150" editable="true" formatter="integer" key="true" hidden="true"/>
		<sjg:gridColumn name="customer" index="customer" title="Customer Id" editable="true" width="150" formatter="integer" hidden="true"/>
		
<%-- 	<sjg:gridColumn name="country" index="country" key="countryId" value="countryName" label="Country" title="Country" editable="true" edittype="select"  editoptions="{countries}" sortable="false" search="false"/> --%>
		
    	<sjg:gridColumn name="name" index="name" title="Name" width="150" editable="true" editoptions="{size:22}" sortable="true" formoptions=" {label:'Name *'}" editrules="{ required: true }"/>
    	<sjg:gridColumn name="password" index="password" title="Password" width="170" editable="true" editoptions="{size:22}" hidden="true"/>
    	<sjg:gridColumn name="phoneNo" index="phoneNo" title="Phone Number" width="150" editable="true" editoptions="{size:22}" formoptions=" {label:'Phone Number *'}" editrules="{ required: true }"/>
    	<sjg:gridColumn name="mobileNo" index="mobileNo" title="Mobile" width="150" editable="true" editoptions="{size:22}"/>
    	<sjg:gridColumn name="email" index="email" title="Email Address" width="250" editable="true" editoptions="{size:22}" formoptions=" {label:'Email Address *'}" editrules="{ required:true,  email:true}"/>
    	<sjg:gridColumn name="address" index="address" title="Address" width="170" editable="true" editoptions="{size:22}"/>
    	<sjg:gridColumn name="city" index="city" title="City" width="170" editable="true" editoptions="{size:22}"/>
    	<sjg:gridColumn name="state" index="state" title="State" width="170" editable="true" editoptions="{size:22}"/>
    	
		<sjg:gridColumn name="country" index="country" title="Country" editable="true" edittype="select" 
						editoptions="{value:':Select Country;1:AFGHANISTAN;2:ALAND ISLANDS;3:ALBANIA;4:ALGERIA;5:AMERICAN SAMOA;6:ANDORRA;7:ANGOLA;8:ANGUILLA;9:ANTIGUA AND BARBUDA;10:ARGENTINA;11:ARMENIA;12:ARUBA;13:AUSTRALIA;14:AUSTRIA;15:AZERBAIJAN;16:BAHAMAS;17:BAHRAIN;18:BANGLADESH;19:BARBADOS;20:BELARUS;21:BELGIUM;22:BELIZE;23:BENIN;24:BERMUDA;25:BHUTAN;240:BOLIVARIAN REPUBLIC OF VENEZUELA;28:BOSNIA AND HERZEGOVINA;29:BOTSWANA;30:BOUVET ISLAND;31:BRAZIL;32:BRITISH INDIAN OCEAN TERRITORY;242:BRITISH VIRGIN ISLANDS;33:BRUNEI DARUSSALAM;34:BULGARIA;35:BURKINA FASO;36:BURUNDI;37:CAMBODIA;38:CAMEROON;39:CANADA;40:CAPE VERDE;41:CAYMAN ISLANDS;42:CENTRAL AFRICAN REPUBLIC;43:CHAD;44:CHILE;45:CHINA;46:CHRISTMAS ISLAND;47:COCOS AND KEELING ISLANDS;48:COLOMBIA;49:COMOROS;50:CONGO;52:COOK ISLANDS;53:COSTA RICA;54:COTE D`IVOIRE;55:CROATIA;56:CUBA;57:CURAEAO;58:CYPRUS;59:CZECH REPUBLIC;60:DENMARK;61:DJIBOUTI;62:DOMINICA;63:DOMINICAN REPUBLIC;117:DPR KOREA;64:ECUADOR;65:EGYPT;66:EL SALVADOR;67:EQUATORIAL GUINEA;68:ERITREA;69:ESTONIA;70:ETHIOPIA;71:FALKLAND ISLANDS - MALVINAS;72:FAROE ISLANDS;144:FEDERATED STATES OF MICRONESIA;73:FIJI;74:FINLAND;75:FRANCE;76:FRENCH GUIANA;77:FRENCH POLYNESIA;78:FRENCH SOUTHERN TERRITORIES;79:GABON;80:GAMBIA;81:GEORGIA;82:GERMANY;83:GHANA;84:GIBRALTAR;85:GREECE;86:GREENLAND;87:GRENADA;88:GUADELOUPE;89:GUAM;90:GUATEMALA;91:GUERNSEY;92:GUINEA;93:GUINEA-BISSAU;94:GUYANA;95:HAITI;96:HEARD ISLAND AND MCDONALD ISLANDS;98:HONDURAS;99:HONG KONG;100:HUNGARY;101:ICELAND;102:INDIA;103:INDONESIA;105:IRAQ;106:IRELAND;104:ISLAMIC REPUBLIC OF IRAN;107:ISLE OF MAN;108:ISRAEL;109:ITALY;110:JAMAICA;111:JAPAN;112:JERSEY;113:JORDAN;114:KAZAKHSTAN;115:KENYA;116:KIRIBATI;119:KUWAIT;120:KYRGYZSTAN;121:LAO DPR;122:LATVIA;123:LEBANON;124:LESOTHO;125:LIBERIA;126:LIBYA;127:LIECHTENSTEIN;128:LITHUANIA;129:LUXEMBOURG;130:MACAO;132:MADAGASCAR;133:MALAWI;134:MALAYSIA;135:MALDIVES;136:MALI;137:MALTA;138:MARSHALL ISLANDS;139:MARTINIQUE;140:MAURITANIA;141:MAURITIUS;142:MAYOTTE;143:MEXICO;146:MONACO;147:MONGOLIA;148:MONTENEGRO;149:MONTSERRAT;150:MOROCCO;151:MOZAMBIQUE;152:MYANMAR;153:NAMIBIA;154:NAURU;155:NEPAL;156:NETHERLANDS;157:NEW CALEDONIA;158:NEW ZEALAND;159:NICARAGUA;160:NIGER;161:NIGERIA;162:NIUE;163:NORFOLK ISLAND;164:NORTHERN MARIANA ISLANDS;165:NORWAY;169:OCCUPIED PALESTINIAN TERRITORY;166:OMAN;167:PAKISTAN;168:PALAU;170:PANAMA;171:PAPUA NEW GUINEA;172:PARAGUAY;173:PERU;174:PHILIPPINES;175:PITCAIRN;26:PLURINATIONAL STATE OF BOLIVIA;176:POLAND;177:PORTUGAL;178:PUERTO RICO;179:QATAR;118:REPUBLIC OF KOREA;145:REPUBLIC OF MOLDOVA;180:REUNION;181:ROMANIA;182:RUSSIAN FEDERATION;183:RWANDA;184:SAINT BARTHELEMY;185:SAINT HELENA - ASCENSION AND TRISTAN DA CUNHA;186:SAINT KITTS AND NEVIS;187:SAINT LUCIA;188:SAINT MARTIN - FRENCH PART;189:SAINT PIERRE AND MIQUELON;190:SAINT VINCENT AND THE GRENADINES;191:SAMOA;192:SAN MARINO;193:SAO TOME AND PRINCIPE;194:SAUDI ARABIA;195:SENEGAL;196:SERBIA;197:SEYCHELLES;198:SIERRA LEONE;199:SINGAPORE;27:SINT EUSTATIUS AND SABA BONAIRE;200:SINT MAARTEN - DUTCH PART;201:SLOVAKIA;202:SLOVENIA;203:SOLOMON ISLANDS;204:SOMALIA;205:SOUTH AFRICA;206:SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS;207:SOUTH SUDAN;208:SPAIN;209:SRI LANKA;210:SUDAN;211:SURINAME;212:SVALBARD AND JAN MAYEN;213:SWAZILAND;214:SWEDEN;215:SWITZERLAND;216:SYRIAN ARAB REPUBLIC;217:TAIWAN - REPLUBLIC OF CHINA;218:TAJIKISTAN;220:THAILAND;51:THE DEMOCRATIC REPUBLIC OF THE CONGO;131:THE FORMER YUGOSLAV REPUBLIC OF MACEDONIA;221:TIMOR-LESTE;222:TOGO;223:TOKELAU;224:TONGA;225:TRINIDAD AND TOBAGO;226:TUNISIA;227:TURKEY;228:TURKMENISTAN;229:TURKS AND CAICOS ISLANDS;230:TUVALU;243:U.S. VIRGIN ISLANDS;231:UGANDA;232:UKRAINE;233:UNITED ARAB EMIRATES;234:UNITED KINGDOM;219:UNITED REPUBLIC OF TANZANIA;235:UNITED STATES;236:UNITED STATES MINOR OUTLYING ISLANDS;237:URUGUAY;238:UZBEKISTAN;239:VANUATU;97:VATICAN CITY STATE;241:VIET NAM;244:WALLIS AND FUTUNA;245:WESTERN SAHARA;246:YEMEN;247:ZAMBIA;248:ZIMBABWE', size:22}" 
						sortable="false" search="false" formoptions=" {label:'Country *'}" formatter="select" editrules="{required: true}"/>
    	
    	<sjg:gridColumn name="zipCode" index="zipCode" title="Post/Zip Code" width="150" editable="true" editoptions="{size:22}"/>
    	
    	
    	
	</sjg:grid>
				      
	
