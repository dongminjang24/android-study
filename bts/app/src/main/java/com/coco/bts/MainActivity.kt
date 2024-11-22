package com.coco.bts

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // 여기
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 1. 화면이 클릭되었다는 것을 알아야 한다.
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)


        // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌.
        image1?.setOnClickListener {
           Toast.makeText(this, "이미지 1 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌.
            val intent1 = Intent(this, Bts1Activity::class.java)
            startActivity(intent1)

        }

        image2?.setOnClickListener {
            Toast.makeText(this, "이미지 2 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌.
            val intent2 = Intent(this, Bts2Activity::class.java)
            startActivity(intent2)

        }

        image3?.setOnClickListener {
            Toast.makeText(this, "이미지 3 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌.
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)

        }

        image4?.setOnClickListener {
            Toast.makeText(this, "이미지 4 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌.
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)

        }

        image5?.setOnClickListener {
            Toast.makeText(this, "이미지 5 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌.
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)

        }

        image6?.setOnClickListener {
            Toast.makeText(this, "이미지 6 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌.
            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)

        }

        image7?.setOnClickListener {
            Toast.makeText(this, "이미지 7 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌.
            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)

        }




    }
}