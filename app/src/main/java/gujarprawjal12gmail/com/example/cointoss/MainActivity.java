package gujarprawjal12gmail.com.example.cointoss;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView coin;
    Random r;

    int side;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coin = (ImageView) findViewById(R.id.coin);
        btn = (Button) findViewById(R.id.btn);
         r = new Random();



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                side = r.nextInt(2);

                if (side ==0){

                    coin.setImageResource(R.drawable.head);

                    Toast.makeText(MainActivity.this,"HEADS! ", Toast.LENGTH_SHORT).show();
                }  else if(side == 1){
                      coin.setImageResource(R.drawable.tale);

                      Toast.makeText(MainActivity.this, "TAILS!", Toast.LENGTH_SHORT).show();
                }

                // for roation

                RotateAnimation rotate = new RotateAnimation( 0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f ,RotateAnimation.RELATIVE_TO_SELF,05f);

                rotate.setDuration(1000);
                 coin.setAnimation(rotate);



            }
        });
        }

      private  void tossCoin () {


        }



}