package zulfa.binar.chapterempat.pertama

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_first.*
import zulfa.binar.chapterempat.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_toast_fra.setOnClickListener {

            Toast.makeText(requireContext(), "This is toast", Toast.LENGTH_LONG)
                .show()
        }

        btn_snackbar_fra.setOnClickListener {

            Snackbar.make(it, "Ini Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Move"){
                    Navigation.findNavController(view).navigate(R.id.action_inputFragment_to_outputFragment)
                }
                .show()
        }
    }

}