## Class    RTTI

为了使用类而做的准备:

1. 加载
   - 由类加载器执行.查找字节码(通常在classpath所指定的路径中查找),并从字节码中创建Class对象.
2. 链接
   - 链接阶段将验证类中的字节码,为静态域分配存储空间,并且如果需要的话,将解析这个类创建的对其他类的所有引用.
3. 初始化
   - 如果该类具有超类,则对其初始化,执行静态初始化器和静态初始化块.



## ?

通配符:表示"任何事物"   !!



## instanceof

作用:告诉我们对象是不是某个特定类型的实例.

向下转型中需要判断类型!!

1. 返回一个boolean值,告诉我们对象是不是某个特定类型的实例.

   if(x instanceof Dog){

   ​	((Dog)x).xxx();

   }

   将x 转型为Dog前,检查对象x是否从属于Dog类.



## 反射

1. RTTI与反射区别
   - RTTI:编译器在编译时打开和检查.class文件.(换句话说,可以用普通方式调用对象的所有方法)
   - 反射: .class文件在编译时无法获取,是在运行时打开和检查.class文件.

## 动态代理

1. 解释
   - 代理是设计模式之一,为了提供额外的或不同的操作而插入的用来代替"实际"对象的对象.



## 标记接口

解释:不含任何方法和属性的接口.

作用:当某个类实现了这个接口的时候,我们就认为该类拥有了标记接口所描述的功能.