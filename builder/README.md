c_builder 模块的代码是建造者模式的 demo。

该 demo 实现的功能是：实现一个资源池配置类 ResourcePoolConfig0，在这个资源池配置类中，有以下几个成员变量，也就是可配置项。

- name：资源名称，必填项，无默认值
- maxTotal：最大总资源数量，非必填项，默认值为 8
- maxIdle：最大空闲资源数量，非必填项，默认值为 8
- minIdle：最小空闲资源数量，非必填项，默认值为 0

类的属性之前有依赖关系和约束条件：（必须实现校验逻辑，不满足该条件抛出异常）

- 要保证 maxTotal、maxIdle、minIdle 都不小于 0
- maxIdle < maxTotal
- minIdle < maxTotal
- minIdle < maxIdle