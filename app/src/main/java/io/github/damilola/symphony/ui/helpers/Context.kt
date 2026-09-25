package io.github.damilola.symphony.ui.helpers

import androidx.navigation.NavHostController
import io.github.damilola.symphony.MainActivity
import io.github.damilola.symphony.Symphony

data class ViewContext(
    val symphony: Symphony,
    val activity: MainActivity,
    val navController: NavHostController,
) {
    companion object {
        fun <T> parameterizedFn(fn: (ViewContext) -> T) = fn
    }
}
