<div align="center">

<img src="assets/senxyzmusic-icon.png" alt="SenxyzMusic" width="140" />

# SenxyzMusic

**A sleek YouTube Music client for Android — no ads, no subscriptions, just music.**

<br/>

[![Latest Release](https://img.shields.io/github/v/release/Arsenadev/senxyzmusic-android?style=for-the-badge&color=1FE356&labelColor=0d1117&logo=github)](https://github.com/Arsenadev/senxyzmusic-android/releases/latest)
[![Downloads](https://img.shields.io/github/downloads/Arsenadev/senxyzmusic-android/total?style=for-the-badge&color=1FE356&labelColor=0d1117)](https://github.com/Arsenadev/senxyzmusic-android/releases)
[![License](https://img.shields.io/badge/License-GPL%20v3-1FE356?style=for-the-badge&labelColor=0d1117)](LICENSE)

<br/>

[![Website](https://img.shields.io/badge/Website-senxyzmusic.biz.id-1FE356?style=flat-square&labelColor=0d1117)](https://www.senxyzmusic.biz.id)
[![WhatsApp Channel](https://img.shields.io/badge/WhatsApp-Channel-25D366?style=flat-square&logo=whatsapp&logoColor=white&labelColor=0d1117)](https://whatsapp.com/channel/0029VbCyzd99Bb5sXWGwGE29)
[![TikTok](https://img.shields.io/badge/TikTok-@xsenafvck-black?style=flat-square&logo=tiktok&labelColor=0d1117)](https://tiktok.com/@xsenafvck)

<br/>

[**Download APK**](#-download) · [**Features**](#-features) · [**Build**](#-build-from-source) · [**Credits**](#-credits)

</div>

---

## ✨ Features

### Playback & Audio
- Stream any song, album, or playlist from YouTube Music
- Background playback with lockscreen controls
- Download & cache tracks for offline listening
- 10-band equalizer with AutoEQ profiles
- Audio normalization, crossfade, skip silence
- Sleep timer, tempo & pitch control

### Lyrics & AI
- Live synced lyrics (LRCLib, KuGou, BetterLyrics, Paxsenix)
- **AI lyrics translation** — multi-provider (OpenRouter, OpenAI, Claude, Gemini, XAi, Mistral, Perplexity, DeepL, Custom)
- **AI song summary** — get a short, AI-generated insight about any track
- **AI song recommendations** — describe a mood and get a curated queue (sparkle button on home)

### Library & Account
- Full YouTube Music account sync
- Import / export playlists (M3U, CSV)
- Local file playback
- Podcast support
- Backup & restore

### Interface
- Dynamic album-art color theming
- Material 3 design with 19+ color palettes
- Pure black AMOLED mode
- Home screen widgets (player, turntable, music recognizer, playlists)
- Android Auto support
- Slim & compact navigation options

### Recognition & Scrobbling
- Music recognition via ShazamKit
- Last.fm scrobbling
- Listen Together (coming soon)
- Discord Rich Presence (GMS build)

---

## 📥 Download

| Build | Description | Link |
|---|---|---|
| **FOSS** | Lightweight, no proprietary deps | [Latest Release](https://github.com/Arsenadev/senxyzmusic-android/releases/latest) |

> [!NOTE]
> YouTube Music must be available in your region. If not, use a VPN pointed to a supported country.

---

## 🔨 Build from Source

**Requirements:** JDK 17+, Android SDK (compileSdk 37)

```bash
# Clone
git clone https://github.com/Arsenadev/senxyzmusic-android.git
cd senxyzmusic-android

# FOSS debug build (recommended)
./gradlew :app:assembleFossDebug

# Output
app/build/outputs/apk/foss/debug/app-foss-debug.apk
```

### Flavors

| Flavor | Cast | Discord RPC | Updater |
|--------|------|-------------|---------|
| `foss` | — | — | ✓ |
| `gms` | ✓ | ✓ | ✓ |
| `izzy` | — | — | — |

---

## 🏆 Credits

**Developed & maintained by [Arsenadev](https://github.com/Arsenadev) (xsenzy)**

### Upstream

- **[InnerTune](https://github.com/z-huang/InnerTune)** by Z-Huang — the original YouTube Music client this whole lineage is built on
- **[Metrolist](https://github.com/MetrolistGroup/Metrolist)** — fork base
- Rebranded from an earlier community fork, used with permission from the original maintainer

### Libraries & Services

- **Media3 / ExoPlayer** — playback engine
- **Jetpack Compose & Material 3** — UI
- **InnerTube parser** — YouTube Music API client
- **LRCLib · KuGou · Better Lyrics · Paxsenix** — lyrics providers
- **ShazamKit** — music recognition
- **Last.fm API** — scrobbling

Thank you to all original contributors and the open-source community.

---

<div align="center">

**SenxyzMusic** is not affiliated with YouTube, Google LLC, or any music labels.<br/>
All trademarks belong to their respective owners.

<br/>

Made with ♥ by **xsenzy** · [senxyzmusic.biz.id](https://www.senxyzmusic.biz.id)

</div>
