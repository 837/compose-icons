package compose.icons

import androidx.compose.ui.graphics.vector.VectorAsset
import compose.icons.evaicons.AllIcons
import compose.icons.evaicons.Fill
import compose.icons.evaicons.Outline
import kotlin.collections.List as ____KtList

public object EvaIcons

private var __AllIcons: ____KtList<VectorAsset>? = null

public val EvaIcons.AllIcons: ____KtList<VectorAsset>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Fill.AllIcons + Outline.AllIcons + listOf()
    return __AllIcons!!
  }
