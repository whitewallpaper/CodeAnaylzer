# CodeAnalyzerTutorial
Build a code static analyzation tool with scala. and learn scala features during the project.

# 功能列表 #

- [x] 读取指定文件
- [x] 递归读取指定目录， 获取文件个数信息
- [x] 不同后缀名的文件分别有多少个
- [x] 分析一个文件有多少行代码
- [x] 分析平均代码行数
- [x] 列出行数最多的5个文件
- [x] 把结果输出到文件
- [ ] 分析平均一个文件有多少变量
- [ ] 分析平均一个文件有多少可变变量
- [x] 分析最长文件有多少行
- [ ] 分析一个文件有多少空行

# 安装与执行 #

**下载工程**

git clone git@github.com:whitewallpaper/CodeAnaylzer.git

**打包**

sbt assembly

**执行， jar包后的参数 为 执行路径**

java -jar target/scala-2.11/CodeAnalyzer-assembly-0.0.1.jar ./

**执行正确后的控制台响应**
~~~ scala
fileType: Empty-File-Type, count: 1
fileType: java, count: 1
fileType: txt, count: 2
fileType: properties, count: 2
fileType: scala, count: 9
~~~
