# Проект "Spring REST API с буферами протоколов Protobuf"

Обзор
Protocol Buffers - это механизм сериализации и десериализации структурированных данных, который является языконезависимым и платформонезависимым. Созданный компанией Google, он объявляется более быстрым, компактным и простым, чем другие типы данных, такие как XML и JSON.

## Запуск

1. Для запуска вам понадобиться **[Java 11](https://www.java.com/ru/)** и выше.
2. Надо скачать **[Protobuf](https://protobuf.dev/)** компилятор **[(protoc-3.15.3-win64)](https://github.com/protocolbuffers/protobuf/releases)**.
3. Добавить в **pom.xml** файл, зависимость **protobuf-java**

````
<dependency>
	<groupId>com.google.protobuf</groupId>
	<artifactId>protobuf-java</artifactId>
	<version>3.15.3</version>
</dependency>
````
