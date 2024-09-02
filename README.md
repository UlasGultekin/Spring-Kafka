# Apache Kafka Overview and Configuration

## Introduction

Apache Kafka is a distributed event streaming platform capable of handling high-throughput data feeds. This README provides an overview of Kafka’s features, operational principles, dependencies, and usage within a Spring Boot application.

## Kafka Features

- **High Throughput**: Kafka can handle millions of messages per second, making it suitable for high-throughput use cases.
- **Scalability**: Kafka’s architecture supports horizontal scaling, allowing you to add more brokers to handle increased load.
- **Durability**: Kafka ensures data durability and reliability through replication. Messages are replicated across multiple brokers.
- **Fault Tolerance**: Kafka's distributed nature provides fault tolerance by storing multiple copies of messages across different brokers.
- **Message Ordering**: Messages within a partition are strictly ordered. Kafka maintains this order to ensure reliable message consumption.
- **Real-Time Processing**: Kafka is designed for real-time data streaming, supporting the immediate processing of large volumes of data.

## Kafka Architecture

Kafka consists of the following key components:

- **Producer**: Sends records to Kafka topics.
- **Broker**: Receives records from producers, stores them, and serves them to consumers.
- **Topic**: A category or feed name to which records are sent. Topics are split into partitions for parallel processing.
- **Partition**: A topic’s log is divided into partitions for parallelism and load balancing.
- **Consumer**: Reads records from topics. Consumers are organized into consumer groups for load balancing.
- **Zookeeper**: Manages and coordinates Kafka brokers. It handles leader election and metadata management.

## Dependencies

To integrate Kafka with a Spring Boot application, include the following dependencies in your `pom.xml`:

```xml
<dependencies>
    <!-- Spring Boot Starter for Kafka -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-kafka</artifactId>
    </dependency>
    <!-- Apache Kafka Clients -->
    <dependency>
        <groupId>org.apache.kafka</groupId>
        <artifactId>kafka-clients</artifactId>
        <version>2.13-2.4.0</version>
    </dependency>
</dependencies>

# Application Name
spring.application.name=kafka-consumer

# Kafka Broker Addresses
spring.kafka.bootstrap-servers=localhost:9092

# Deserializer for Kafka Message Keys
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer

# Deserializer for Kafka Message Values
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer

# Consumer Group ID
spring.kafka.consumer.group-id=my_group

# Kafka Topic
kafka-topic=my-first-topic

# Server Port
server.port=8085
# Application Name
spring.application.name=kafka-producer-consumer

# Kafka Broker Addresses
spring.kafka.bootstrap-servers=localhost:9092

# Producer Key and Value Serializers
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer

# Consumer Key and Value Deserializers
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer

# Consumer Group ID
spring.kafka.consumer.group-id=my_group

# Kafka Topic
kafka-topic=my-first-topic

# Server Port
server.port=8085
