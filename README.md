# springmvc_tags
springmvc中标签应用

1. 表单标签 form标签
	1. modelAttribute：数据来源有以下两种方式
		1. 从model中的属性获取
		2. 调用该action中的返回该类型数据的方法获取数据,并且该方法添加@ModelAttribute注解

				<form:form modelAttribute="user">
					用户名：<form:input path="name"/>
				</form:form>
				//java代码-->将调用该方法来获取数据
				@ModelAttribute
				public User get(){
					User user = new User();
					user.setName("张三");
					return user;
				}
2. input标签
	1. path：form表单的modelAttribute的对象的属性，支持OGNL表达式

			<form:input path="name"/>
	2. password、hidden、textarea、checkbox、radiobutton、errors使用方式及重要属性和input一致
2. checkboxes:显示多个复选框
	1. path：modelAttriute中回显的的对象属性-->**绑定的数据来源**
	2. items:用户**生成复选框的数据来源**(来源于model中)

			别名：<form:checkboxes items="${alias }" path="alias"/>
	1. radiobuttons、select、options使用方式及重要属性和checkboxes一致