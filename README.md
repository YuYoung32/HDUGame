# HDUGame
HduIceBreak
# 认人脸小游戏

## 功能

截图：

[![5FaEff.png](https://z3.ax1x.com/2021/10/09/5FaEff.png)](https://imgtu.com/i/5FaEff)

## 技术

* SpringBoot+Thymeleaf+JDBC Template+sqlite

* 总体流程描述：使用IoC思想，前后端分离，分为database、dao、service、controller层。逐层通过框架调用。

  ```mermaid
  graph BT
  A[database]-->|entity&Jdbc|B[dao]
  B-->C[service]
  C-->D[controller]
  D-->|Thymeleaf|E[HTML]
  ```

* 数据流
  本地数据库sqlite，存放字段：userId、userName、userPicUrl。

  userId作为主键是唯一标识，在整个软件中得以贯穿。

  userPicUrl是用户图片的地址，本测试数据采用图床形式，将图片上传至图床然后调用。

