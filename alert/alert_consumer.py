from kafka import KafkaConsumer
import os

kafka_url = os.getenv('KAFKA_URL')

if kafka_url == None:
    kafka_url = "localhost:9092"

print("KAFKA URL : %s" % (kafka_url))

# localhost:9092
# my-kafka.kafka.svc.cluster.local:9092

consumer = KafkaConsumer('lecture', bootstrap_servers=[
                         kafka_url], auto_offset_reset='earliest', enable_auto_commit=True, group_id='alert')

for message in consumer:
    print("Topic: %s, Partition: %d, Offset: %d, Key: %s, Value: %s" % (
        message.topic, message.partition, message.offset, message.key, message.value))
