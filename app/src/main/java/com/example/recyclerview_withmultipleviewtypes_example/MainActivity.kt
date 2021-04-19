package com.example.recyclerview_withmultipleviewtypes_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_withmultipleviewtypes_example.adapter.RecyclerViewAdapter
import com.example.recyclerview_withmultipleviewtypes_example.model.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataList = ArrayList<Data>()
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "1. Hi! I am in View 1"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "2. Hi! I am in View 2"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "3. Hi! I am in View 3"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "4. Hi! I am in View 4"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "5. Hi! I am in View 5"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "6. Hi! I am in View 6"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "7. Hi! I am in View 7"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "8. Hi! I am in View 8"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "9. Hi! I am in View 9"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "10. Hi! I am in View 10"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "11. Hi! I am in View 11"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "12. Hi! I am in View 12"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "13. Hi! I am in View 13"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "14. Hi! I am in View 14"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "15. Hi! I am in View 15"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "16. Hi! I am in View 16"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "17. Hi! I am in View 17"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "18. Hi! I am in View 18"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "19. Hi! I am in View 19"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "20. Hi! I am in View 20"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "21. Hi! I am in View 21"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "22. Hi! I am in View 22"))


        val adapter = RecyclerViewAdapter(this, dataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


    }
}