# unit-tests-demo
# Maven+IDEA+TestNG+Jmockit+Cobertura

# 测试框架的集成
## 实现：
1. 测试用例的执行报告
2. 覆盖率测试报告
3. TestNG控制执行测试用例
4. Maven控制是否执行测试（打包时）

# 规划：
基于Maven管理项目的方式，实现一个 unit-tests-common-util 项目，用来管理在各个模块执行测试时公共使用的测试工具类，比如格式的校验等

# 说明：
1. TestNG使用了IDEA的Create XML的插件，可以生成对应的testNG.xml文件
2. Maven中添加了依赖，且另提交了一份关于Cobertura的依赖
3. demo中是Jmockit实现的mock，供参考
如发现有补充，请评论区留言，期待你的分享。
