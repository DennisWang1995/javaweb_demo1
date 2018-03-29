Eclipse是一个Java的IDE(集成开发环境)，综合了：编辑、编译、Debug、语法分析、refactor等等各种功能，
但是对于Javascript的语法分析支持很弱，js的语法错误经常没有提示的，同理，sql也是没有提示的。
所以写js代码一定要小心，能一步步测试最好
=====================================================================================================
总结一下项目中的js知识点（warning：很碎）
1.JS中可以使用el表达式：
	【例】 var msg='${msg }';
	【意思】 msg变量的值是从request或者session中通过el表达式取出的

2.JS中的 ===运算符 和 !==运算符：
	【例】 	123 == '123' //返回true，将'123'转化为数字进行比较
			123 === '123' //返回false，不光比较内容，还比较类型
			
3.JS中的所有可以直接使用的内置对象(方法)都是window对象的属性(方法)，换句话说，都可以用window.xxx来引用
	window.经常可以省略
	【例】
	alert();//实际是window.alert();
	document.getElementById('div1');//实际是window.document.getElementById('div1');
	
4.window.opener：opener是window对象的一个属性，表示该窗口是在哪个窗口上打开的
	【例】
	location.reload(true);//是刷新页面的意思。如果省略window.仅仅指当前页面刷新
	window.opener.location.reload(true);//因为是父页面的window的location对象执行reload方法，所以刷新父页面
	
5.close()方法
	关闭当前窗口
	
6.onsubmit="return do_submit(this);"
	- 表单的onsubmit事件，在点击submit按钮时发生，是否提交表单由do_submit函数的返回值决定
	- return do_submit(this);是一段js代码，其中的this指代表单本身

7.[出自update.jsp]
function do_submit(form_1){//形参，调用该函数传递的form对象
	var id_str=form_1.operatorId.value;//专门针对表单元素的写法："form对象.表单元素name"获取某个表单元素，表单元素都有value属性
	if(!form_1.name.value){//如果value是空字符串，相当于false，这是js中的一个机制：'',0,false,null,undefined,NaN 都是false
		alert('姓名不能为空');
		return false;
	...
	...
}

8.select的数据回显：
<select name="status">
	<option value="1" ${user.status == 1?'selected':''}>有效</option>
	<option value="0" ${user.status == 0?'selected':''}>无效</option>
</select>

select制定一个option一开始就被选中，要在option中加上selected。修改对象时，需要将该对象的状态选中：
也就是说：user.status如果是1，选中有效；如果是0，选中无效

9.open方法：打开一个新窗口
open(URL,'',窗口特征);
- 该方法一般写前3个参数，第一个是打开的窗口的url地址，第2个参数空字符串即可，第3个字符串是窗口特征：'width=100,height=200,....'

10.location.href的作用
	location对象是5大浏览器对象之一：
	5大：window location navigator screen history
	window代表整个窗口，location代表的是浏览器地址栏。location对象的href属性代表地址栏里的地址，String类型。
	var v1=location.href;//获取地址栏中的地址
	location.href='.........';//改变浏览器地址栏的地址，跳转页面，相当于点击超链接或者手动输入一个地址并访问
	
11.<a href="javascript:void(0)" onclick="create_user();">创建用户</a>
其中href="javascript:void(0)"作用是将超链接失效

12.<a href="#id01">跳转到某处</a>
点击之后，跳转到当前页面的id为id01的元素处

13.
	
	
	
	
	