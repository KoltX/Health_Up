package study.project.fragments.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import study.project.databinding.FragmentNameBinding

class NameFragment : Fragment() {

        private var _binding: FragmentNameBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            _binding = FragmentNameBinding.inflate(inflater, container, false)

            return binding.root
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
}