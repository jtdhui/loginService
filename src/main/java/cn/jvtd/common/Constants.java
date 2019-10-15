package cn.jvtd.common;

public interface Constants {
	public final static int MSG_REALTIME_REFRESHTIME=1000*10;

	// 默认系统用户id
	public final static Long DEFAULT_SYSTEM_USER=-1L;

	// 默认系统超级管理员
	public final static Long DEFAULT_SYSTEM_SUPER_MANAGER = 0L;

	//public final static String COMMON_CODE_Separator="⊙";
	public final static String COMMON_CODE_Separator=",";
	public final static String COMMON_STRING_Separator="㊣";
	public final static String COMMON_FILE_Separator=";";

	// 参数类型值
	public final static String PARAM_TYPE_VALUE_fixed="fixed";//固定的
	public final static String PARAM_TYPE_VALUE_extend="extend";//可扩展的

	/*******************************************XXX 参数类型定义*****************************************************/
	// 参数类型
	public final static String PARAM_TYPE="param_type";//参数类型
	public final static String PARAM_TYPE_logic 					="logic"; 					//逻辑判断
	public final static String PARAM_TYPE_gender 					="gender"; 					//性别代码
	public final static String PARAM_TYPE_cust_level 				="cust_level"; 				//客户级别
	public final static String PARAM_TYPE_relation_operator 		="relation_operator"; 		//关系运算符
	public final static String PARAM_TYPE_data_type					="data_type";				//数据类型
	public final static String PARAM_TYPE_show_type					="show_type";  				//显示方式
	public final static String PARAM_TYPE_validate_type				="validate_type";  			//数据校验方式
	public final static String PARAM_TYPE_user_level				="user_level";  			//用户级别
	public final static String PARAM_TYPE_task_state				="task_state";  			//工作流任务状态
	public final static String PARAM_TYPE_inst_state				="inst_state";				//案例状态
	public final static String PARAM_TYPE_inst_type 				="inst_type"; 				//案例类型
	public final static String PARAM_TYPE_ib_interaction_state		="ib_interaction_state";	//来访沟通状态
	public final static String PARAM_TYPE_ob_interaction_state		="ob_interaction_state";	//出访沟通状态
	public final static String PARAM_TYPE_ob_interaction_source		="ob_interaction_source";	//出访沟通来源
	public final static String PARAM_TYPE_chan_channel				="chan_channel";			//沟通渠道
	public final static String PARAM_TYPE_chan_dir					="chan_dir";				//沟通方向
	public final static String PARAM_TYPE_access_type				="access_type";				//界面数据访问权限
	public final static String PARAM_TYPE_kbs_node_state			="kbs_node_state";			//知识点状态
	public final static String PARAM_TYPE_pk_type					="pk_type";					//BOP主键生成方式
	public final static String PARAM_TYPE_security_policy			="security_policy";			//安全策略参数
	public final static String PARAM_TYPE_busi_module				="busi_module";  			//系统业务模块
	public final static String PARAM_TYPE_db_type 					="db_type"; 				//数据库类型
	public final static String PARAM_TYPE_question_type 			="question_type"; 			//题目类型
	public final static String PARAM_TYPE_option_type				="option_type";				//选项类型
	public final static String PARAM_TYPE_report_type				="report_type";				//报告类型
	public final static String PARAM_TYPE_ftp_account_type			="ftp_account_type";		//ftp账户类型
	public final static String PARAM_TYPE_sms_vendor				="sms_vendor";				//短信供应商
	public final static String PARAM_TYPE_template_type				="template_type";			//模板类型
	public final static String PARAM_TYPE_region_zone				="region_zone";				//大区
	public final static String PARAM_TYPE_holiday_type 				="holiday_type"; 			//假期类型
	public final static String PARAM_TYPE_continent_type			="continent_type";			//大洲
	// 活动参数类型
	public final static String PARAM_TYPE_campaign_state			="campaign_state";			//活动状态
	public final static String PARAM_TYPE_campaign_type				="campaign_type";			//活动类型
	public final static String PARAM_TYPE_campaign_run_mode			="campaign_run_mode";		//活动执行方式
	public final static String PARAM_TYPE_campaign_run_cycle		="campaign_run_cycle";		//活动执行周期
	// 数据data配置相关参数类型
	public final static String PARAM_TYPE_data_launch_mode			="data_launch_mode";		//执行方式
	public final static String PARAM_TYPE_data_launch_freq			="data_launch_freq";		//执行频率
	public final static String PARAM_TYPE_data_update_mode			="data_update_mode";		//数据更新方式
	public final static String PARAM_TYPE_import_src_type			="import_src_type";			//导入数据来源
	public final static String PARAM_TYPE_import_value_type 		="import_value_type"; 		//导入数据值类型
	public final static String PARAM_TYPE_export_dest_type 			="export_dest_type"; 		//导出数据目的类型
	public final static String PARAM_TYPE_export_value_type			="export_value_type";		//导出数据值类型
	// 企业参数类型
//	public final static String PARAM_TYPE_org_industry				="org_industry";			//企业-所属行业
//	public final static String PARAM_TYPE_org_type					="org_type";				//企业-类型
//	public final static String PARAM_TYPE_org_scale					="org_scale";				//企业-规模
	// 用户参数类型
	public final static String PARAM_TYPE_user_academic 			="user_academic";			//用户-学历
	public final static String PARAM_TYPE_user_credential_type 		="user_credential_type";	//用户-证件类别
	public final static String PARAM_TYPE_user_language 			="user_language";			//用户-擅长语种
	public final static String PARAM_TYPE_user_service_type 		="user_service_type";		//用户-服务方式
	public final static String PARAM_TYPE_user_hobby 				="user_hobby";				//用户-爱好
	// 服务参数类型
//	public final static String PARAM_TYPE_service_csr_leve 			="service_csr_level"; 		//服务定义扩展-坐席级别要求
//	public final static String PARAM_TYPE_service_lang_skill 		="service_lang_skill"; 		//服务定义扩展-语言要求
//	public final static String PARAM_TYPE_service_chan_type 		="service_chan_type"; 		//服务定义扩展-沟通方式
//	public final static String PARAM_TYPE_service_data_freq 		="service_data_freq"; 		//服务定义扩展-数据提供频率
	// 业务相关参数类型
	public final static String PARAM_TYPE_skill_group				="skill_group";				//技能组
	public final static String PARAM_TYPE_bpm_definition_state 		="definition_state";		//工作流定义状态
	public final static String PARAM_TYPE_bpm_concurrent_state 		="concurrent_state";		//工作流并发案例状态
	
