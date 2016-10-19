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
2. 