package com.ptit.zaloclone.message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ptit.zaloclone.R
import com.ptit.zaloclone.databinding.FragmentMessageBinding

const val avatar = "https://i.pinimg.com/originals/34/7f/89/347f8915007af886d2ce7c1fcbd10885.png"

class MessageFragment : Fragment() {
    private lateinit var binding: FragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = UserAdapter()
        adapter.userList.add(User("Fake Name 1", avatar, "Hello", false))
        adapter.userList.add(User("Fake Name 2", avatar, "I need to tell u something", true))
        adapter.userList.add(User("Fake Name 3", avatar, "Hello", true))
        adapter.userList.add(User("Fake Name 4", avatar, "Go to this site for 100$ free", false))
        adapter.userList.add(User("Fake Name 6", avatar, "Check this", false))
        adapter.userList.add(User("Fake Name 5", avatar, "No", true))
        adapter.userList.add(User("Fake Group 10", avatar, "Hello", false))

        binding.rvUser.adapter = adapter
        binding.rvUser.layoutManager = LinearLayoutManager(requireContext())
    }
}