	public final static String PARAM_TYPE_bpm_task_state 			="bpm_task_state";			//表单任务状态
	public final static String PARAM_TYPE_call_ob_task_state 		="call_ob_task_state";		//回访任务状态
	public final static String PARAM_TYPE_dm_send_task_state 		="dm_send_task_state";		//直邮任务状态
	public final static String PARAM_TYPE_sms_send_task_state 		="sms_send_task_state";		//短信发送任务状态
	public final static String PARAM_TYPE_email_send_task_state 	="email_send_task_state";	//邮件发送任务状态
	public final static String PARAM_TYPE_wechat_send_task_state  	="wechat_send_task_state"; 	//微信发送任务状态
	public final static String PARAM_TYPE_weibo_send_task_state 	="weibo_send_task_state";	//微博发送任务状态
	
	public final static String PARAM_TYPE_sms_recv_state 			="sms_recv_state";			//短信接收状态
	public final static String PARAM_TYPE_email_recv_state 			="email_recv_state";		//邮件接收状态
	public final static String PARAM_TYPE_wechat_recv_state 		="wechat_recv_state"; 		//微信接收状态
	public final static String PARAM_TYPE_weibo_recv_state 			="weibo_recv_state";		//微博接收状态
	
	public final static String PARAM_TYPE_cmpn_dataflow_state 		="cmpn_dataflow_state";		//活动执行流程状态
	public final static String PARAM_TYPE_cmpn_runLog_state 		="cmpn_runlog_state";		//活动执行日记状态
	public final static String PARAM_TYPE_cmpn_runStep_state 		="cmpn_runstep_state";		//活动执行明细状态
	
	public final static String PARAM_TYPE_data_clean_flow_state 	="data_cleanflow_state";
	public final static String PARAM_TYPE_data_clean_log_state 		="data_cleanlog_state";
	public final static String PARAM_TYPE_data_clean_step_state 	="data_cleanstep_state";
	
	public final static String PARAM_TYPE_survey_flow_state 		="survey_flow_state"; //问卷流程状态
	
	public final static String PARAM_TYPE_wechat_menu_button_type 	="wechat_menu_button_type";	//微信菜单按钮类型,add by shirely at 2017-7-24

	// 爬取来源
	public final static String PARAM_TYPE_crawler_source_site 		="crawler_source_site";	//爬取来源站点
	public final static String PARAM_TYPE_crawler_runlog_state 		="crawler_runlog_state";//爬取运行日志状态
	public final static String PARAM_TYPE_crawler_task_state 		="crawler_task_state";	//爬取业务任务状态

	/******************************************XXX 参数定义******************************************************/
	// 关系运算符
	public final static String PARAM_RELATION_OPERATOR_greaterEqual ="greaterEqual";//大于等于
	public final static String PARAM_RELATION_OPERATOR_greaterThan	="greaterThan";//大于
	public final static String PARAM_RELATION_OPERATOR_equal		="equal";//等于；同时支持多选，条件将分割为(column='value1' or column='value2' or column='value3')
	public final static String PARAM_RELATION_OPERATOR_notEqual		="notEqual";//不等于；同时支持多选，条件将分割为(column<>'value1' and column<>'value2' and column<>'value3')
	public final static String PARAM_RELATION_OPERATOR_lessEqual	="lessEqual";//小于等于
	public final static String PARAM_RELATION_OPERATOR_lessThan		="lessThan";//小于
	public final static String PARAM_RELATION_OPERATOR_between		="between";//介于
	public final static String PARAM_RELATION_OPERATOR_include		="include";//包含(like '%value%')；同时支持多选，条件将分割为(column like '%,value1,%' and column like '%,value2,%')
	public final static String PARAM_RELATION_OPERATOR_exclude		="exclude";//不包含(not like '%value%')；同时支持多选，条件将分割为(column not like '%,value1,%' and column not like '%,value2,%')
	public final static String PARAM_RELATION_OPERATOR_in			="in";//in或，相当于多选的等于，使用英文逗号","将值分割为多个条件：(column='value1' or column='value2' or column='value3')

	// 数据类型
	public final static String PARAM_DATA_TYPE_datetime="datetime";//日期
	public final static String PARAM_DATA_TYPE_number="number";//数字SQLSERVER 38 采用numeric存储
	public final static String PARAM_DATA_TYPE_text="text";//文本

	// 显示方式
	public final static String PARAM_SHOW_TYPE_text="text";//单行文本
	public final static String PARAM_SHOW_TYPE_textarea="textarea";//多行文本
	public final static String PARAM_SHOW_TYPE_kindeditor="editor";//文本编辑器、新增
	public final static String PARAM_SHOW_TYPE_date="date";//日期选择框
	public final static String PARAM_SHOW_TYPE_datetime="datetime";//日期时间选择框
	public final static String PARAM_SHOW_TYPE_select="select";//下拉列表
	public final static String PARAM_SHOW_TYPE_tree="tree";//分级树
	public final static String PARAM_SHOW_TYPE_radio="radio";//单选框
	public final static String PARAM_SHOW_TYPE_checkbox="checkbox";//复选框
	public final static String PARAM_SHOW_TYPE_file="file";//文件
	public final static String PARAM_SHOW_TYPE_url="url";//url
	public final static String PARAM_SHOW_TYPE_treeDialog="treeDialog";//弹出选择框

