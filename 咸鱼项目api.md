# 咸鱼项目api

## 1.首页

请求地址

------

```java
首页数据接口: ApiRootUrl + 'index/index', 
首页展示更多推荐商品: ApiRootUrl + 'index/more'
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |

## 2.分类页

请求地址

```java
  分类目录全部分类数据接口: ApiRootUrl + 'catalog/index',
  分类目录当前分类数据接口: ApiRootUrl + 'catalog'
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |

## 3.分类浏览商品

```java
获得分类下的商品列表: ApiRootUrl + 'goods/category/index'
获得分类数据: ApiRootUrl + 'goods/category'
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |

## 4.浏览商品详情

请求地址

```java
获得商品的详情: ApiRootUrl + 'goods/detail', 
商品详情页的关联商品（大家都在看）: ApiRootUrl + 'goods/related', 
发表评论: ApiRootUrl + 'goods/comment/post', 
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |

## 5.搜索

请求地址

```java
搜索页面数据: ApiRootUrl + 'search/index', 
搜索结果: ApiRootUrl + 'search/result', 
清空搜索历史: ApiRootUrl + 'search/clearhistory', 
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |

## 6.商品发布

请求地址

```java
发布商品: ApiRootUrl + 'post/post', 
删除自己发布的商品: ApiRootUrl + 'post/delete', 
获取区域列表: ApiRootUrl + 'post/region', 
发布商品时选择分类: ApiRootUrl + 'post/category', 
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |

## 7.用户相关

请求地址

```java
 收藏列表: ApiRootUrl + 'goodsUser/collect', 
 添加或取消收藏: ApiRootUrl + 'goodsUser/collect/addordelete', 
 发布的商品: ApiRootUrl + 'goodsUser/posted', 
 买过的商品: ApiRootUrl + 'goodsUser/bought', 
 卖出的商品: ApiRootUrl + 'goodsUser/sold', 
 用户主页: ApiRootUrl + 'goodsUser/user', 
 用户主页更多: ApiRootUrl + 'goodsUser/user/more', 
 把商品标记为想要: ApiRootUrl + 'goodsUser/want', 
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |

## 8.认证

请求地址

```java
微信登录: ApiRootUrl + 'auth/loginByWeixin',
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |

## 9.消息

请求地址

```java
消息一览: ApiRootUrl + 'chat/index', 
消息框: ApiRootUrl + 'chat/form', 
把所有未读设为已读: ApiRootUrl + 'chat/flushUnread', 
消息WebSocket连接: WebSocktUrl + 'ws', 
```

请求参数

| 参数名 | 类型 | 描述 | 事例 |
| :----- | ---- | ---- | ---- |
|        |      |      |      |
|        |      |      |      |