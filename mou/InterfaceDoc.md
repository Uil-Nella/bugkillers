#接口文档
##接口
> 备注:接口暂时没有加安全认证，可自由调用，但会有跨域问题，建议安装Chrom的Cros插件。[CROS](https://www.google.com.hk/url?sa=t&rct=j&q=&esrc=s&source=web&cd=15&cad=rja&uact=8&ved=0CD4QFjAEOAo&url=https%3A%2F%2Fchrome.google.com%2Fwebstore%2Fdetail%2Fallow-control-allow-origi%2Fnlfbmbojpeacfghkpbjhddihlkkiljbi&ei=im6bVfmoA8z28QWzy4GADw&usg=AFQjCNHbySktM7wLJjxA63D4xj6dr3jkTw)

###1.用户
####1.1 注册
#####1.1.1 请求url    
`http://host:port/bugkillers/user/regist`
#####1.1.2 请求方式POST
#####1.1.3 请求参数User                          
       
| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| userName | 用户名 | 必填 |
| nickName | 昵称  | 可不填 |
| password | 密码  | 必填 |
| email | 邮箱  | 必填 |
| headPic | 头像 | 可不填 |

#####1.1.4 返回对象Result

| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| ret | 相应标示 | true为正常响应，false为异常响应 |
| code | 错误码  | 当ret为false时有效 |
| msg | 错误信息  |  |                
#####1.1.5 返回json示例              
```json                  
{
  "ret": true,
  "code": 0,
  "msg": "注册成功",
  "t": {
    "id": 0,
    "userName": "xx",
    "nickName": "xx",
    "password": "xx",
    "email": "xx",
    "headPic": ""
  }
}
```
####1.2登录
#####1.2.1 请求url    
`http://host:port/bugkillers/user/login`
#####1.2.2 请求方式POST
#####1.2.3 请求参数User                          
       
| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| userName | 用户名 | 用户名和email必填一个 |
| nickName | 昵称  | 可不填 |
| password | 密码  | 必填 |
| email | 邮箱  | 用户名和email必填一个 |
| headPic | 头像 | 可不填 |

#####1.2.4 返回对象Result

| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| ret | 相应标示 | true为正常响应，false为异常响应 |
| code | 错误码  | 当ret为false时有效 |
| msg | 错误信息  |  |              
#####1.2.5 返回json示例   
```json
{
  "ret": true,
  "code": 0,
  "msg": "登录成功",
  "t": {
    "id": 9,
    "userName": "db",
    "nickName": "董滨",
    "password": "d77d5e503ad1439f585ac494268b351b",
    "email": "ee",
    "headPic": "1"
  }
}
```         
##错误码对照表
| 错误码 | 字段 | 备注 |
| ------------ | ------------- | ------------ |
| 1000 | PARAM_EMPTY | 请求参数为空 |
| 1001 | REGIST_EMAIL_EXIST | 邮箱已经存在 |
| 1002 | REGIST_NAME_EXIST  | 用户名已经存在 |
| 1003 | LOGIN_NAME_NOT_EXIST  | 用户名不存在 |  
| 1004 | LOGIN_EMAIL_NOT_EXIST  | 邮箱不存在 | 
| 1005 | LOGIN_PASS_ERROR  | 密码错误 | 
| 1006 | REGIST_EMAIL_FORMAT_ERROR  | 邮箱格式不正确 | 

###2.标签
####2.1创建标签
#####2.1.1 请求url    
`http://host:port/bugkillers/tag/`
#####2.1.2 请求方式POST
#####2.1.3 请求参数Tag                          
       
| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| tagName | 标签名称 | 必填 |
| tagPic | 标签图片url  | 可不填 |
| tagDes | 标签描述  | 可不填填 |

#####2.1.4 返回对象Result

| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| ret | 相应标示 | true为正常响应，false为异常响应 |
| code | 错误码  | 当ret为false时有效 |
| msg | 错误信息  |  |                
#####2.1.5 返回json示例              
```json                  
{
  "ret": true,
  "code": 0,
  "msg": null,
  "t": null
}
```
####2.2根据tagId获取标签信息
#####2.2.1 请求url    
`http://host:port/bugkillers/tag/{tagId}`
#####2.2.2 请求方式GET
#####2.2.3 请求参数TagId                          
       
| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| tagId | 标签id | 必填 |


#####2.2.4 返回对象Result

| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| ret | 相应标示 | true为正常响应，false为异常响应 |
| code | 错误码  | 当ret为false时有效 |
| msg | 错误信息  |  |              
| t | 返回的tag信息  |  |      
#####2.2.5 返回json示例    
示例：`http://host:port/bugkillers/tag/2`
          
```json                  
{
  "ret": true,
  "code": 0,
  "msg": null,
  "t": {
    "id": 2,
    "tagName": "Java",
    "tagPic": "url:/sfsfsdfs",
    "tagDes": "Java集合2313"
  }
}
```
####2.3查询所有标签
#####2.3.1 请求url    
`http://host:port/bugkillers/tag/findAll`
#####2.3.2 请求方式GET
#####2.3.3 请求参数                         
无

#####2.3.4 返回对象Result

| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| ret | 相应标示 | true为正常响应，false为异常响应 |
| code | 错误码  | 当ret为false时有效 |
| msg | 错误信息  |  |              
| t | 返回的tag列表  |  |      
#####2.3.5 返回json示例    
示例：`http://host:port/bugkillers/tag/2`
          
```json                  
{
  "ret": true,
  "code": 0,
  "msg": null,
  "t": [
    {
      "id": 3,
      "tagName": "Spring",
      "tagPic": "adfah",
      "tagDes": "Spring这个那个"
    },
    {
      "id": 4,
      "tagName": "Guava",
      "tagPic": "adfah",
      "tagDes": "Guava工具类"
    }
  ]
}
}
```
####2.4根据tagId删除标签
#####2.4.1 请求url    
`http://host:port/bugkillers/tag/{tagId}`
#####2.4.2 请求方式DELETE
#####2.4.3 请求参数TagId                          
       
| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| tagId | 标签id | 必填 |


#####2.4.4 返回对象Result

| 字段 | 描述 | 备注 |
| ------------ | ------------- | ------------ |
| ret | 相应标示 | true为正常响应，false为异常响应 |
| code | 错误码  | 当ret为false时有效 |
| msg | 错误信息  |  |                  
#####2.4.5 返回json示例    
示例：`http://host:port/bugkillers/tag/2`
          
```json                  
{
  "ret": true,
  "code": 0,
  "msg": null,
  "t": null
}
```