	// 数据校验方式
	public final static String PARAM_VALIDATE_TYPE_null="0";//无校验
	public final static String PARAM_VALIDATE_TYPE_postcode="postcode";//邮政编码
	public final static String PARAM_VALIDATE_TYPE_tele="tele";//电话号码
	public final static String PARAM_VALIDATE_TYPE_phone="phone";//固定电话
	public final static String PARAM_VALIDATE_TYPE_mobile="mobile";//手机
	public final static String PARAM_VALIDATE_TYPE_email="email";//EMAIL
	public final static String PARAM_VALIDATE_TYPE_date="date";//日期
	public final static String PARAM_VALIDATE_TYPE_datetime="datetime";//时间日期
	public final static String PARAM_VALIDATE_TYPE_number="number";//数字
	public final static String PARAM_VALIDATE_TYPE_money="money";//金额
	public final static String PARAM_VALIDATE_TYPE_idcard="idcard";//身份证
	public final static String PARAM_VALIDATE_TYPE_creditcard= "creditcard";//信用卡号16位数字、新增
	public final static String PARAM_VALIDATE_TYPE_ip="ip";//IP地址
	public final static String PARAM_VALIDATE_TYPE_provinceCN="provinceCN";//省
	public final static String PARAM_VALIDATE_TYPE_cityCN="cityCN";//市
	public final static String PARAM_VALIDATE_TYPE_countyCN="countyCN";//县/市辖区
	public final static String PARAM_VALIDATE_TYPE_countryCode="countryCode";//国家代码
	public final static String PARAM_VALIDATE_TYPE_regularExpr="regularExpr";//自定义正则表达式
	public final static String PARAM_VALIDATE_TYPE_customClass="customClass";//自定义类

	// 用户级别
	public final static int PARAM_USER_LEVEL_CSR=0;//坐席
	public final static int PARAM_USER_LEVEL_TL=1;//组长
	public final static int PARAM_USER_LEVEL_Supervisor=2;//主管
	public final static int PARAM_USER_LEVEL_Manager=3;//经理
	public final static int PARAM_USER_LEVEL_SeniorManager=4;//高级经理
	public final static int PARAM_USER_LEVEL_Director=5;//总监
	public final static int PARAM_USER_LEVEL_BrandAdministrator=98;//品牌管理员
	public final static int PARAM_USER_LEVEL_SystemAdministrator=99;//系统管理员

	// 工作流任务状态
	public final static String PARAM_TASK_STATE_waiting="waiting";//待处理
	public final static String PARAM_TASK_STATE_processing="processing";//处理中
	public final static String PARAM_TASK_STATE_completed="completed";//已完成
	public final static String PARAM_TASK_STATE_appoint="appoint";//预约
	public final static String PARAM_TASK_STATE_backed="backed";//退回
	public final static String PARAM_TASK_STATE_canceled="canceled";//已取消
	public final static String PARAM_TASK_STATE_assigning="assigning";//正在分配

	// 案例状态
	public final static String PARAM_INST_STATE_inactive="inactive";//未生效
	public final static String PARAM_INST_STATE_active="active";//未完成
	public final static String PARAM_INST_STATE_ended="ended";//已完成
	public final static String PARAM_INST_STATE_canceled="canceled";//已取消
	public final static String PARAM_INST_STATE_suspend="suspend";//挂起

	// 案例类型
	public final static String PARAM_INST_TYPE_inst="inst";//普通工作流案例
	public final static String PARAM_INST_TYPE_cmpn="cmpn";//活动案例

	// 来访沟通状态
	public final static String PARAM_IB_INTERACTION_STATE_waitAssign="waitAssign";//等待分拣
	public final static String PARAM_IB_INTERACTION_STATE_assigning="assigning";//正在分拣
	public final static String PARAM_IB_INTERACTION_STATE_waitProc="waitProc";//等待处理
	public final static String PARAM_IB_INTERACTION_STATE_processing="processing";//正在处理
	public final static String PARAM_IB_INTERACTION_STATE_successed="successed";//处理完成
	public final static String PARAM_IB_INTERACTION_STATE_abandoned="abandoned";//无效数据
	public final static String PARAM_IB_INTERACTION_STATE_replied="replied";//已回复

	//出访沟通状态
	public final static String PARAM_OB_INTERACTION_STATE_resending="resending";//重新发送
	public final static String PARAM_OB_INTERACTION_STATE_waitSend="waitSend";//等待发送
	public final static String PARAM_OB_INTERACTION_STATE_sending="sending";//正在发送
	public final static String PARAM_OB_INTERACTION_STATE_canceled="canceled";//取消发送
	public final static String PARAM_OB_INTERACTION_STATE_successed="successed";//发送成功
	public final static String PARAM_OB_INTERACTION_STATE_failed="failed";//发送失败

	// 出访沟通来源
	public final static String PARAM_OB_INTERACTION_SOURCE_new="new";//新建
	public final static String PARAM_OB_INTERACTION_SOURCE_resend="resend";//重发

	// 沟通渠道
	public final static String PARAM_CHAN_CHANNEL_call="call";//电话
	public final static String PARAM_CHAN_CHANNEL_sms="sms";//短信
	public final static String PARAM_CHAN_CHANNEL_email="email";//电子邮件
	public final static String PARAM_CHAN_CHANNEL_dm="dm";//直邮、信函
	public final static String PARAM_CHAN_CHANNEL_wechat="wechat";//微信
	public final static String PARAM_CHAN_CHANNEL_livechat="livechat";//在线聊天网站
	public final static String PARAM_CHAN_CHANNEL_fax="fax";//传真
	public final static String PARAM_CHAN_CHANNEL_weibo="weibo";//新浪微博

	// 沟通方向
	public final static String PARAM_CHAN_DIR_inbound="I";//来访
	public final static String PARAM_CHAN_DIR_outbound="O";//出访

	// 界面数据访问权限
	public final static String PARAM_ACCESS_TYPE_write="write";//读写
	public final static String PARAM_ACCESS_TYPE_read="read";//只读
	public final static String PARAM_ACCESS_TYPE_hidden="hidden";//隐藏

	// 知识点状态
	public final static String PARAM_KBS_NODE_STATE_abandoned="0";//已作废
	public final static String PARAM_KBS_NODE_STATE_waitPublish="1";//待发布
	public final static String PARAM_KBS_NODE_STATE_published="2";//已发布
	public final static String PARAM_KBS_NODE_STATE_expired="3";//已过期

