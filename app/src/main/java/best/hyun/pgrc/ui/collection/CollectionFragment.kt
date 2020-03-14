package best.hyun.pgrc.ui.collection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import best.hyun.pgrc.R

class CollectionFragment : Fragment() {

    private lateinit var dashboardViewModel: CollectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(CollectionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_collection, container, false)

        val textView: TextView = root.findViewById(R.id.edit_kind_pet_collection)
        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })



        return root
    }
}