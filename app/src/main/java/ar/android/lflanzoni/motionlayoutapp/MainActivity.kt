package ar.android.lflanzoni.motionlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ar.android.lflanzoni.motionlayoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //binding.motionLayout.transitionToEnd()


    }

    override fun onResume() {
        super.onResume()

    }
}