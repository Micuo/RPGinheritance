package mcm.edu.ph.rpginheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button hero;
    private Button monsters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monsters = (Button) findViewById(R.id.monsters);
        hero = (Button) findViewById(R.id.hero);

        monsters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonsterClasses();
            }
        });

        hero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHeroClasses();
            }
        });
    }

    public void openHeroClasses() {
        Intent intent = new Intent(this, heroClasses.class);
        startActivity(intent);
    }

    public void openMonsterClasses() {
        Intent intent = new Intent(this, monsterClasses.class);
        startActivity(intent);
    }

}