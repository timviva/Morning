package com.example.morningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var Mlist:ListView ?= null
    var user:ArrayList <User> ?=null
    var adapter:CustomAdapter ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Mlist=findViewById(R.id.MlistUsers)
        user=ArrayList()
        adapter=CustomAdapter(this,user!!)
        var user1=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user2=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user3=User(R.mipmap.imagethree,"King Wanyama","0714000000" )
        var user4=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user5=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user6=User(R.mipmap.imagethree,"King Wanyama","0714000000" )
        var user7=User(R.mipmap.imagetwo,"King Wanyama","0714000000" )
        var user8=User(R.mipmap.imagethree,"King Wanyama","0714000000" )
        var user9=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user10=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        user!!.add(user1)
        user!!.add(user2)
        user!!.add(user3)
        user!!.add(user4)
        user!!.add(user5)
        user!!.add(user6)
        user!!.add(user7)
        user!!.add(user8)
        user!!.add(user9)
        user!!.add(user9)
//        Assign our custom adapter to the List View
        Mlist!!.adapter=adapter
    }
}