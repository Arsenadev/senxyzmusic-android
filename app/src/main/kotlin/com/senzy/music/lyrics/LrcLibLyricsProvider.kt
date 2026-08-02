/**
 * SenxyzMusic Project (C) 2026
 * Licensed under GPL-3.0 | See git history for contributors
 */

package com.senzy.music.lyrics

import android.content.Context
import com.senzy.lrclib.LrcLib
import com.senzy.music.constants.EnableLrcLibKey
import com.senzy.music.utils.dataStore
import com.senzy.music.utils.get

object LrcLibLyricsProvider : LyricsProvider {
    override val name = "LrcLib"

    override fun isEnabled(context: Context): Boolean = context.dataStore[EnableLrcLibKey] ?: true

    override suspend fun getLyrics(
        context: Context,
        id: String,
        title: String,
        artist: String,
        duration: Int,
        album: String?,
    ): Result<String> = LrcLib.getLyrics(title, artist, duration, album)

    override suspend fun getAllLyrics(
        context: Context,
        id: String,
        title: String,
        artist: String,
        duration: Int,
        album: String?,
        callback: (String) -> Unit,
    ) {
        LrcLib.getAllLyrics(title, artist, duration, album, callback)
    }
}
