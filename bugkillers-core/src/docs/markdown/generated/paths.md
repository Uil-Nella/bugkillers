## Paths
### createOrModifiedQuestion
```
POST /bugkillers/question/
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|question|question|false|Question||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* question-controller

### findById
```
GET /bugkillers/question/{questionId}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|questionId|questionId|true|integer (int32)||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* question-controller

### createOrModifiedTag
```
POST /bugkillers/tag/
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|tag|tag|true|Tag||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* tag-controller

### findAllTags
```
GET /bugkillers/tag/findAll
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* tag-controller

### findTagById
```
GET /bugkillers/tag/{tagId}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|tagId|tagId|true|integer (int32)||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* tag-controller

### deleteTagById
```
DELETE /bugkillers/tag/{tagId}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|tagId|tagId|true|integer (int32)||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|204|No Content|No Content|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* tag-controller

### login
```
POST /bugkillers/user/login
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|user|user|true|User||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* user-controller

### regist
```
POST /bugkillers/user/regist
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|user|user|true|User||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* user-controller

### findById
```
GET /bugkillers/user/{userId}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|userId|userId|true|integer (int32)||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* user-controller

### monitorAlive
```
GET /test/alive
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|404|Not Found|No Content|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* test-controller