	// BOP主键生成方式
	public final static int PARAM_PK_TYPE_normal=0;//顺序递增Normal Sequence
	public final static int PARAM_PK_TYPE_dateFormat=1;//按日递增Date Format Sequence
	public final static int PARAM_PK_TYPE_treeFormat=2;//按层级递增Tree ID Format

	// 安全策略参数
	public final static String PARAM_SECURITY_POLICY_complex="complex";//密码复杂性
	public final static String PARAM_SECURITY_POLICY_complex_disabled="0";//0-禁用（默认）
	public final static String PARAM_SECURITY_POLICY_complex_enabled="1";//1-启用

	public final static String PARAM_SECURITY_POLICY_minLen="minLen";//密码最小长度
	public final static String PARAM_SECURITY_POLICY_minLen_default="6";//6（默认）

	public final static String PARAM_SECURITY_POLICY_histLen="histLen";//强制密码历史
	public final static String PARAM_SECURITY_POLICY_histLen_default="3";//3（建议）
	public final static String PARAM_SECURITY_POLICY_histLen_no="0";//为0表示可使用重复密码

	public final static String PARAM_SECURITY_POLICY_retryTimes="retryTimes";//最大登录失败重试次数
	public final static String PARAM_SECURITY_POLICY_retryTimes_default="3";//3（建议）
	public final static String PARAM_SECURITY_POLICY_retryTimes_no="0";//0表示无限制

	public final static String PARAM_SECURITY_POLICY_validDays="validDays";//密码最长使用天数
	public final static String PARAM_SECURITY_POLICY_validDays_default="90";//90（建议）
	public final static String PARAM_SECURITY_POLICY_validDays_forever="0";//为0表示永远有效

	public final static String PARAM_SECURITY_POLICY_maxOnlineUsers="maxOnlineUsers";//最大在线用户数
	public final static String PARAM_SECURITY_POLICY_maxOnlineUsers_default="100";//100（建议）

	// 系统业务模块
	public final static String PARAM_BUSI_MODULE_bpm="bpm";//工作流
	public final static String PARAM_BUSI_MODULE_campaign="campaign";//活动
	public final static String PARAM_BUSI_MODULE_form="form";//form
	public final static String PARAM_BUSI_MODULE_qa="qa";//质检
	public final static String PARAM_BUSI_MODULE_survey="survey";//问卷

	// 数据库类型
	public final static String PARAM_DB_TYPE_MSSQL="MSSQL";//SQL SERVER
	public final static String PARAM_DB_TYPE_Oracle="Oracle";//Oracle
	public final static String PARAM_DB_TYPE_PostGres="PostGres";//PostGres
	public final static String PARAM_DB_TYPE_MySQL="MySQL";//MySQL

	// 题目类型
	public final static String PARAM_QUESTION_TYPE_single_option="1";//单选题
	public final static String PARAM_QUESTION_TYPE_multi_option="2";//多选题
	public final static String PARAM_QUESTION_TYPE_answer="3";//问答题
	public final static String PARAM_QUESTION_TYPE_end_language="4";//结束语

	// 选项类型
	public final static String PARAM_OPTION_TYPE_option="1";//选择
	public final static String PARAM_OPTION_TYPE_blank="2";//填空

	// 报告类型
	public final static String PARAM_REPORT_TYPE_sql="sql";//普通sql查询报表
	public final static String PARAM_REPORT_TYPE_jor="jor";//JOR报表
	public final static String PARAM_REPORT_TYPE_jasperReport="jasperReport";//JasperReport报表

	// ftp账户类型
	public final static String PARAM_FTP_ACCOUNT_TYPE_sendmail="sendmail";//发送email文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_recvmail="recvmail";//接受email文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_sendfax="sendfax";//发送传真文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_recvfax="recvfax";//接收传真文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_senddm="senddm";//发送直邮文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_repository="repository";//知识库文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_workflow="workflow";//工作流流程文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_cmpnflow="cmpnflow";//活动执行流程文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_datacleanflow="datacleanflow";//数据清洗流程文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_surveyflow="surveyflow";//问卷流程文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_template="template";//模板文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_notify="notify";//通知文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_form="form";//表单文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_import="import";//导入文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_export="export";//导出文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_report="report";//报告文件存储账户
	public final static String PARAM_FTP_ACCOUNT_TYPE_vox="vox";//语音文件存储账号

	public final static String PARAM_FTP_ACCOUNT_TYPE_wechat="wechat";//微信文件存储账户

	//品牌为“CRM的品牌，为3”
	public final static String PARAM_BRAND_ID="3";


	// 短信供应商
	public final static String PARAM_SMS_VENDOR_etone="etone";//移通网络
	public final static String PARAM_SMS_VENDOR_wemedia="wemedia";//WeMedia

	// 模板类型
	public final static String PARAM_TEMPLATE_TYPE_SMS="SMS";//短信
	public final static String PARAM_TEMPLATE_TYPE_MMS="MMS";//彩信
	public final static String PARAM_TEMPLATE_TYPE_EDM="EDM";//电子邮件
	public final static String PARAM_TEMPLATE_TYPE_DM="DM";//信件
	public final static String PARAM_TEMPLATE_TYPE_Wechat="Wechat";//微信
	public final static String PARAM_TEMPLATE_TYPE_Weibo="Weibo";//微博

	// 大区
	public final static String PARAM_REGION_ZONE_East="East";//华东
	public final static String PARAM_REGION_ZONE_South="South";//华南
	public final static String PARAM_REGION_ZONE_Central="Central";//华中
	public final static String PARAM_REGION_ZONE_North="North";//华北
	public final static String PARAM_REGION_ZONE_Northwest="Northwest";//西北
	public final static String PARAM_REGION_ZONE_Southwest="Southwest";//西南
	public final static String PARAM_REGION_ZONE_Northeast="Northeast";//东北
	public final static String PARAM_REGION_ZONE_HMT="HMT";//港澳台

