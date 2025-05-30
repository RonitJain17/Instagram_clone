package com.example.instagram_clone.ui.theme.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.instagram_clone.R
import com.example.instagram_clone.data.model.Story
import com.example.instagram_clone.data.repository.stories
import com.example.instagram_clone.ui.theme.theme.spacingSmall
import com.example.instagram_clone.ui.theme.theme.storyCircleColor

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun storyItem(story: Story){

    val avatar = stringResource(id = R.string.content_description_stories,story.userNickName)

    Column(
        modifier = Modifier
            .padding(spacingSmall)
            .background(MaterialTheme.colorScheme.background)
    ){
        
        GlideImage(
            model = story.userAvatar,
            contentDescription = avatar,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxSize()
                .clip(
                    CircleShape
                )
                .border(2.dp, storyCircleColor, CircleShape),
            contentScale = ContentScale.Crop
        )
        
        Text(
            text = story.userNickName,
            modifier = Modifier.size(width = 72.dp, height = 24.dp),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
            )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun storyPreview(){
    storyItem(story = stories[0])
}