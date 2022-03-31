package zulfa.binar.chapterempat.kedua.tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_tugas.*
import kotlinx.android.synthetic.main.fragment_alert_dialog_tugas.*
import zulfa.binar.chapterempat.R
import kotlinx.android.synthetic.main.fragment_alert_dialog_tugas.tv_total as tv_total1

class AlertDialogTugas : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alert_dialog_tugas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}