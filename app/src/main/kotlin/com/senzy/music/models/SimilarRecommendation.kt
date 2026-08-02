/**
 * SenxyzMusic Project (C) 2026
 * Licensed under GPL-3.0 | See git history for contributors
 */

package com.senzy.music.models

import com.senzy.innertube.models.YTItem
import com.senzy.music.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
