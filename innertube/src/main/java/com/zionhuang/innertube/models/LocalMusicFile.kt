package com.zionhuang.innertube.models

data class LocalMusicFile (
    val fileName: String,
    val filePath: String,
    val artist: String?,
    val album: String?,
    val duration: Int
    )