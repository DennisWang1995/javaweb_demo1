Eclipse��һ��Java��IDE(���ɿ�������)���ۺ��ˣ��༭�����롢Debug���﷨������refactor�ȵȸ��ֹ��ܣ�
���Ƕ���Javascript���﷨����֧�ֺ�����js���﷨���󾭳�û����ʾ�ģ�ͬ��sqlҲ��û����ʾ�ġ�
����дjs����һ��ҪС�ģ���һ�����������
=====================================================================================================
�ܽ�һ����Ŀ�е�js֪ʶ�㣨warning�����飩
1.JS�п���ʹ��el���ʽ��
	������ var msg='${msg }';
	����˼�� msg������ֵ�Ǵ�request����session��ͨ��el���ʽȡ����

2.JS�е� ===����� �� !==�������
	������ 	123 == '123' //����true����'123'ת��Ϊ���ֽ��бȽ�
			123 === '123' //����false������Ƚ����ݣ����Ƚ�����
			
3.JS�е����п���ֱ��ʹ�õ����ö���(����)����window���������(����)�����仰˵����������window.xxx������
	window.��������ʡ��
	������
	alert();//ʵ����window.alert();
	document.getElementById('div1');//ʵ����window.document.getElementById('div1');
	
4.window.opener��opener��window�����һ�����ԣ���ʾ�ô��������ĸ������ϴ򿪵�
	������
	location.reload(true);//��ˢ��ҳ�����˼�����ʡ��window.����ָ��ǰҳ��ˢ��
	window.opener.location.reload(true);//��Ϊ�Ǹ�ҳ���window��location����ִ��reload����������ˢ�¸�ҳ��
	
5.close()����
	�رյ�ǰ����
	
6.onsubmit="return do_submit(this);"
	- ����onsubmit�¼����ڵ��submit��ťʱ�������Ƿ��ύ����do_submit�����ķ���ֵ����
	- return do_submit(this);��һ��js���룬���е�thisָ��������

7.[����update.jsp]
function do_submit(form_1){//�βΣ����øú������ݵ�form����
	var id_str=form_1.operatorId.value;//ר����Ա�Ԫ�ص�д����"form����.��Ԫ��name"��ȡĳ����Ԫ�أ���Ԫ�ض���value����
	if(!form_1.name.value){//���value�ǿ��ַ������൱��false������js�е�һ�����ƣ�'',0,false,null,undefined,NaN ����false
		alert('��������Ϊ��');
		return false;
	...
	...
}

8.select�����ݻ��ԣ�
<select name="status">
	<option value="1" ${user.status == 1?'selected':''}>��Ч</option>
	<option value="0" ${user.status == 0?'selected':''}>��Ч</option>
</select>

select�ƶ�һ��optionһ��ʼ�ͱ�ѡ�У�Ҫ��option�м���selected���޸Ķ���ʱ����Ҫ���ö����״̬ѡ�У�
Ҳ����˵��user.status�����1��ѡ����Ч�������0��ѡ����Ч

9.open��������һ���´���
open(URL,'',��������);
- �÷���һ��дǰ3����������һ���Ǵ򿪵Ĵ��ڵ�url��ַ����2���������ַ������ɣ���3���ַ����Ǵ���������'width=100,height=200,....'

10.location.href������
	location������5�����������֮һ��
	5��window location navigator screen history
	window�����������ڣ�location��������������ַ����location�����href���Դ����ַ����ĵ�ַ��String���͡�
	var v1=location.href;//��ȡ��ַ���еĵ�ַ
	location.href='.........';//�ı��������ַ���ĵ�ַ����תҳ�棬�൱�ڵ�������ӻ����ֶ�����һ����ַ������
	
11.<a href="javascript:void(0)" onclick="create_user();">�����û�</a>
����href="javascript:void(0)"�����ǽ�������ʧЧ

12.<a href="#id01">��ת��ĳ��</a>
���֮����ת����ǰҳ���idΪid01��Ԫ�ش�

13.
	
	
	
	
	