package io.github.damilola.symphony.services.database.store

import io.github.damilola.symphony.Symphony
import io.github.damilola.symphony.services.database.adapters.SQLiteKeyValueDatabaseAdapter

class LyricsCacheStore(val symphony: Symphony) {
    private val adapter = SQLiteKeyValueDatabaseAdapter(
        SQLiteKeyValueDatabaseAdapter.Transformer.AsString(),
        SQLiteKeyValueDatabaseAdapter.CacheOpenHelper(symphony.applicationContext, "lyrics", 1)
    )

    fun get(key: String) = adapter.get(key)
    fun put(key: String, value: String) = adapter.put(key, value)
    fun delete(key: String) = adapter.delete(key)
    fun delete(keys: Collection<String>) = adapter.delete(keys)
    fun keys() = adapter.keys()
    fun all() = adapter.all()
    fun clear() = adapter.clear()
}
