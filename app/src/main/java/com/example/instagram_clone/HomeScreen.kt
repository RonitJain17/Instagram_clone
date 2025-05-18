package com.example.instagram_clone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram_clone.data.Story
import com.example.instagram_clone.ui.theme.storyItem

@Composable
fun HomeScreen(){

    Column(modifier= Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)){
        InstagramToolBar()
        storyItem(story = Story(userNickName = "jonDoe", userAvatar = "https://photosnow.org/wp-content/uploads/2024/04/boys-dp-for-instagram_3.jpg"))
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
