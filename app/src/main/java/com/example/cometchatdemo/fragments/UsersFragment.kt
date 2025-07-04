package com.example.cometchatdemo.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.cometchat.chatuikit.shared.constants.UIKitConstants
import com.cometchat.chatuikit.users.CometChatUsers


class UsersFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val cometChatUsers = CometChatUsers(requireContext())


        Log.d("UsersFragment", "CometChatUsers view created")


        cometChatUsers.setOnTouchListener { v, event ->
            Log.d("UsersFragment", "Touch event detected: ${event.action}")
            false
        }

        return cometChatUsers
    }
}