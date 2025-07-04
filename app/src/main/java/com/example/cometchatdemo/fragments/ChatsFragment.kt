package com.example.cometchatdemo.fragments

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.cometchat.chatuikit.conversations.CometChatConversations


class ChatsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Loads chat conversation screen with automatic onClick navigation
        return CometChatConversations(requireContext())
    }
}
