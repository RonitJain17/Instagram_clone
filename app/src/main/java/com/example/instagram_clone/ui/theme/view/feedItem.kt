package com.example.instagram_clone.ui.theme.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.instagram_clone.R
import com.example.instagram_clone.data.model.Feed
import com.example.instagram_clone.ui.theme.theme.spacingLarge
import com.example.instagram_clone.ui.theme.theme.spacingMedium
import com.example.instagram_clone.ui.theme.theme.spacingSmall

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FeedItem(feed: Feed){

    val userAvatarDesc = "Avatar Description"
    val feedImageDesc = "Image Description"

    val likedIcon = R.drawable.ic_liked
    val likeIcon = R.drawable.ic_notification
    val messageIcon = R.drawable.ic_message
    val bookIcon = R.drawable.ic_bookmark
    val commentIcon = R.drawable.ic_comment

    val iconsColor = MaterialTheme.colorScheme.onBackground
    var isLiked by rememberSaveable{ mutableStateOf(false) }
    val likedColor = if(isLiked) Color.Red else iconsColor

    Column(modifier = Modifier.background(MaterialTheme.colorScheme.background)){

        Row(
            modifier = Modifier
                .padding(horizontal = spacingSmall)
                .padding(top = spacingLarge)
        ){

            GlideImage(
                model = feed.userAvatar,
                contentDescription = userAvatarDesc,
                modifier = Modifier
                    .size(36.dp)
                    .fillMaxSize()
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
                )

            Column {
                Text(text = feed.userNickName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = spacingMedium),
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start
                )
                
                Text(text = feed.localName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = spacingMedium),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start
                )
            }
        }

        GlideImage(
            model = feed.imageUrl,
            contentDescription = feedImageDesc,
            modifier = Modifier
                .padding(top = spacingLarge)
                .height(256.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(start = spacingMedium, top = spacingLarge)
        ){

            feedIcon(
                icon = if(isLiked) likedIcon else likeIcon,
                contentDescription = "Like Icon",
                color = likedColor
            ){
                isLiked = !isLiked
            }
            feedIcon(icon = commentIcon, contentDescription = "CommentIcon", color = iconsColor){
                //TODO comment drawer
            }
            feedIcon(icon = messageIcon, contentDescription = "Message Icon", color = iconsColor){
                //TODO message screen navigation
            }

            Image(
                painter = painterResource(id = bookIcon),
                contentDescription = "" ,
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge)
                    .weight(1f)
                    .wrapContentWidth(align = Alignment.End),
                colorFilter = ColorFilter.tint(iconsColor)
                )

        }

        Row(
            modifier = Modifier
                .padding(horizontal = spacingSmall)
                .padding(top = spacingLarge)
        ){

            val description = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)){
                    append(feed.userNickName)
                }
                append(" ")
                append(feed.description)
            }

            Text(
                text = description,
                modifier = Modifier.padding(horizontal = spacingMedium),
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start
            )
        }
        
        Text(
            text = feed.postedAgo,
            modifier = Modifier.padding(start = 12.dp, top = spacingSmall),
            maxLines = 1,
            color = Color.Gray,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Start
        )
    }
}

@Composable
fun feedIcon(
    @DrawableRes icon:Int,
    contentDescription : String,
    color : Color,
    onClick : () -> Unit
){

    Image(
        painter = painterResource(id = icon),
        contentDescription = contentDescription ,
        modifier = Modifier
            .size(40.dp)
            .padding(end = spacingLarge)
            .clickable { onClick() },
        colorFilter = ColorFilter.tint(color)
    )

}

@Preview(showBackground = true)
@Composable
fun feedPreview(){
    FeedItem(feed = Feed(
        userNickName = "jonDoe",
        localName = "Brasil",
        userAvatar = "",
        imageUrl = "",
        description = "",
        postedAgo = "2 Days Ago"
    ))
}