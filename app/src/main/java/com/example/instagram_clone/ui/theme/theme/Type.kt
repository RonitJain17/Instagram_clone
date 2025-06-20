package com.example.instagram_clone.ui.theme.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.instagram_clone.R

val instagramFont = FontFamily(Font(R.font.billabong))

// Set of Material typography styles to start with
fun typography(colorScheme: ColorScheme) :Typography{
    return Typography(
        bodyLarge = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = fontSmall,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp,
            color = colorScheme.onBackground
        ),
        headlineLarge = TextStyle(
            fontFamily = instagramFont,
            fontWeight = FontWeight.Normal,
            fontSize = 32.sp,
            color = colorScheme.onBackground
        )
    )
}
