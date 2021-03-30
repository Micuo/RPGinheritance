package mcm.edu.ph.rpginheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class heroClasses extends AppCompatActivity {

    private Button hero1;
    private Button hero2;
    private Button hero3;
    private Button hero4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_classes);

        hero1 = (Button) findViewById(R.id.Hero1);
        hero2 = (Button) findViewById(R.id.Hero2);
        hero3 = (Button) findViewById(R.id.Hero3);
        hero4 = (Button) findViewById(R.id.Hero4);

        hero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHero1();
            }
        });

        hero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHero2();
            }
        });

        hero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHero3();
            }
        });

        hero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHero4();
            }
        });

    }

    public void openHero1() {
        Intent intent = new Intent(this, Archer.class);
        startActivity(intent);
    }

    public void openHero2() {
        Intent intent = new Intent(this, Swordsman.class);
        startActivity(intent);
    }

    public  void openHero3() {
        Intent intent = new Intent(this, Cleric.class);
        startActivity(intent);
    }

    public void openHero4(){
        Intent intent = new Intent(this, Mage.class);
        startActivity(intent);
    }

}