	// 假期类型
	public final static String PARAM_HOLIDAY_TYPE_YuanDan="1";//元旦
	public final static String PARAM_HOLIDAY_TYPE_ChunJie="2";//春节
	public final static String PARAM_HOLIDAY_TYPE_QingMing="3";//清明
	public final static String PARAM_HOLIDAY_TYPE_LaoDong="4";//劳动
	public final static String PARAM_HOLIDAY_TYPE_DuanWu="5";//端午
	public final static String PARAM_HOLIDAY_TYPE_ZhongQiu="6";//中秋
	public final static String PARAM_HOLIDAY_TYPE_GuoQing="7";//国庆

	// 大洲
	public final static String PARAM_CONTINENT_TYPE_Africa="Africa";//非洲
	public final static String PARAM_CONTINENT_TYPE_Asia="Asia";//亚洲
	public final static String PARAM_CONTINENT_TYPE_Europe="Europe";//欧洲
	public final static String PARAM_CONTINENT_TYPE_Oceanica="Oceanica";//大洋洲
	public final static String PARAM_CONTINENT_TYPE_NorthAmerica="North America";//北美洲
	public final static String PARAM_CONTINENT_TYPE_SouthAmerica="South America";//南美洲

	// 活动相关参数
	// 活动状态
	public final static String PARAM_CAMPAIGN_STATE_disabled="0";//禁用
	public final static String PARAM_CAMPAIGN_STATE_enabled="1";//启用
	public final static String PARAM_CAMPAIGN_STATE_dropped="2";//废弃
	// 活动类型
	public final static String PARAM_CAMPAIGN_TYPE_SMS="SMS";//短信
	public final static String PARAM_CAMPAIGN_TYPE_MMS="MMS";//彩信
	public final static String PARAM_CAMPAIGN_TYPE_EDM="EDM";//Email
	public final static String PARAM_CAMPAIGN_TYPE_OB="OB";//OB
	public final static String PARAM_CAMPAIGN_TYPE_DM="DM";//DM
	public final static String PARAM_CAMPAIGN_TYPE_Weibo="Weibo";//微博
	// 活动执行方式
	public final static String PARAM_CAMPAIGN_RUN_MODE_manual="manual";//手工执行
	public final static String PARAM_CAMPAIGN_RUN_MODE_schedule="schedule";//定时执行
	public final static String PARAM_CAMPAIGN_RUN_MODE_cycle="cycle";//周期性执行
	// 活动执行周期
	public final static String PARAM_CAMPAIGN_RUN_CYCLE_hourly="hourly";//每小时
	public final static String PARAM_CAMPAIGN_RUN_CYCLE_daily="daily";//每天
	public final static String PARAM_CAMPAIGN_RUN_CYCLE_weekly="weekly";//每周
	public final static String PARAM_CAMPAIGN_RUN_CYCLE_monthly="monthly";//每月

	// 数据data配置相关参数
	// 执行方式
	public final static String PARAM_DATA_LAUNCH_MODE_manual="manual";//手工执行
	public final static String PARAM_DATA_LAUNCH_MODE_schedule="schedule";//定时执行
	public final static String PARAM_DATA_LAUNCH_MODE_cycle="cycle";//周期性执行
	// 执行频率
	public final static String PARAM_DATA_LAUNCH_FREQ_hourly="hourly";//每小时
	public final static String PARAM_DATA_LAUNCH_FREQ_daily="daily";//每天
	public final static String PARAM_DATA_LAUNCH_FREQ_weekly="weekly";//每周
	public final static String PARAM_DATA_LAUNCH_FREQ_monthly="monthly";//每月
	// 数据更新方式
	public final static String PARAM_DATA_UPDATE_MODE_leave="leave";//保留原值
	public final static String PARAM_DATA_UPDATE_MODE_overlap="overlap";//覆盖
	public final static String PARAM_DATA_UPDATE_MODE_append="append";//追加
	public final static String PARAM_DATA_UPDATE_MODE_whenNull="whenNull";//为空时更新
	public final static String PARAM_DATA_UPDATE_MODE_specialRule="specialRule";//指定规则更新
	// 导入数据来源
	public final static String PARAM_IMPORT_SRC_TYPE_file="file";//文件
	public final static String PARAM_IMPORT_SRC_TYPE_database="database";//外部数据库表
	// 导入数据值类型
	public final static String PARAM_IMPORT_VALUE_TYPE_name="0";//选项描述
	public final static String PARAM_IMPORT_VALUE_TYPE_code="1";//选项代码
	// 导出数据目的类型
	public final static String PARAM_EXPORT_DEST_TYPE_file="file";//文件
	public final static String PARAM_EXPORT_DEST_TYPE_database="database";//外部数据库表
	// 导出数据值类型
	public final static String PARAM_EXPORT_VALUE_TYPE_name="0";//选项描述
	public final static String PARAM_EXPORT_VALUE_TYPE_code="1";//选项代码
	public final static String PARAM_EXPORT_VALUE_TYPE_all="2";//代码和描述

	// 员工相关参数
	// 员工证件类别
	public final static String PARAM_USER_CREDENTIAL_TYPE_idcard="1";//身份证

	// 服务定义扩展参数
	// 沟通方式
	public final static String PARAM_service_chan_type_call="call";//电话
	public final static String PARAM_service_chan_type_email="email";//电子邮件
	public final static String PARAM_service_chan_type_sms="sms";//短信
	public final static String PARAM_service_chan_type_mms="mms";//彩信
	public final static String PARAM_service_chan_type_wechat="wechat";//微信
	public final static String PARAM_service_chan_type_livechat="livechat";//文本聊天
	public final static String PARAM_service_chan_type_weibo="weibo";//微博

	// 业务相关参数类型
	// 表单任务状态
	public final static String PARAM_BPM_TASK_STATE_waiting="waiting";//待处理
	public final static String PARAM_BPM_TASK_STATE_processing="processing";//处理中
	public final static String PARAM_BPM_TASK_STATE_completed="completed";//已完成
	public final static String PARAM_BPM_TASK_STATE_appointed="appointed";//已预约
	public final static String PARAM_BPM_TASK_STATE_canceled="canceled";//已取消
	public final static String PARAM_BPM_TASK_STATE_abandoned="abandoned";//已废弃
	// 回访任务状态
	public final static String PARAM_CALL_OB_TASK_STATE_abandoned="0";//已废弃
	public final static String PARAM_CALL_OB_TASK_STATE_notAssigned="1";//未分配
	public final static String PARAM_CALL_OB_TASK_STATE_assigned="2";//已分配
	public final static String PARAM_CALL_OB_TASK_STATE_processing="3";//处理中
	public final static String PARAM_CALL_OB_TASK_STATE_success="10";//成功
	public final static String PARAM_CALL_OB_TASK_STATE_appoint="11";//预约

