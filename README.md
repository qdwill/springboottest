## 分包原则
- admin ： 放给管理后台页面的服务接口
- api : 放给第三方的api的接口
- common ： 公用util组件
- core ： 核心逻辑。service
- dao ： 自动生成的mapper。数据库相关

生产的数据库，在数据库重启时必须执行：
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SET global.sql_mode=(SELECT REPLACE(@@global.sql_mode,'ONLY_FULL_GROUP_BY',''));


