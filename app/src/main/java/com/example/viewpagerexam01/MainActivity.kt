package com.example.viewpagerexam01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pageItemList = ArrayList<pageItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pageItemList.add(pageItem(Color.RED, "First",R.drawable.logo_white))
        pageItemList.add(pageItem(Color.GREEN, "Second",R.drawable.ic_pager_item_2))
        pageItemList.add(pageItem(Color.BLUE, "Third",R.drawable.ic_pager_item_3))

        var pagerRecyclerAdapter = PagerRecyclerAdapter(pageItemList)

        viewPager2.apply {
            adapter = pagerRecyclerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }

    }
}