package io.github.damilola.symphony.utils

fun String.withCase(sensitive: Boolean) = if (!sensitive) lowercase() else this
