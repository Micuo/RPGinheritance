package mcm.edu.ph.rpginheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class monsterClasses extends AppCompatActivity {

    private Button Monst1;
    private Button Monst2;
    private Button Monst3;
    private Button Monst4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_classes);

        Monst1 = (Button) findViewById(R.id.Monst1);
        Monst2 = (Button) findViewById(R.id.Monst2);
        Monst3 = (Button) findViewById(R.id.Monst3);
        Monst4 = (Button) findViewById(R.id.Monst4);

        Monst1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonst1();
            }
        });

        Monst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonst2();
            }
        });

        Monst3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonst3();
            }
        });

        Monst4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonst4();
            }
        });

    }

    public void openMonst1(){
        Intent intent = new Intent(this, Slime.class);
        startActivity(intent);
    }

    public void openMonst2(){
        Intent intent = new Intent(this, Orc.class);
        startActivity(intent);
    }

    public void openMonst3(){
        Intent intent = new Intent(this, Goblin.class);
        startActivity(intent);
    }

    public void openMonst4(){
        Intent intent = new Intent(this, Troll.class);
        startActivity(intent);
    }

}