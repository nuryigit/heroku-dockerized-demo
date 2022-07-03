package com.heroku.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetinService {

    @Autowired
    GreetingRepository greetingRepository;

    @Override
    public String getGreeting(String lang) {
        return greetingRepository.findByLang(lang).getName();
    }
}
