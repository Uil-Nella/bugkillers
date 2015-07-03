##Spring 事务
###1. 描述
####1.1 数据库事务
* 原子性(A): 事务必须是原子工作单元，对于其数据修改，要么全都执行，要么全都不执行。
* 一致性(C): 事务在完成时，必须使所有的数据都保持一致状态。在相关数据库中，所有规则都必须应用于事务
        的修改，以保持所有数据的完整性。事务结束时，所有的内部数据结构（索引等）都必须是正确的。
* 隔离性(I): 事务之间相互隔离，事务查看数据时数据所处的状态，要么是另一并发事务修改它之前的状态，要么是           另一事务修改它之后的状态，事务不会查看中间状态的数据。
* 持久性(D): 事务完成之后，它对于系统的影响是永久性的。

####1.2 传播机制
Spring中规定了7种类型的事务传播行为，它们规定了事务方法和事务方法发生嵌套调用时事务如何进行传播。       
**传播表：**           

| 传播类型         | 说明         |
| ------------ | ------------- |
| PROPAGATION_REQUIRED | 如果当前没有事务，就新建一个事务，如果已经存在一个事务中，加入到这个事务中。这是 最常见的选择。  | 
| PROPAGATION_SUPPORTS |  支持当前事务，如果当前没有事务，就以非事务方式执行。 |
| PROPAGATION_MANDATORY| 使用当前的事务，如果当前没有事务，就抛出异常。  |
| PROPAGATION_REQUIRES_NEW | 新建事务，如果当前存在事务，把当前事务挂起。  |
| PROPAGATION_NOT_SUPPORTED |  以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。 |
| PROPAGATION_NEVER |  以非事务方式执行，如果当前存在事务，则抛出异常。 |
| PROPAGATION_NESTED |  如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则执行与 PROPAGATION_REQUIRED 类似的操作。 |           

**嵌套事务： **
嵌套事务不能够提交，它必须通过外层事务来完成提交的动作，外层事务的回滚也会造成内部事务的回滚。
PROPAGATION_NESTED内层事务的异常并不会导致外层事务的回滚。
####1.3 隔离级别
考虑到完全隔离会影响性能，而且并不是所有应用程序都要求完全隔离，所以有时可以在事务隔离方面灵活处理。因此，就会有好几个隔离级别。         		
**并发数据库出现的问题：**    
           
* 脏读(Dirty read)：脏读发生在一个事务读取了被另一个事务改写但尚未提交的数据时。如果这些改变在稍后被回滚了，那么第一个事务读取的数据就会是无效的.     	
* 重复读(Nonrepeatable read):不可重复读发生在一个事务执行相同的查询两次或两次以上，但每次查询结果都不相同时。这通常是由于另一个并发事务在两次查询之间更新了数据。			
* 幻读(Phantom reads)：幻读和不可重复读相似。当一个事务（T1）读取几行记录后，另一个并发事务（T2）插入了一些记录时，幻影读就发生了。在后来的查询中，第一个事务（T1）就会发现一些原来没有的额外记录。    	
		
**隔离级别：**   
                    
| 隔离级别 | 说明 |      
| ------------ | ------------- |
| ISOLATION_DEFAULT |使用后端数据库默认的隔离级别。  | 
| ISOLATION_READ_UNCOMMITTED | 允许读取尚未提交的更改。可能导致脏读、幻影读或不可重复读。  | 
| ISOLATION_READ_COMMITTED	|允许从已经提交的并发事务读取。可防止脏读，但幻影读和不可重复读仍可能会发生。|
|ISOLATION_REPEATABLE_READ|对相同字段的多次读取的结果是一致的，除非数据被当前事务本身改变。可防止脏读和不可重复读，但幻影读仍可能发生。|
|ISOLATION_SERIALIZABLE|完全服从ACID的隔离级别，确保不发生脏读、不可重复读和幻影读。这在所有隔离级别中也是最慢的，因为它通常是通过完全锁定当前事务所涉及的数据表来完成的。|

**对照:**

| 隔离级别 | 脏读 | 重复读 | 幻读|
| ------------ | ------------- | ------------ |---|
| 串行(SERIALIZABLE) |NO  | NO |NO|
| 可重复读取(REPEATABLE_READ) | NO  | NO |YES|
| 授权读取(READ_COMMITTED)|NO|YES|YES|
| 未授权读取(READ_UNCOMMITTED)|YES|YES|YES|
| 默认(DEFAULT)|-|-|-|

