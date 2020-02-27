# 代码生成器maven 插件
> 目录 gencode-maven-plugin
## 安装步骤
### 1.下载并编译 mini-inject 
  地址： https://github.com/alvin198761/mini-inject
  ```sql
  执行命令 
  git clone https://github.com/alvin198761/mini-inject.git
  unzip mini-inject.zip
  cd mini-inject
  mvn install
  
  ```
### 2. 下载并编译gcode 
 地址： https://github.com/alvin198761/gcode
 ```sql
  执行命令 
  git clone https://github.com/alvin198761/gcode.git
  unzip gcode.zip
  cd gcode/gen_code_v2
  mvn install
```
### 3. 下载并编译本项目
> 不做赘述

# 插件测试程序
* 1.下载并安装
* 2.配置插件
```xml

<plugin>
                <groupId>org.alvin.gencode</groupId>
                <artifactId>gencode-maven-plugin</artifactId>
                <version>1.0-SNAPSHOT</version>
                <configuration>
                    <config>${basedir}/src/main/config/config.properties</config>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>run</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
```
* 3.配置好 config.properties 里面的内容 (见本项目样例文件)
* 4.执行命令
```sql
mvn install  //安装项目
mvn gencode:run //执行插件命令
```
 
