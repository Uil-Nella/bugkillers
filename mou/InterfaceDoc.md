#接口文档
##接口
> 备注:接口暂时没有加安全认证，可自由调用，但会有跨域问题，建议安装Chrom的Cros插件。
###1.用户
####1.1 注册
#####1.1.1 请求url    
`http://host:port/user/regist`
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
`http://host:port/user/login`
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

