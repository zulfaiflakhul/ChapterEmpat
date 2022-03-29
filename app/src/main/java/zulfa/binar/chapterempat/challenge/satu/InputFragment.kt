package zulfa.binar.chapterempat.challenge.satu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_input.*
import zulfa.binar.chapterempat.R

class InputFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_toastnama.setOnClickListener {

            val nama = et_nama.text.toString()
            Toast.makeText(requireContext(), "Selamat Datang $nama", Toast.LENGTH_LONG)
                .show()
        }

        btn_snackbarnama.setOnClickListener {

            Snackbar.make(it, "Go to Screen 2", Snackbar.LENGTH_INDEFINITE)
                .setAction("Screen 2"){
                    Navigation.findNavController(view).navigate(R.id.action_inputFragment_to_outputFragment)
                }
                .show()
        }
    }

}