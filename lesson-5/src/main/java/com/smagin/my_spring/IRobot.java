package com.smagin.my_spring;

import javax.annotation.PostConstruct;


public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

//    @PostConstruct
//    public void init() { //todo teach our framework to run all methods which starts with init
//        System.out.println(cleaner.getClass());
//    }

    @InjectByType
    public void someMethod( Speaker speaker){
        speaker.speak("");
    }

    public void cleanRoom() {
        speaker.speak("Я начал работать");
        cleaner.clean();
        speaker.speak("Я закончил работать");
    }
}
