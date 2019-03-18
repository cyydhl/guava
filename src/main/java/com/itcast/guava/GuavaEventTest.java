package com.itcast.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by chenyingying on 2019/3/18.
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus();

        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");
        eventbus.register(tom);
        eventbus.register(mic);

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");
        eventbus.post(question);
    }
}
