package org.kmc.consumer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Venu_producer
{
    public static void main(String[] args)
    {
        Properties properties=new Properties();


        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");


        KafkaProducer kafkaProducer=new KafkaProducer(properties);

        ProducerRecord< String, String> producerRecord=new ProducerRecord<String, String>("kmccorp", "software company");


        kafkaProducer.send(producerRecord);
        kafkaProducer.flush();
        kafkaProducer.close();

    }
}
