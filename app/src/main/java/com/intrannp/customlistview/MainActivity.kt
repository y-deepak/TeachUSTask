package com.intrannp.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intrannp.customlistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
            R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i

        )

        val name = arrayOf(

            "Neil",
            "DeepaK",
            "Tom",
            "Saurabh",
            "Jaimin",
            "Shah Jaimin",
            "Deepak Yadav",
            "Anand",
            "Alexa"
        )

        val lastSub = arrayOf(

            "Android Developer","Android Developer","IT Support","Computer Network","Computer Network",
            "Maths","Animation","Statistics","Python Programming"

        )



        userArrayList = ArrayList()

        for( i in name.indices){

            val user = User(name[i],lastSub[i],imageId[i])
            userArrayList.add(user)

        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]


            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",name)

            startActivity(i)


        }

    }
}