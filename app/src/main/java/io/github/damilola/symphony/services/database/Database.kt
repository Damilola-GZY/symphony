package io.github.damilola.symphony.services.database

import io.github.damilola.symphony.Symphony
import io.github.damilola.symphony.services.database.store.ArtworkCacheStore
import io.github.damilola.symphony.services.database.store.LyricsCacheStore

class Database(symphony: Symphony) {
    private val cache = CacheDatabase.create(symphony)
    private val persistent = PersistentDatabase.create(symphony)

    val artworkCache = ArtworkCacheStore(symphony)
    val lyricsCache = LyricsCacheStore(symphony)
    val songCache get() = cache.songs()
    val playlists get() = persistent.playlists()
}
