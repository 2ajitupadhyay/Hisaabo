package com.example.caladvance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.caladvance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var base = 0
        var base2: String = ""
        var result = 0
        var op: Char = ' '
        var base3 = 0
        //KEY 9
        binding.btNum9.setOnClickListener {
            base = base * 10 + 9
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 8
        binding.btNum8.setOnClickListener {
            base = base * 10 + 8
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 7
        binding.btNum7.setOnClickListener {
            base = base * 10 + 7
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 6
        binding.btNum6.setOnClickListener {
            base = base * 10 + 6
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 5
        binding.btNum5.setOnClickListener {
            base = base * 10 + 5
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 4
        binding.btNum4.setOnClickListener {
            base = base * 10 + 4
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 3
        binding.btNum3.setOnClickListener {
            base = base * 10 + 3
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 2
        binding.btNum2.setOnClickListener {
            base = base * 10 + 2
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 1
        binding.btNum1.setOnClickListener {
            base = base * 10 + 1
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //KEY 0
        binding.btNum0.setOnClickListener {
            base = base * 10 + 0
            binding.tvInput.text = "$base2$base"
            if (op == '+')
                result = base3 + base
            else if (op == '-')
                result = base3 - base
            else if (op == '*')
                result = base3 * base
            else if (op == '/')
                result = base3 / base
        }
        //+ OPERATION
        binding.btPlus.setOnClickListener {
            binding.tvInput.text = "$base2$base+"
            base2 = "$base2$base+"
            if (op != ' ') {
                base3 = result
            } else {
                base3 = base
            }
            op = '+'
            base = 0
        }

        //- OPERATION
        binding.btMinus.setOnClickListener {
            binding.tvInput.text = "$base2$base-"
            base2 = "$base2$base-"
            if (op != ' ') {
                base3 = result
            } else {
                base3 = base
            }
            op = '-'
            base = 0
        }

        //* OPERATION
        binding.btMultiply.setOnClickListener {
            binding.tvInput.text = "$base2$base*"
            base2 = "$base2$base*"
            if (op != ' ') {
                base3 = result
            } else {
                base3 = base
            }
            op = '*'
            base = 0
        }

        // '/' OPERATION
        binding.btDivide.setOnClickListener {
            binding.tvInput.text = "$base2$base/"
            base2 = "$base2$base/"
            if (op != ' ') {
                base3 = result
            } else {
                base3 = base
            }
            op = '/'
            base = 0
        }
        //EQUALS
        binding.btResult.setOnClickListener {
            binding.tvResult.text = result.toString()
            //update the new input as result  base=0
        }

        //CLEAR
        binding.btClear.setOnClickListener {
            binding.tvInput.text = "0"
            binding.tvResult.text = ""
            base2 = ""
            base = 0
            result = 0
            base3 = 0
            op = ' '
        }
    }


}