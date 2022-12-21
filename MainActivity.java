package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        String[] motivation= new String[20];
        Random random = new Random();
        int x = random.nextInt(20);
        motivation[0]="It's not the size of the dog in the fight, but the size of the fight in the dog. -Archie Griffen";
        motivation[1]="Nothing lasts forever. Not even your troubles. -Arnold H Glasgow";
        motivation[2]="There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle -Albert Einstein";
        motivation[3]="Take chances, make mistakes. That's how you grow. Pain nourishes your courage. You have to fail in order to practice being brave. -Mary Tyler Moore";
        motivation[4]="Being strong means rejoicing in who you are, complete with imperfections. -Margaret Woodhouse";
        motivation[5]="If you don’t go after what you want, you’ll never have it. If you don’t ask, the answer is always no. If you don’t step forward, you’re always in the same place. -Nora Roberts";
        motivation[6]="I've missed more than 9,000 shots in my career. I've lost almost 300 games. Twenty-six times I've been trusted to take the game-winning shot and missed. I've failed over and over and over again in my life. And that is why I succeed. -Michael Jordan";
        motivation[7]="The only place you find success before work is in the dictionary. -May V Smith";
        motivation[8]="You're going to fail your way to success, you have nothing to be ashamed of so keep your head up. It’s much easier to come up with excuses of why you can't do it. If you do what is easy your life will be hard. -Les Brown";
        motivation[9]="A life spent making mistakes is not only more honorable, but more useful than a life spent doing nothing. -George Bernard Shaw";
        motivation[10]="Nobody can make you feel inferior without your consent. -Eleanor Roosevelt";
        motivation[11]="It took me a long time not to judge myself through someone else's eyes. -Sally Field";
        motivation[12]="I quit being afraid when my first venture failed and the sky didn't fall down. -Allen H Neuharth";
        motivation[13]="Hope never abandons you, you abandon it. -George Weinberg";
        motivation[14]="The only thing keeping you from getting what you want is the story you keep telling yourself about why you don't have it. People who are willing to die to succeed will tend to succeed. -Tony Robbins";
        motivation[15]="People are like stained-glass windows. They sparkle and shine when the sun is out, but when the darkness sets in their true beauty is revealed only if there is light from within. -Elisabeth Kübler-Ross";
        motivation[16]="Nothing splendid has ever been achieved except by those who dared believe that something inside of them was superior to circumstance. -Bruce Barton";
        motivation[17]="Aerodynamically the bumblebee shouldn't be able to fly, but the bumblebee doesn't know that so it goes on flying anyway. -Mary Kay Ash";
        motivation[18]="The secret is in not giving up, of all the greats they didn't quit. If you quit I guarantee you're gonna fail, but you don't know what's gunna happen if you don't give in. -Eric Thomas";
        motivation[19]="Just decide; what's it's gonna be, who you're gonna be and how your gonna do it, and then from that point, the universe will get out of your way. -Will Smith";
        TextView viewTextFstName = findViewById(R.id.textView);
        viewTextFstName.setText(motivation[x]);
    }
}