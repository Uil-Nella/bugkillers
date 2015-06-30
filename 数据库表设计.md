## 数据库表设计  v1.0

####用户表  bk_user
|序号|字段|数据类型|校验|描述|备注|
|----|---|---|---|---|---|----|
|1|id|int|主键|用户主键|自增|
|2|user_name|VARCHAR|唯一|用户名|唯一索引|
|3|nick_name|VARCHAR||昵称||
|4|password|VARCHAR||密码||
|5|email|VARCHAR|唯一|邮箱|唯一索引|
|6|headpic|VARCHAR||头像||
|7|dr|int||删除标示位|1=正常  2=删除|
|8|regist_time|datetime||注册时间||
|9|login_time|datetime||最近登录时间||
|10|bk_create|datetime||创建时间||
|11|bk_modified|datetime||修改时间|| 

####问题表  bk_question
|序号|字段|数据类型|校验|描述|备注|
|----|---|---|---|---|---|----|
|1|id|int|主键|主键|自增|
|2|user_id|int||用户id|问题所属者主键|
|3|question_title|VARCHAR||问题标题||
|4|question_summary|VARCHAR||问题摘要||
|5|question_text|VARCHAR||问题正文||
|6|dr|int||删除标示位|1=正常  2=删除|
|7|bk_create|datetime||创建时间||
|8|bk_modified|datetime||修改时间|| 
####标签表  bk_tag
|序号|字段|数据类型|校验|描述|备注|
|----|---|---|---|---|---|----|
|1|id|int|主键|主键|自增|
|2|tag_name|VARCHAR||标签名称||
|3|dr|int||删除标示位|1=正常  2=删除|
|4|bk_create|datetime||创建时间||
|5|bk_modified|datetime||修改时间|| 
####问题标签关联表  bk_question_tag
|序号|字段|数据类型|校验|描述|备注|
|----|---|---|---|---|---|----|
|1|id|int|主键|主键|自增|
|2|tag_id|int||标签id||
|3|tag_name|VARCHAR||标签名称||
|4|question_id|int||问题id|1=正常  2=删除|
|5|dr|int||删除标示位||
|6|bk_create|datetime||创建时间||
|7|bk_modified|datetime||修改时间|| 
####评论表  bk_comment
|序号|字段|数据类型|校验|描述|备注|
|----|---|---|---|---|---|----|
|1|id|int|主键|主键|自增|
|2|question_id|int||问题主键||
|3|user_id|int||用户id||
|4|comment_text|VARCHAR||评论内容||
|5|dr|int||删除标示位|1=正常  2=删除|
|6|bk_create|datetime||创建时间||
|7|bk_modified|datetime||修改时间||
