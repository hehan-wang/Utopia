package com.david.old;

import kafka.producer.KeyedMessage;
import kafka.serializer.StringEncoder;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by David
 * on 2017/1/2
 */
public class kafkaProducer extends Thread{

    private String topic;

    public kafkaProducer(String topic){
        super();
        this.topic = topic;
    }


    @Override
    public void run() {
//        Producer producer = createProducer();
//        int i=0;
//        while(true){
//            producer.send(new KeyedMessage<Integer, String>(topic, "message: " + i++));
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

//    private Producer createProducer() {
//        Properties properties = new Properties();
//        properties.put("zookeeper.connect", "192.168.1.110:2181,192.168.1.111:2181,192.168.1.112:2181");//声明zk
//        properties.put("serializer.class", StringEncoder.class.getName());
//        properties.put("metadata.broker.list", "192.168.1.110:9092,192.168.1.111:9093,192.168.1.112:9094");// 声明kafka broker
//        return new Producer<Integer, String>(new ProducerConfig(properties));
//    }
//
//
//    public static void main(String[] args) {
//        new kafkaProducer("TestTopic").start();// 使用kafka集群中创建好的主题 local
//
//    }

}
