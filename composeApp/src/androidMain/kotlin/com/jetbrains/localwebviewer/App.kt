package com.jetbrains.localwebviewer

import android.view.ViewGroup
import android.webkit.WebView
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.viewinterop.AndroidView
import org.jetbrains.compose.ui.tooling.preview.Preview

import localwebviewer.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        val uri = Res.getUri("files/webview/index.html")

        // Adding a WebView inside AndroidView
        // with layout as full screen
        AndroidView(factory = {
            WebView(it).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
            }
        }, update = {
            it.loadUrl(uri)
        })
    }
}