package pic_book.com.fibonaccisequence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pic_book.com.fibonaccisequence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listOfFobonacci()
    }
    fun listOfFobonacci(){
        var num1= 0
        var num2= 1
        var listNums = mutableListOf<Int>()
        for(x in 1..100){
            listNums.add(num1)
            var sum = num1 + num2
            num1 = num2
            num2 = sum

        }
        var display = RecyclerViewAdapter(listNums)
        binding.rvFibbo.layoutManager = LinearLayoutManager(this)
        binding.rvFibbo.adapter = display

    }
}