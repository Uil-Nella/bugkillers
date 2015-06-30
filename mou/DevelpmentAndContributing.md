## Develpment And Contributing  
### 开发环境
* idea intellij 14+
* java 1.7+
* Maven 3.1.1+
* Mysql 5.6

### 搭建流程
####1. fork代码
访问代码仓库：[bugkillers](https://github.com/qq291462491/bugkillers)  
点击右上角的fork将代码fork到自己的仓库,然后clone fork到的项目,注意一定要是ssh的方式clone。     
```
git clone ssh://github.com/$yours/bugkillers
```    
> git使用指南：[Git Book](https://git-scm.com/book/zh/v1)      
> github使用指南：[Github秘籍](https://github.com/bugkillerz/github-cheat-sheet/blob/master/README.zh-cn.md)
> github协作指南：[原文](http://code.tutsplus.com/articles/team-collaboration-with-github--net-29876)、[中文](http://blog.csdn.net/lw5180822/article/details/14121751)

####2. 项目目录结构
#####2.1 bugkillers-core         
后台API服务项目，提供REST服务和RPC服务代码   
#####2.2 bugkillers-web          
前端页面项目代码 
#####2.3 ~~~bugkillers-back~~~       
目前已经废弃
#####2.4 mou      
MarkDown文档目录
#####2.5 res        
资源目录

####3. 运行项目
#####3.1 bugkillers-core      
将项目下的other目录的`tables.sql`的脚本执行，并修改mysql.properties下的配置改成你自己的配置。        
切换到bugkillers-core目录下执行     
```
mvn package -U -Dmaven.test.skip=true jetty:run
```             
然后访问本机`http://127.0.0.1:9081/api/`
出现API文档说明搭建成功
#####3.2 bugkillers-web    
切换到bugkillers-web目录下执行     
```
mvn package -U  jetty:run
```             
然后访问本机`http://127.0.0.1:9082/dist/index.html`

####4. coding
在做修改之前最好创建一个自己的分支，代码修改完毕后提pr，pr被merge后废弃，有新的改动重新建立分支（建议）        
  
#####4.1 查看目前的分支，并切换到根分支，在创建。            
```
git branch -a 
git checkout origin master
```

#####4.2  创建自己的分支(分支名可自由取)    
```
git branch feature-xxx-xxx
```

#####4.3  切换到新分支coding,并定期commit     
```
git checkout feature-xxx-xxx
```

#####4.4  提Pull Request   
    
在提pull request之前需要将代码和现在最新的代码，master分支上的代码做一下rebase或者merge。     
pr参考：[Creating Effective Pull Requests](http://codeinthehole.com/writing/pull-requests-and-other-good-practices-for-teams-using-github/)
