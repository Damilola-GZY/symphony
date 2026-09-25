package io.github.damilola.symphony.ui.helpers

import io.github.damilola.symphony.utils.SimpleFileSystem
import io.github.damilola.symphony.utils.SimplePath

fun SimpleFileSystem.Folder.navigateToFolder(path: SimplePath): SimpleFileSystem.Folder? {
    var folder: SimpleFileSystem.Folder? = this
    path.parts.forEach { x ->
        folder = folder?.let {
            val child = it.children[x]
            child as? SimpleFileSystem.Folder
        }
    }
    return folder
}