	//任务状态
	public final static String PARAM_CALL_OB_TASK_STATE_one = "1";//等待外呼
	public final static String PARAM_CALL_OB_TASK_STATE_two="2";//正在外呼
	public final static String PARAM_CALL_OB_TASK_STATE_three="3";//无人接听
	public final static String PARAM_CALL_OB_TASK_STATE_four="4";//拒接
	public final static String PARAM_CALL_OB_TASK_STATE_five="5";//其他
	public final static String PARAM_CALL_OB_TASK_STATE_six="6";//其他
	public final static String PARAM_CALL_OB_TASK_STATE_ten="10"; //成功


	// 直邮任务状态
	public final static String PARAM_DM_SEND_TASK_STATE_waitAudit="waitAudit";//等待审核
	public final static String PARAM_DM_SEND_TASK_STATE_auditing="auditing";//正在审核
	public final static String PARAM_DM_SEND_TASK_STATE_waitSend="waitSend";//等待发送
	public final static String PARAM_DM_SEND_TASK_STATE_sending="sending";//正在发送
	public final static String PARAM_DM_SEND_TASK_STATE_canceled="canceled";//取消发送
	public final static String PARAM_DM_SEND_TASK_STATE_submitted="submitted";//已发送
	public final static String PARAM_DM_SEND_TASK_STATE_successed="successed";//已签收
	public final static String PARAM_DM_SEND_TASK_STATE_returned="returned";//已退回(退邮)
	public final static String PARAM_DM_SEND_TASK_STATE_backed="backed";//退回更改
	public final static String PARAM_DM_SEND_TASK_STATE_editing="editing";//正在编辑
	// 短信发送任务状态
	public final static String PARAM_SMS_SEND_TASK_STATE_waitAudit="waitAudit";//等待审核
	public final static String PARAM_SMS_SEND_TASK_STATE_auditing="auditing";//正在审核
	public final static String PARAM_SMS_SEND_TASK_STATE_waitSend="waitSend";//等待发送
	public final static String PARAM_SMS_SEND_TASK_STATE_sending="sending";//正在发送
	public final static String PARAM_SMS_SEND_TASK_STATE_canceled="canceled";//取消发送
	public final static String PARAM_SMS_SEND_TASK_STATE_submitted="submitted";//已提交(已提交到短信平台)
	public final static String PARAM_SMS_SEND_TASK_STATE_successed="successed";//发送成功
	public final static String PARAM_SMS_SEND_TASK_STATE_failed="failed";//发送失败
	public final static String PARAM_SMS_SEND_TASK_STATE_backed="backed";//退回更改
	public final static String PARAM_SMS_SEND_TASK_STATE_editing="editing";//正在编辑
	// 邮件发送任务状态
	public final static String PARAM_EMAIL_SEND_TASK_STATE_waitAudit="waitAudit";//等待审核
	public final static String PARAM_EMAIL_SEND_TASK_STATE_auditing="auditing";//正在审核
	public final static String PARAM_EMAIL_SEND_TASK_STATE_waitSend="waitSend";//等待发送
	public final static String PARAM_EMAIL_SEND_TASK_STATE_sending="sending";//正在发送
	public final static String PARAM_EMAIL_SEND_TASK_STATE_canceled="canceled";//取消发送
	public final static String PARAM_EMAIL_SEND_TASK_STATE_submitted="submitted";//已提交
	public final static String PARAM_EMAIL_SEND_TASK_STATE_successed="successed";//发送成功
	public final static String PARAM_EMAIL_SEND_TASK_STATE_failed="failed";//发送失败
	public final static String PARAM_EMAIL_SEND_TASK_STATE_backed="backed";//退回更改
	public final static String PARAM_EMAIL_SEND_TASK_STATE_editing="editing";//正在编辑
	// 微信发送任务状态
	public final static String PARAM_WECHAT_SEND_TASK_STATE_waitAudit="waitAudit";//等待审核
	public final static String PARAM_WECHAT_SEND_TASK_STATE_auditing="auditing";//正在审核
	public final static String PARAM_WECHAT_SEND_TASK_STATE_waitSend="waitSend";//等待发送
	public final static String PARAM_WECHAT_SEND_TASK_STATE_sending="sending";//正在发送
	public final static String PARAM_WECHAT_SEND_TASK_STATE_canceled="canceled";//取消发送
	public final static String PARAM_WECHAT_SEND_TASK_STATE_submitted="submitted";//已提交(已提交到平台)
	public final static String PARAM_WECHAT_SEND_TASK_STATE_successed="successed";//发送成功
	public final static String PARAM_WECHAT_SEND_TASK_STATE_failed="failed";//发送失败
	public final static String PARAM_WECHAT_SEND_TASK_STATE_backed="backed";//退回更改
	public final static String PARAM_WECHAT_SEND_TASK_STATE_editing="editing";//正在编辑
	// 微博发送任务状态
	public final static String PARAM_WEIBO_SEND_TASK_STATE_waitAudit="waitAudit";//等待审核
	public final static String PARAM_WEIBO_SEND_TASK_STATE_auditing="auditing";//正在审核
	public final static String PARAM_WEIBO_SEND_TASK_STATE_waitSend="waitSend";//等待发送
	public final static String PARAM_WEIBO_SEND_TASK_STATE_sending="sending";//正在发送
	public final static String PARAM_WEIBO_SEND_TASK_STATE_canceled="canceled";//取消发送
	public final static String PARAM_WEIBO_SEND_TASK_STATE_submitted="submitted";//已提交(已提交到平台)
	public final static String PARAM_WEIBO_SEND_TASK_STATE_successed="successed";//发送成功
	public final static String PARAM_WEIBO_SEND_TASK_STATE_failed="failed";//发送失败
	public final static String PARAM_WEIBO_SEND_TASK_STATE_backed="backed";//退回更改
	public final static String PARAM_WEIBO_SEND_TASK_STATE_editing="editing";//正在编辑

