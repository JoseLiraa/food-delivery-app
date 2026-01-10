package com.joselira.food_delivery_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.compose.ui.platform.ViewCompositionStrategy
import android.view.View
import com.joselira.food_delivery_app.databinding.FragmentTestComposeBinding


class TestComposeFragment : Fragment(R.layout.fragment_test_compose) {


    private var _binding: FragmentTestComposeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentTestComposeBinding.bind(view)

        binding.composeView.apply {
            setViewCompositionStrategy(
                ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed
            )

            setContent {
                TestComposeScreen()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}