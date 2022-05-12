package com.example.homework;

import com.example.homework.config.SpringConfig;
import com.example.homework.config.TestConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(TestConfig.class)
public class HomeworkApplication {

    private static TestConfig testConfig;

    public HomeworkApplication(TestConfig testConfig) {
        HomeworkApplication.testConfig = testConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println("Название приложения: " + testConfig.getApplicationName());
        System.out.println("Состояние " + testConfig.getEnvironmentVariable());

        System.out.print("Список: ");
        for (var el: testConfig.getLi()) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println();

        try { System.out.println(context.getBean("One") + " - первый бин существует"); }
        catch (Exception e) { System.out.println("Текущий профиль не тест"); }

        try { System.out.println(context.getBean("Two") + " - второй бин существует"); }
        catch (Exception e) { System.out.println("Первого бина не существует"); }

        try { System.out.println(context.getBean("Three") + " - третий бин существует"); }
        catch (Exception e) { System.out.println("Не дефолт"); }
    }

}