	// 短信接收状态
	public final static String PARAM_SMS_RECV_STATE_waitAssign="waitAssign";//等待分拣
	public final static String PARAM_SMS_RECV_STATE_assigning="assigning";//正在分拣
	public final static String PARAM_SMS_RECV_STATE_waitProc="waitProc";//等待处理
	public final static String PARAM_SMS_RECV_STATE_processing="processing";//正在处理
	public final static String PARAM_SMS_RECV_STATE_successed="successed";//处理完成
	public final static String PARAM_SMS_RECV_STATE_abandoned="abandoned";//无效数据
	public final static String PARAM_SMS_RECV_STATE_replied="replied";//已回复
	public final static String PARAM_SMS_RECV_STATE_processed="processed";//已处理
	// 邮件接收状态
	public final static String PARAM_EMAIL_RECV_STATE_waitAssign="waitAssign";//等待分拣
	public final static String PARAM_EMAIL_RECV_STATE_assigning="assigning";//正在分拣
	public final static String PARAM_EMAIL_RECV_STATE_waitProc="waitProc";//等待处理
	public final static String PARAM_EMAIL_RECV_STATE_processing="processing";//正在处理
	public final static String PARAM_EMAIL_RECV_STATE_successed="successed";//处理完成
	public final static String PARAM_EMAIL_RECV_STATE_abandoned="abandoned";//无效数据
	public final static String PARAM_EMAIL_RECV_STATE_replied="replied";//已回复
	// 微信接收任务状态
	public final static String PARAM_WECHAT_RECV_STATE_waitAssign="waitAssign";//等待分拣
	public final static String PARAM_WECHAT_RECV_STATE_assigning="assigning";//正在分拣
	public final static String PARAM_WECHAT_RECV_STATE_waitProc="waitProc";//等待处理
	public final static String PARAM_WECHAT_RECV_STATE_processing="processing";//正在处理
	public final static String PARAM_WECHAT_RECV_STATE_successed="successed";//处理完成
	public final static String PARAM_WECHAT_RECV_STATE_abandoned="abandoned";//无效数据
	public final static String PARAM_WECHAT_RECV_STATE_replied="replied";//已回复
	public final static String PARAM_WECHAT_RECV_STATE_processed="processed";//已处理
	// 微博接收状态
	public final static String PARAM_WEIBO_RECV_STATE_waitAssign="waitAssign";//等待分拣
	public final static String PARAM_WEIBO_RECV_STATE_assigning="assigning";//正在分拣
	public final static String PARAM_WEIBO_RECV_STATE_waitProc="waitProc";//等待处理
	public final static String PARAM_WEIBO_RECV_STATE_processing="processing";//正在处理
	public final static String PARAM_WEIBO_RECV_STATE_successed="successed";//处理完成
	public final static String PARAM_WEIBO_RECV_STATE_abandoned="abandoned";//无效数据
	public final static String PARAM_WEIBO_RECV_STATE_replied="replied";//已回复
	public final static String PARAM_WEIBO_RECV_STATE_processed="processed";//已处理

	// 爬取
	// 来源站点
	public static final String PARAM_CRAWLER_SOURCE_SITE_weibo="weibo";//微博
	public static final String PARAM_CRAWLER_SOURCE_SITE_baidutieba="baidutieba";//百度贴吧
	public static final String PARAM_CRAWLER_SOURCE_SITE_autohome="autohome";//汽车之家
	public static final String PARAM_CRAWLER_SOURCE_SITE_xiaohongshu="xiaohongshu";//小红书
	
	// 爬取业务任务状态
	public final static String PARAM_CRAWLER_TASK_STATE_waitAssign="waitAssign";//等待分拣
	public final static String PARAM_CRAWLER_TASK_STATE_assigning="assigning";//正在分拣
	public final static String PARAM_CRAWLER_TASK_STATE_waitProc="waitProc";//等待处理
	public final static String PARAM_CRAWLER_TASK_STATE_processing="processing";//正在处理
	public final static String PARAM_CRAWLER_TASK_STATE_successed="successed";//处理完成
	public final static String PARAM_CRAWLER_TASK_STATE_abandoned="abandoned";//无效数据
	public final static String PARAM_CRAWLER_TASK_STATE_processed="processed";//已处理
	

	/*******************************************XXX 常量定义*****************************************************/
	// SESSION对象的名称
	public final static String SESSION_AUTHOR_TOKEN="SESSION_AUTHOR_TOKEN";//当前登录人
	public final static String SESSION_SURVEY_TOKEN="SESSION_SURVEY_TOKEN";//当前调查问卷
	public final static String SESSION_CONTACT_ID="SESSION_CONTACT_ID";//当前沟通ID
	public final static String SESSION_BRAND_ID="SESSION_BRAND_ID";//当前登录品牌ID
//	public final static String SESSION_BRAND_POPURL="SESSION_BRAND_POPURL";

	// 百分比格式
	public final static String PERCENT_FORMAT="###,###.##%";

	// 错误、警告、提示信息
	public final static String PAGE_ERROR_LIST="errorList";
	public final static String PAGE_MESSAGE_LIST="messageList";

	public final static String PAGE_ERROR_MESSAGE="PAGE_ERROR_MESSAGE";
	public final static String PAGE_WARN_MESSAGE="PAGE_WARN_MESSAGE";
	public final static String PAGE_PROMPT_MESSAGE="PAGE_PROMPT_MESSAGE";

	public final static String PAGE_ERROR_MESSAGE_BEAN="PAGE_ERROR_MESSAGE_BEAN";
	public final static String PAGE_WARN_MESSAGE_BEAN="PAGE_WARN_MESSAGE_BEAN";
	public final static String PAGE_PROMPT_MESSAGE_BEAN="PAGE_PROMPT_MESSAGE_BEAN";

	// 是/否
	public final static String 	LOGIC_TRUE="1";
	public final static String 	LOGIC_FALSE="0";

