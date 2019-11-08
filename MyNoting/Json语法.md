## Json语法

{"name":"qianchao","sex":"nan"}

**对象使用{}书写**

对象可以包含多个K-V对,且用:分割,每个k-v用","分割

key必须是字符串,value可以是合法的json数据类型(字符串,数组,对象,布尔,null,数字)

### 访问对象值

1. 点号(.)

   var myObj,x;

   myObj={"name":"qianchao","sex":"nan"}

   x=myObj.name

   ===>qianchao

2. []访问

   var myObj,x;

   myObj={"name":"qianchao","sex":"nan"}

   x=myObj["name"]

   ==>qianchao 

3. for-in来循环对象的属性

   ````json
   var myObj,x;
   myObj={"name":"qianchao","sex":"nan"}
   for(x in myObj){
   	x
   }
   ````

4. fo-in循环时,使用[]来访问

   ````json
   var myObj,x;
   myObj={"name":"qianchao","sex":"nan"}
   for(x in myObj){
   	myObj[x]
   }
   ````

5. ````json
   myObj={
   	"name":"钱超"
   	"age":12
   	"sites"{
   	"site1":"www.hiqianchao.com"
   	"site2":"www.123.com"
   	}
   }
   ````

   使用点号(.)或者[]来访问嵌套的Json对象

   x=myObj.sites.site1

   x=myObj.sites["site1"]