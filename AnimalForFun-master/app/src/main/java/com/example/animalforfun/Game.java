package com.example.animalforfun;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class Game extends AppCompatActivity {
    //Explicit
    ImageView questionImageView;
    ImageButton volumeImageButton;
    Button btn1,btn2,btn3,btn4;
    int questionCount = 10;
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer;
    MediaPlayer mediaPlayer;
    int score = 0;
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //ปุ่มตัวแปรบน JAVA บนอิลิเมนต์ XML
        questionImageView = findViewById(R.id.imvQ);
        volumeImageButton = findViewById(R.id.imbVolume);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        for(int i = 1;i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));

    }// end onCreate()method

    private void setQuestion(Integer qID) {
        if (qID == 1){
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 2){
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this,R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3){
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this,R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("วัว");
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4){
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this,R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมา");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5){
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this,R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 6){
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this,R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7){
            answer = "เสือ";
            questionImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this,R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("เสือ");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 8){
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this,R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุง");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9){
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this,R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10){
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this,R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("ไก่");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    } //end setquestion()method

    public void playSound(View view) {
        mediaPlayer.start();
    } //end playsound () method

    public void choiceAns(View view) {
        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)) {
            score++;
        }

        if (qID.isEmpty()) {//ถ้าทำครบทุกข้อ นั่นคือ qID เป็นค่าว่าง
            dialogboxScore();//เรียก Method dialogboxScore() สำหรับแสดงคะแนน
        } else {//ถ้ายังทำไม่ครบทุกข้อ
            setQuestion(qID.remove(0)); //เรียก Method setQuestion()แสดงคำถามถัดไป
        }

    }//end choiceAns() method

    private void dialogboxScore() {
        getNameString = getIntent().getStringExtra("Name");

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage(getNameString + " ได้ " + score + " คะแนน")
                .setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Play Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }//end dialogboxScore() method
}//End Class