	// 状态
	public final static String STATE_DISABLED="0";//禁用
	public final static String STATE_ENABLED="1";//启用

	// 修改/新增/查看
	public final static String CMD_MODIFY="modify";
	public final static String CMD_ADD="add";
	public final static String CMD_VIEW="view";
	public final static String CMD_PREVIEW="preview";
	public final static String CMD_UPDATE="update";
	// 逻辑运算符
	public final static String LOGICAL_OPERATOR_AND="and";
	public final static String LOGICAL_OPERATOR_OR="or";

	// 数学运算符
	public final static String MATH_OPERATOR_ADD="add";//所有类型
	public final static String MATH_OPERATOR_SUB="sub";//日期型，数字型
	public final static String MATH_OPERATOR_MUL="mul";//数字型
	public final static String MATH_OPERATOR_DIV="div";//数字型
	public final static String MATH_OPERATOR_MOD="mod";//数字型

	// 日期单位
	public final static String DATE_UNIT_MONTH="month";
	public final static String DATE_UNIT_DAY="day";
	public final static String DATE_UNIT_HOUR="hour";
	public final static String DATE_UNIT_MINUTE="minute";
	public final static String DATE_UNIT_SECOND="second";
	public final static String DATE_UNIT_WORKDAY="workday";
	public final static String DATE_UNIT_WORKHOUR="workhour";

	// data action mode
	public final static String DATA_ACTION_MODE_import="import"; //批量导入
	public final static String DATA_ACTION_MODE_edit="edit";//逐条手工变更
	// data action type
	public final static String DATA_ACTION_TYPE_create="create";
	public final static String DATA_ACTION_TYPE_update="update";
	public final static String DATA_ACTION_TYPE_delete="delete";


	/*******************************************XXX 登录相关参数定义*****************************************************/
	// 登录状态
	public final static String LOGIN_FLAG_not_login="0";//未登录
	public final static String LOGIN_FLAG_has_logged="1";//已登录
	public final static String LOGIN_FLAG_failed="2";//登录失败

	// 登录失败原因
	public final static int LOGIN_FAILED_REASON_illegal_loginid=1;//非法的登录ID
	public final static int LOGIN_FAILED_REASON_no_sys_user=2;//无对应的系统账户
	public final static int LOGIN_FAILED_REASON_wrong_pass=3;//密码错误
	public final static int LOGIN_FAILED_REASON_user_disabled=4;//系统账户被禁用

	// 退出方式
	public final static String LOGOUT_TYPE_null="N";//尚未执行退出
	public final static String LOGOUT_TYPE_normal="0";//正常退出
	public final static String LOGOUT_TYPE_force_logout="1";//强制签出
	public final static String LOGOUT_TYPE_sys_restart="2";//系统重启
	public final static String LOGOUT_TYPE_session_destroy="3";//session摧毁

	// 系统操作日志操作代码
	public final static String LOG_ACTION_CODE_chanPass="chanPass";//修改密码


	/********************************************XXX 其他业务相关参数定义****************************************************/
	// 菜单参数
	// 菜单展示方式
	public static final int MENU_VIEW_TYPE_null=-1;//不显示
	public static final int MENU_VIEW_TYPE_tree=6;//树
	public static final int MENU_VIEW_TYPE_tree_leaf=7;//叶节点
	public static final int MENU_VIEW_TYPE_url=8;//URL

	// 菜单解析方式
	public static final int MENU_IMPL_TYPE_url=1;//URL
	public static final int MENU_IMPL_TYPE_plugin=2;//自定义类


	// 系统账户参数
	// 默认密码
	public static final String USER_DEFAULT_pass="123456";
	// 账户类型
	public static final String USER_TYPE_personal="0";//个人
	public static final String USER_TYPE_enterprise="1";//企业
	// 禁用原因
	public static final int USER_LOCK_REASON_admin_manual=1;//管理员手工禁用
	public static final int USER_LOCK_REASON_pass_error=2;//密码输入错误次数超


	// 员工
	// 称谓
	public static final String USER_TITLE_male="M";//先生
	public static final String USER_TITLE_female="F";//女士


	// 企业
	// 服务提供商ID
	public static final String ORG_PROVIDER_ID="0";
	// 服务提供商默认品牌ID
	public static final String ORG_PROVIDER_BRAND_ID="0";
	// 服务位置
	public static final String ORG_SERVICE_STATUE_provider="0";//服务提供者
	public static final String ORG_SERVICE_STATUE_recipient="1";//服务接受者


	// 角色
	public static final String ROLE_TYPE_sys="1";//系统角色
	public static final String ROLE_TYPE_brand="2";//品牌角色


	// 授权业务分类BUSI_TYPE
	public final static String BUSINESS_TYPE_REPOCLASS = "repoClass";// 知识目录
	public final static String BUSINESS_TYPE_CAMPAIGN = "campaign";// 活动
	public final static String BUSINESS_TYPE_QA = "qa";// 质检模板
	public final static String BUSINESS_TYPE_FORMGROUP = "formGroup";// 表单分组
	public final static String BUSINESS_TYPE_PROCESS = "bpm";// 流程
	public final static String BUSINESS_TYPE_SURVEY = "survey";// 问卷
	public final static String BUSINESS_TYPE_REPORT = "report";// 自定义报告
	public final static String BUSINESS_TYPE_SERVICE = "service";	// 服务

	// bpm
	public final static String  PARAM_INST_DEFAULT_EXPIRE	= "inst_default_expire";//案例默认超时时间
//	public final static String  PARAM_CLASS_HIST_DISPLAYCOUNT	= "0I";//历史记录显示条数
	
	public final static String FOWARD_PAGE_SUCCESS="/bop/commons/SuccessPage.jsp";
	public final static String FOWARD_PAGE_ERROR="/bop/commons/ErrorPage.jsp";
	public final static String FOWARD_PAGE_PROMPT="/bop/commons/PromptPage.jsp";

    public final static String PHONE_CODE_TYPE_LOGIN="login";//验证码登陆
    public final static String PHONE_CODE_TYPE_REGISTER="register";//验证码注册
    public final static String PHONE_CODE_TYPE_RECOVERPWD="recoverpwd";//验证码找回密码
}