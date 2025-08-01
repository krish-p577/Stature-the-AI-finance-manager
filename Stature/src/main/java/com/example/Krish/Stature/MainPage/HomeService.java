package com.example.Krish.Stature.MainPage;

import org.springframework.stereotype.Service;

@Service
public class HomeService implements HomeInterface{

    public int getInfo(int cash){
        
        return cash + 5;
    }
    
}
