package com.example.testlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
public class TestlogApplication extends Thread {

    public static void main(String[] args) {
        SpringApplication.run(TestlogApplication.class, args);
        TestlogApplication testlogApplication = new TestlogApplication();
        testlogApplication.start();
    }


    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                log.info("time:" + System.currentTimeMillis() + " name:" + Thread.currentThread().getName()+ " id:" + Thread.currentThread().getId());
                if(new Date().getTime() >= 1560324062781L){
                    log.info("over");
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        log.info("exit");
    }

}