###2. 分类
####2.1 编程式
所谓编程式事务指的是通过编码方式实现事务，即类似于JDBC编程实现事务管理。
Spring框架提供一致的事务抽象，因此对于JDBC还是JTA(Java Transaction API)事务都是采用相同的API进行编程。                               
Spring提供两种编程式事务支持：直接使用PlatformTransactionManager实现和使用TransactionTemplate模板类，用于支持逻辑事务管理。
如果采用编程式事务推荐使用TransactionTemplate模板类和高级别解决方案。

####2.2 声明式
配置简单，无入侵，对业务代码无影响。
###3. Spring事务处理方式
####3.1 代理
####3.2 拦截器
使用`tx`标签           
```xml
<tx:advice id="txAdvice" transaction-manager="txManager">  
<tx:attributes>  
           <tx:method name="save*" propagation="REQUIRED" />  
           <tx:method name="add*" propagation="REQUIRED" />  
           <tx:method name="create*" propagation="REQUIRED" />  
           <tx:method name="insert*" propagation="REQUIRED" />  
           <tx:method name="update*" propagation="REQUIRED" />  
           <tx:method name="merge*" propagation="REQUIRED" />  
           <tx:method name="del*" propagation="REQUIRED" />  
           <tx:method name="remove*" propagation="REQUIRED" />  
           <tx:method name="put*" propagation="REQUIRED" />  
           <tx:method name="get*" propagation="SUPPORTS" read-only="true" />  
           <tx:method name="count*" propagation="SUPPORTS" read-only="true" />  
          <tx:method name="find*" propagation="SUPPORTS" read-only="true" />  
          <tx:method name="list*" propagation="SUPPORTS" read-only="true" />  
          <tx:method name="*" propagation="SUPPORTS" read-only="true" />  
       </tx:attributes>  
</tx:advice>  
<aop:config>  
       <aop:pointcut id="txPointcut" expression="execution(* cn.javass..service.*.*(..))" />  
       <aop:advisor advice-ref="txAdvice" pointcut-ref="txPointcut" />  
</aop:config>
```
####3.3 注解
使用`@Transactional`实现事务管理	
**属性：**

|属性|	类型	|描述|    
|----|------|-----|
|value |	String	|可选的限定描述符，指定使用的事务管理器|
|propagation	|enum: Propagation|	可选的事务传播行为设置|
|isolation	|enum: Isolation	|可选的事务隔离级别设置|
|readOnly	|boolean	|读写或只读事务，默认读写|
|timeout	|int (in seconds granularity)	|事务超时时间设置|
|rollbackFor|	Class对象数组，必须继承自Throwable|	导致事务回滚的异常类数组|
|rollbackForClassName|	类名数组，必须继承自Throwable|	导致事务回滚的异常类名字数组|
|noRollbackFor	|Class对象数组，必须继承自Throwable|	不会导致事务回滚的异常类数组|
|noRollbackForClassName|	类名数组，必须继承自Throwable|	不会导致事务回滚的异常类名字数组   |            

**用法：**

`@Transactional` 可以作用于接口、接口方法、类以及类方法上。当作用于类上时，该类的所有 `public` 方法将都具有该类型的事务属性，同时，我们也可以在方法级别使用该标注来覆盖类级别的定义。

虽然` @Transactional` 注解可以作用于接口、接口方法、类以及类方法上，但是 Spring 建议不要在接口或者接口方法上使用该注解，因为这只有在使用基于接口的代理时它才会生效。另外， `@Transactional` 注解应该只被应用到 `public` 方法上，这是由 Spring AOP 的本质决定的。如果你在 `protected`、`private` 或者默认可见性的方法上使用 `@Transactional` 注解，这将被忽略，也不会抛出任何异常。

默认情况下，只有来自外部的方法调用才会被AOP代理捕获，也就是，类内部方法调用本类内部的其他方法并不会引起事务行为，即使被调用方法使用`@Transactional`注解进行修饰。

```
@Transactional(readOnly = true)
public class DefaultService  {
  //方法上注解属性会覆盖类注解上的相同属性
  @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
  public void updateFoo(Foo foo) {
    // do something
  }
}
```

